package com.eng2.assessment.vm.controllers;

import static com.eng2.assessment.vm.utils.UserEntityUtils.*;
import static com.eng2.assessment.vm.utils.VideoEntityUtils.*;

import com.eng2.assessment.vm.repositories.HashtagRepository;
import com.eng2.assessment.vm.repositories.UsersRepository;
import com.eng2.assessment.vm.repositories.VideosRepository;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;
import jakarta.annotation.Nullable;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import java.net.URI;
import java.time.Instant;
import java.util.*;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vm.api.IVideosClient;
import vm.domain.Hashtag;
import vm.domain.User;
import vm.domain.Video;
import vm.dto.VideoDTO;
import vm.dto.VideoInteractionDetailsDTO;
import vm.dto.VideoResultsDTO;
import vm.events.VideoInteractionProducer;

@Controller("/videos")
public class VideosController implements IVideosClient {
  @Inject private VideosRepository videoRepo;
  @Inject private UsersRepository userRepo;
  @Inject private HashtagRepository hashtagRepo;
  @Inject private VideoInteractionProducer producer;
  private static final Logger logger = LoggerFactory.getLogger(VideosController.class);

  @Get("/")
  public VideoResultsDTO list(
      @Nullable @QueryValue String author, @Nullable @QueryValue String hashtag) {
    logger.info(author);
    logger.info(hashtag);

    List<Video> videos;

    if (author != null && hashtag == null) {
      videos = videoRepo.findAllByAuthorUsernameEquals(author);
    } else if (author == null && hashtag != null) {
      videos = videoRepo.filterByHashtag(hashtag);
    } else if (author != null && hashtag != null) {
      videos = videoRepo.filterByAuthorAndHashtag(author, hashtag);
    } else {
      videos = videoRepo.findAll();
    }
    return convertEntityList(videos);
  }

  @Get("/{id}")
  public Video getVideo(
      UUID id, @Nullable @QueryValue String author, @Nullable @QueryValue String hashtag) {
    Optional<Video> result;
    if (author != null && hashtag == null) {
      result = videoRepo.findByIdAndAuthorUsernameEquals(id, author);
    } else if (author == null && hashtag != null) {
      result = videoRepo.findByIdAndHashtagsId(id, hashtag);
    } else if (author != null && hashtag != null) {
      result = videoRepo.findByIdAndAuthorUsernameEqualsAndHashtagsId(id, author, hashtag);
    } else {
      result = videoRepo.findById(id);
    }

    return result.orElse(null);
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
    if (videoDetails.hashtagNames() == null || videoDetails.hashtagNames().isEmpty()) {
      return HttpResponse.badRequest("Please specify one or more hashtags for your video");
    }

    List<String> unsafeHashtags =
        videoDetails.hashtagNames().stream()
            .filter(it -> !it.matches("^[a-zA-Z0-9]+$"))
            .toList(); // filter out hashtags that are empty strings or contain unsafe
    // (non-alphanumeric) characters

    if (!unsafeHashtags.isEmpty()) {
      return HttpResponse.badRequest(
          String.format(
              "One or more hashtags contained unsafe characters. Offending hashtags are: %s",
              unsafeHashtags));
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
    newVideo.setPublishedAt(Instant.now());
    newVideo.setTitle(videoDetails.title());
    newVideo.setAuthor(author);
    newVideo.setHashtags(allHashtags);

    videoRepo.save(newVideo);
    producer.produceVideoPostedMessage(
        newVideo.getId(),
        new VideoInteractionDetailsDTO(
            newVideo.getTitle(), getHashtagIds(newVideo), author.getUsername()));

    return HttpResponse.created(URI.create("/videos/" + newVideo.getId()))
        .body(String.format("Created video with ID " + newVideo.getId()));
  }

  /** Like a video with a given ID Updates the like count */
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

    if (hasUserLikedVideo(user, id)) {
      return HttpResponse.badRequest(
          String.format(
              "User %s has already liked the video with title %s", userName, video.getTitle()));
    }

    incrementLikeCount(video);
    addLikedVideo(user, video);
    logger.info(String.format("User %s liked the video with title %s", userName, video.getTitle()));
    videoRepo.update(video);
    userRepo.update(user);
    producer.produceVideoLikedMessage(
        video.getId(),
        new VideoInteractionDetailsDTO(video.getTitle(), getHashtagIds(video), userName));
    return HttpResponse.ok(String.format("Video with title %s liked", video.getTitle()));
  }

  /** Dislike a video with a given ID Updates the like count */
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

    if (hasUserDislikedVideo(user, id)) {
      return HttpResponse.badRequest(
          String.format(
              "User %s has already disliked the video with title %s", userName, video.getTitle()));
    }

    incrementDislikeCount(video);
    addDislikedVideo(user, video);
    logger.info(
        String.format("User %s disliked the video with title %s", userName, video.getTitle()));
    videoRepo.update(video);
    userRepo.update(user);
    producer.produceVideoDislikedMessage(
        video.getId(),
        new VideoInteractionDetailsDTO(video.getTitle(), getHashtagIds(video), userName));
    return HttpResponse.ok(String.format("Video with title %s disliked", video.getTitle()));
  }

  /**
   * Marks a video with the given id as watched by the user with hte given username. Updates the
   * view count.
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

    incrementViewCount(video);
    if (!hasUserWatchedVideo(user, id)) {
      logger.info(
          String.format(
              "User with username %s has watched video with title %s for the first time. Adding link...",
              userName, video.getTitle()));
      addViewedVideo(user, video);
      userRepo.update(user);
    }
    logger.info(
        String.format("User %s viewed the video with title %s", userName, video.getTitle()));
    videoRepo.update(video);
    producer.produceVideoViewedMessage(
        video.getId(),
        new VideoInteractionDetailsDTO(video.getTitle(), getHashtagIds(video), userName));
    return HttpResponse.ok(String.format("Video with title %s viewed", video.getTitle()));
  }
}
