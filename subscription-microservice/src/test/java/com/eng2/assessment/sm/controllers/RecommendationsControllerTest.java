package com.eng2.assessment.sm.controllers;

import static org.assertj.core.api.Assertions.assertThat;

import com.eng2.assessment.sm.domain.Hashtag;
import com.eng2.assessment.sm.domain.User;
import com.eng2.assessment.sm.domain.Video;
import com.eng2.assessment.sm.repositories.HashtagRepository;
import com.eng2.assessment.sm.repositories.UserRepository;
import com.eng2.assessment.sm.repositories.VideoRepository;
import com.eng2.assessment.sm.utils.DbCleanupExtension;
import com.eng2.assessment.sm.utils.RecommendationsClient;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import java.util.*;
import java.util.stream.IntStream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@MicronautTest(transactional = false)
@ExtendWith(DbCleanupExtension.class)
public class RecommendationsControllerTest {
  @Inject UserRepository userRepo;
  @Inject VideoRepository videoRepo;
  @Inject HashtagRepository hashtagRepo;
  @Inject RecommendationsClient client;

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

    List<Video> result = client.getRecommendations("ZooLover", "Zoo");

    assertThat(result)
        .isNotNull()
        .hasSize(10)
        .isSortedAccordingTo(Comparator.comparing(Video::getViewCount).reversed())
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

    List<Video> videos =
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

    videoRepo.saveAll(videos);

    List<Video> result = client.getRecommendations("ZooLover", "Zoo");

    assertThat(result)
        .isNotNull()
        .hasSize(8)
        .isSortedAccordingTo(Comparator.comparing(Video::getViewCount).reversed())
        .allMatch(it -> it.hashtagNames().contains("Zoo"))
        .noneMatch(
            it ->
                Integer.parseInt(it.getTitle().split(" ")[1])
                    > 7); // user has watched video 8 onwards
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

    List<Video> videos =
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

    videoRepo.saveAll(videos);

    List<Video> result = client.getRecommendations("ZooLover", "Zoo");

    assertThat(result)
        .isNotNull()
        .hasSize(8)
        .isSortedAccordingTo(Comparator.comparing(Video::getViewCount).reversed())
        .allMatch(it -> it.hashtagNames().contains("Zoo"))
        .noneMatch(
            it ->
                Integer.parseInt(it.getTitle().split(" ")[1])
                    > 7); // Video 8 onwards are tagged with #Other
  }
}
