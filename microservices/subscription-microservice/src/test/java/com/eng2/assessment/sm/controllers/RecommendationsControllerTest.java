package com.eng2.assessment.sm.controllers;

import static org.assertj.core.api.Assertions.assertThat;

import com.eng2.assessment.sm.repositories.HashtagRepository;
import com.eng2.assessment.sm.repositories.UserRepository;
import com.eng2.assessment.sm.repositories.VideoRepository;
import com.eng2.assessment.sm.utils.DbCleanupExtension;
import com.eng2.assessment.sm.utils.RecommendationsClient;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.serde.ObjectMapper;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import java.util.*;
import java.util.stream.IntStream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import sm.domain.Hashtag;
import sm.domain.User;
import sm.domain.Video;
import sm.dto.VideoDTO;
import sm.dto.VideoRecommendationDTO;

@MicronautTest(transactional = false)
@ExtendWith(DbCleanupExtension.class)
public class RecommendationsControllerTest {
  @Inject UserRepository userRepo;
  @Inject VideoRepository videoRepo;
  @Inject HashtagRepository hashtagRepo;
  @Inject RecommendationsClient client;
  @Inject ObjectMapper objectMapper;

  @Test
  public void givesRecommendations() {
    Hashtag hashtag = new Hashtag();
    hashtag.setName("Zoo");
    hashtagRepo.save(hashtag);

    Hashtag otherHashtag = new Hashtag();
    otherHashtag.setName("other");
    hashtagRepo.save(otherHashtag);

    User viewer = new User();
    viewer.setUserName("other");
    viewer.setSubscriptions(Set.of(hashtag));
    userRepo.save(viewer);

    IntStream.range(0, 15)
        .forEach(
            it -> {
              Video video = new Video();
              video.setId(UUID.randomUUID());
              video.setTitle("Video " + it);
              video.setViewCount((long) it);
              video.setHashtags(Set.of(hashtag, otherHashtag));
              video.setViewers(it > 5 ? Collections.emptySet() : Set.of(viewer));
              videoRepo.save(video);
            });

    User user = new User();
    user.setUserName("ZooLover");
    user.setSubscriptions(Set.of(hashtag));
    userRepo.save(user);

    HttpResponse<VideoRecommendationDTO> result = client.getRecommendations("ZooLover", "Zoo");

    assertThat(result.getStatus().getCode()).isEqualTo(HttpStatus.OK.getCode());

    List<VideoDTO> videos = result.body().result();

    assertThat(videos)
        .isNotNull()
        .hasSize(10)
        .isSortedAccordingTo(Comparator.comparing(VideoDTO::viewCount).reversed())
        .allMatch(it -> it.hashtagNames().contains("Zoo"));
  }

  @Test
  @DisplayName("Excludes videos that the user has already viewed")
  public void excludesViewedVideos() {
    Hashtag hashtag = new Hashtag();
    hashtag.setName("Zoo");
    hashtagRepo.save(hashtag);

    User viewer = new User();
    viewer.setUserName("other");
    viewer.setSubscriptions(Set.of(hashtag));
    userRepo.save(viewer);

    User user = new User();
    user.setUserName("ZooLover");
    user.setSubscriptions(Set.of(hashtag));
    userRepo.save(user);

    User otherUser = new User();
    otherUser.setUserName("third");
    otherUser.setSubscriptions(Set.of(hashtag));
    userRepo.save(otherUser);

    List<Video> videosToSave =
        IntStream.range(0, 15)
            .mapToObj(
                it -> {
                  Video video = new Video();
                  video.setId(UUID.randomUUID());
                  video.setTitle("Video " + it);
                  video.setViewCount((long) it);
                  video.setHashtags(Set.of(hashtag));
                  video.setViewers(
                      it > 7 ? Set.of(user, viewer, otherUser) : Set.of(viewer, otherUser));
                  return video;
                })
            .toList();

    videoRepo.saveAll(videosToSave);

    HttpResponse<VideoRecommendationDTO> result = client.getRecommendations("ZooLover", "Zoo");

    assertThat(result.getStatus().getCode()).isEqualTo(HttpStatus.OK.getCode());

    List<VideoDTO> videos = result.body().result();

    assertThat(videos)
        .isNotNull()
        .hasSize(8)
        .isSortedAccordingTo(Comparator.comparing(VideoDTO::viewCount).reversed())
        .allMatch(it -> it.hashtagNames().contains("Zoo"))
        .noneMatch(
            it ->
                Integer.parseInt(it.title().split(" ")[1]) > 7); // user has watched video 8 onwards
  }

  @Test
  @DisplayName("Excludes videos that are not tagged with the hashtag the user is subscribed to")
  public void excludesOtherHashtags() {
    Hashtag hashtag = new Hashtag();
    hashtag.setName("Zoo");
    hashtagRepo.save(hashtag);

    Hashtag otherHashtag = new Hashtag();
    otherHashtag.setName("Other");
    hashtagRepo.save(otherHashtag);

    User user = new User();
    user.setUserName("ZooLover");
    user.setSubscriptions(Set.of(hashtag));
    userRepo.save(user);

    List<Video> videosToSave =
        IntStream.range(0, 15)
            .mapToObj(
                it -> {
                  Video video = new Video();
                  video.setId(UUID.randomUUID());
                  video.setTitle("Video " + it);
                  video.setViewCount((long) it);
                  video.setHashtags(Set.of(it > 7 ? otherHashtag : hashtag));
                  video.setViewers(Collections.emptySet());
                  return video;
                })
            .toList();

    videoRepo.saveAll(videosToSave);

    HttpResponse<VideoRecommendationDTO> result = client.getRecommendations("ZooLover", "Zoo");

    assertThat(result.getStatus().getCode()).isEqualTo(HttpStatus.OK.getCode());

    List<VideoDTO> videos = result.body().result();

    assertThat(videos)
        .isNotNull()
        .hasSize(8)
        .isSortedAccordingTo(Comparator.comparing(VideoDTO::viewCount).reversed())
        .allMatch(it -> it.hashtagNames().contains("Zoo"))
        .noneMatch(
            it ->
                Integer.parseInt(it.title().split(" ")[1])
                    > 7); // Video 8 onwards are tagged with #Other
  }

  @Test
  public void handlesUnknownUser() {
    Hashtag hashtag = new Hashtag();
    hashtag.setName("Zoo");
    hashtagRepo.save(hashtag);

    HttpResponse<VideoRecommendationDTO> result = client.getRecommendations("UnknownUser", "Zoo");

    assertThat(result.getStatus().getCode()).isEqualTo(HttpStatus.NOT_FOUND.getCode());
    assertThat(result.body().errorMessage()).isNotNull().contains("Could not find user");
  }

  @Test
  public void handlesUnknownHashtag() {
    User user = new User();
    user.setUserName("ZooLover");
    user.setSubscriptions(Collections.emptySet());
    userRepo.save(user);

    HttpResponse<VideoRecommendationDTO> result =
        client.getRecommendations("ZooLover", "UnknownHashtag");

    assertThat(result.getStatus().getCode()).isEqualTo(HttpStatus.NOT_FOUND.getCode());
    assertThat(result.body().errorMessage()).isNotNull().contains("Could not find hashtag");
  }

  @Test
  public void handlesUserNotSubscribed() {
    Hashtag hashtag = new Hashtag();
    hashtag.setName("Zoo");
    hashtagRepo.save(hashtag);

    User user = new User();
    user.setUserName("ZooLover");
    user.setSubscriptions(Collections.emptySet());
    userRepo.save(user);

    HttpResponse<VideoRecommendationDTO> result = client.getRecommendations("ZooLover", "Zoo");

    assertThat(result.getStatus().getCode()).isEqualTo(HttpStatus.BAD_REQUEST.getCode());
    assertThat(result.body().errorMessage())
        .isNotNull()
        .contains("User", "is not subscribed to hashtag");
  }
}
