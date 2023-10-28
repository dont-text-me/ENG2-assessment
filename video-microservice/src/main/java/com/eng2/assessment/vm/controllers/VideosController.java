package com.eng2.assessment.vm.controllers;

import com.eng2.assessment.vm.domain.Hashtag;
import com.eng2.assessment.vm.domain.User;
import com.eng2.assessment.vm.domain.Video;
import com.eng2.assessment.vm.dto.VideoDTO;
import com.eng2.assessment.vm.repositories.HashtagRepository;
import com.eng2.assessment.vm.repositories.UsersRepository;
import com.eng2.assessment.vm.repositories.VideosRepository;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;
import jakarta.annotation.Nullable;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import java.net.URI;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.*;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller("/videos")
public class VideosController {
  @Inject private VideosRepository videoRepo;
  @Inject private UsersRepository userRepo;
  @Inject private HashtagRepository hashtagRepo;
  private static final Logger logger = LoggerFactory.getLogger(VideosController.class);

  @Get("/")
  @Transactional
  public Iterable<Video> list(
      @Nullable @QueryValue String author, @Nullable @QueryValue String hashtag) {
    logger.info(author);
    logger.info(hashtag);

    if (author != null && hashtag == null) {
      return videoRepo.findAllByAuthorUsernameEquals(author);
    } else if (author == null && hashtag != null) {
      return videoRepo.findByHashtagsId(hashtag);
    } else if (author != null && hashtag != null) {
      return videoRepo.findByAuthorUsernameEqualsAndHashtagsId(author, hashtag);
    } else {
      return videoRepo.findAll();
    }
  }

  @Get("/{id}")
  public Video getVideo(UUID id) {
    return videoRepo.findById(id).orElse(null);
  }
  /**
   * Publish a new video.
   *
   * @param videoDetails the details of the video, containing:
   *     <ul>
   *       <li>The username of the author
   *       <li>The title of the video (Note: uniqueness not enforced, videos have a unique ID
   *           instead)
   *       <li>The list of hashtags that the video is tagged with. Any unknown hashtags will be
   *           added to the database.
   *     </ul>
   */
  @Post("/")
  @Transactional
  public HttpResponse<String> publish(@Body VideoDTO videoDetails) {
    // Check if author is valid (must already exist)
    User author = userRepo.findByUsernameEqual(videoDetails.authorUsername()).orElse(null);
    if (author == null) {
      return HttpResponse.notFound(
          "Could not find author with username " + videoDetails.authorUsername());
    }
    // Check if any hashtags in the video DTO are missing from the database and add
    Set<Hashtag> hashtagsToCreate =
        videoDetails.hashtagNames().stream()
            .filter(it -> !hashtagRepo.existsById(it))
            .map(
                it -> {
                  Hashtag h = new Hashtag();
                  h.setId(it);
                  return h;
                })
            .collect(Collectors.toSet());
    if (!hashtagsToCreate.isEmpty()) {
      logger.info(
          String.format(
              "Hashtags %s not found. Creating...",
              hashtagsToCreate.stream().map(Hashtag::getId).collect(Collectors.toSet())));
      hashtagRepo.saveAll(hashtagsToCreate);
    }
    Set<Hashtag> allHashtags = new HashSet<>(hashtagRepo.findByIdIn(videoDetails.hashtagNames()));

    // Store new video to database
    Video newVideo = new Video();
    newVideo.setPublishedAt(Timestamp.from(Instant.now()));
    newVideo.setTitle(videoDetails.title());
    newVideo.setAuthor(author);
    newVideo.setHashtags(allHashtags);

    videoRepo.save(newVideo);

    return HttpResponse.created(URI.create("/videos/" + newVideo.getId()))
        .body(String.format("Created video with ID " + newVideo.getId()));
  }

  /**
   * Like a video with a given ID Updates the like count, TODO: sends message to the kafka cluster
   * with the username of the person who liked it.
   */
  @Put("/{id}/like")
  @Transactional
  public HttpResponse<String> likeVideo(UUID id, @Body String userName) {
    User user = userRepo.findByUsernameEqual(userName).orElse(null);
    if (user == null) {
      return HttpResponse.notFound("Could not find user with username " + userName);
    }

    Video video = videoRepo.findById(id).orElse(null);
    if (video == null) {
      return HttpResponse.notFound("Could not find video with id " + id);
    }

    video.incrementLikeCount();
    logger.info(String.format("User %s liked the video with title %s", userName, video.getTitle()));
    videoRepo.update(video);
    return HttpResponse.ok(String.format("Video with title %s liked", video.getTitle()));
  }

  /**
   * Dislike a video with a given ID Updates the like count, TODO: sends message to the kafka
   * cluster with the username of the person who disliked it.
   */
  @Put("/{id}/dislike")
  @Transactional
  public HttpResponse<String> dislikeVideo(UUID id, @Body String userName) {
    User user = userRepo.findByUsernameEqual(userName).orElse(null);
    if (user == null) {
      return HttpResponse.notFound("Could not find user with username " + userName);
    }

    Video video = videoRepo.findById(id).orElse(null);
    if (video == null) {
      return HttpResponse.notFound("Could not find video with id " + id);
    }

    video.decrementLikeCount();
    logger.info(
        String.format("User %s disliked the video with title %s", userName, video.getTitle()));
    videoRepo.update(video);
    return HttpResponse.ok(String.format("Video with title %s disliked", video.getTitle()));
  }

  /**
   * Marks a video with the given id as watched by the user with hte given username. Updates the
   * view count, TODO: sends message to the kafka cluster with the username of the person who viewed
   * it.
   */
  @Put("/{id}/watch")
  @Transactional
  public HttpResponse<String> watchVideo(UUID id, @Body String userName) {
    User user = userRepo.findByUsernameEqual(userName).orElse(null);
    if (user == null) {
      return HttpResponse.notFound("Could not find user with username " + userName);
    }

    Video video = videoRepo.findById(id).orElse(null);
    if (video == null) {
      return HttpResponse.notFound("Could not find video with id " + id);
    }

    video.incrementViewCount();
    if (!user.hasWatchedVideo(video.getId())) {
      logger.info(
          String.format(
              "User with username %s has watched video with title %s for the first time. Adding link...",
              userName, video.getTitle()));
      user.addViewedVideo(video);
      userRepo.update(user);
    }
    logger.info(
        String.format("User %s viewed the video with title %s", userName, video.getTitle()));
    videoRepo.update(video);
    return HttpResponse.ok(String.format("Video with title %s viewed", video.getTitle()));
  }
}
