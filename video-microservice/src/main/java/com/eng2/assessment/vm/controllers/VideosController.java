package com.eng2.assessment.vm.controllers;

import com.eng2.assessment.vm.domain.Hashtag;
import com.eng2.assessment.vm.domain.User;
import com.eng2.assessment.vm.domain.Video;
import com.eng2.assessment.vm.dto.VideoDTO;
import com.eng2.assessment.vm.repositories.HashtagRepository;
import com.eng2.assessment.vm.repositories.UsersRepository;
import com.eng2.assessment.vm.repositories.VideosRepository;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import jakarta.inject.Inject;
import java.net.URI;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.*;
import java.util.stream.Collectors;

@Controller("/videos")
public class VideosController {
  @Inject private VideosRepository videoRepo;
  @Inject private UsersRepository userRepo;
  @Inject private HashtagRepository hashtagRepo;

  @Get("/")
  public Iterable<Video> list() {
    return videoRepo.findAll();
  }

  @Get("/{id}")
  public Video getVideo(UUID id) {
    return videoRepo.findById(id).orElse(null);
  }

  @Post("/")
  public HttpResponse<String> publish(@Body VideoDTO videoDetails) {
    User author = userRepo.findByUsernameEqual(videoDetails.authorUsername()).orElse(null);
    if (author == null) {
      return HttpResponse.notFound(
          "Could not find author with username " + videoDetails.authorUsername());
    }
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
    System.out.println(hashtagsToCreate);
    if (!hashtagsToCreate.isEmpty()) {
      System.out.println("Storing new hashtags " + hashtagsToCreate.stream().map(Hashtag::getId));
      hashtagRepo.saveAll(hashtagsToCreate);
    }
    Set<Hashtag> allHashtags = new HashSet<>(hashtagRepo.findByIdIn(videoDetails.hashtagNames()));
    Video newVideo = new Video();
    newVideo.setPublishedAt(Timestamp.from(Instant.now()));
    newVideo.setTitle(videoDetails.title());
    newVideo.setAuthor(author);
    newVideo.setHashtags(allHashtags);

    videoRepo.save(newVideo);

    return HttpResponse.created(URI.create("/videos/" + newVideo.getId()));
  }
}
