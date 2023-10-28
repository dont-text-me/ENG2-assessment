package com.eng2.assessment.vm.controllers;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import com.eng2.assessment.vm.domain.Hashtag;
import com.eng2.assessment.vm.domain.User;
import com.eng2.assessment.vm.domain.Video;
import com.eng2.assessment.vm.dto.VideoDTO;
import com.eng2.assessment.vm.repositories.HashtagRepository;
import com.eng2.assessment.vm.repositories.UsersRepository;
import com.eng2.assessment.vm.repositories.VideosRepository;
import com.eng2.assessment.vm.utils.DbCleanupExtension;
import com.eng2.assessment.vm.utils.VideosClient;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@MicronautTest(transactional = false)
@ExtendWith(DbCleanupExtension.class)
public class VideosControllerTest {
  @Inject private VideosClient client;
  @Inject private VideosRepository videoRepo;
  @Inject private UsersRepository userRepo;
  @Inject private HashtagRepository hashtagRepo;

  @Nested
  @DisplayName("retrieve video tests")
  class GetVideoTest {
    @Test
    public void whenNoVideo() {
      Video result = client.getVideo(UUID.randomUUID(), null, null);
      assertThat(result).isNull();
    }

    @Test
    public void findsById() {
      Video video = new Video();
      video.setTitle("Me at the zoo");
      videoRepo.save(video);

      Video result = client.getVideo(video.getId(), null, null);

      assertThat(result)
          .isNotNull()
          .satisfies(it -> assertThat(it.getTitle()).isEqualTo(video.getTitle()))
          .satisfies(it -> assertThat(it.getLikeCount()).isEqualTo(video.getLikeCount()));
    }

    @Test
    public void findsByIdAndAuthor(){
      User author = new User();
      author.setUsername("ZooLover");
      userRepo.save(author);
      Video video = new Video();
      video.setTitle("Me at the zoo");
      video.setAuthor(author);
      videoRepo.save(video);

      Video otherVideo = new Video();
      otherVideo.setTitle("Me at the park");
      videoRepo.save(otherVideo); // should not be returned

      Video result = client.getVideo(video.getId(), author.getUsername(), null);

      assertThat(result)
              .isNotNull()
              .satisfies(it -> assertThat(it.getTitle()).isEqualTo(video.getTitle()))
              .satisfies(it -> assertThat(it.getLikeCount()).isEqualTo(video.getLikeCount()));
    }

    @Test
    public void findsByIdAndHashtag(){
      Hashtag zooTag = new Hashtag();
      zooTag.setId("Zoo");
      hashtagRepo.save(zooTag);

      Video video = new Video();
      video.setTitle("Me at the zoo");
      video.setHashtags(Set.of(zooTag));
      videoRepo.save(video);

      Video otherVideo = new Video();
      otherVideo.setTitle("Me at the park");
      videoRepo.save(otherVideo); // should not be returned

      Video result = client.getVideo(video.getId(), null, zooTag.getId());

      assertThat(result)
              .isNotNull()
              .satisfies(it -> assertThat(it.getTitle()).isEqualTo(video.getTitle()))
              .satisfies(it -> assertThat(it.getLikeCount()).isEqualTo(video.getLikeCount()));
    }

    @Test
    public void findsByIdAuthorAndHashtag(){
      User author = new User();
      author.setUsername("ZooLover");
      userRepo.save(author);

      Hashtag zooTag = new Hashtag();
      zooTag.setId("Zoo");
      hashtagRepo.save(zooTag);

      Video video = new Video();
      video.setTitle("Me at the zoo");
      video.setHashtags(Set.of(zooTag));
      video.setAuthor(author);
      videoRepo.save(video);

      Video otherVideo = new Video();
      otherVideo.setTitle("Me at the park");
      videoRepo.save(otherVideo); // should not be returned

      Video result = client.getVideo(video.getId(), author.getUsername(), zooTag.getId());

      assertThat(result)
              .isNotNull()
              .satisfies(it -> assertThat(it.getTitle()).isEqualTo(video.getTitle()))
              .satisfies(it -> assertThat(it.getLikeCount()).isEqualTo(video.getLikeCount()));
    }
  }

  @Nested
  @DisplayName("list videos tests")
  class ListVideosTest {
    @Test
    public void emptyList() {
      Iterable<Video> iterVideos = client.list(null, null);
      assertThat(iterVideos.iterator()).isExhausted();
    }

    @Test
    public void returnsList() {
      Video video = new Video();
      video.setTitle("Me at the zoo");
      videoRepo.save(video);

      Video result = client.list(null, null).iterator().next();

      assertThat(result).isNotNull();
      assertThat(result.getTitle()).isEqualTo("Me at the zoo");
    }

    @Nested
    @DisplayName("filtering")
    class VideoFilteringTest {
      @Test
      public void canFilterByAuthor() {
        int expectedCount = 5;
        User author = new User();
        author.setUsername("ZooLover");
        userRepo.save(author);

        User otherAuthor = new User();
        otherAuthor.setUsername("FoodReviewer");
        userRepo.save(otherAuthor);

        for (int i = 0; i < 10; i++) {
          Video video = new Video();
          video.setAuthor(otherAuthor);
          video.setTitle("Video " + i);
          videoRepo.save(video);
        }

        for (int i = 0; i < expectedCount; i++) {
          Video video = new Video();
          video.setAuthor(author);
          video.setTitle("My video " + i);
          videoRepo.save(video);
        }

        Iterable<Video> result = client.list(author.getUsername(), null);

        assertThat(result).hasSize(expectedCount);
      }

      @Test
      public void canFilterByHashtag() {
        int expectedCount = 5;
        User author = new User();
        author.setUsername("ZooLover");
        userRepo.save(author);

        Hashtag zooTag = new Hashtag();
        zooTag.setId("Zoo");
        hashtagRepo.save(zooTag);

        Hashtag otherTag = new Hashtag();
        otherTag.setId("Gym");
        hashtagRepo.save(otherTag);

        for (int i = 0; i < 10; i++) {
          Video video = new Video();
          video.setAuthor(author);
          video.setTitle("Video " + i);
          video.setHashtags(Set.of(otherTag));
          videoRepo.save(video);
        }

        for (int i = 0; i < expectedCount; i++) {
          Video video = new Video();
          video.setAuthor(author);
          video.setTitle("My video " + i);
          video.setHashtags(Set.of(zooTag));
          videoRepo.save(video);
        }

        Iterable<Video> result = client.list(null, "Zoo");

        assertThat(result).hasSize(expectedCount);
      }

      @Test
      public void canFilterByAuthorAndHashtag() {
        int expectedCount = 5;
        User author = new User();
        author.setUsername("ZooLover");
        userRepo.save(author);

        Hashtag zooTag = new Hashtag();
        zooTag.setId("Zoo");
        hashtagRepo.save(zooTag);

        Hashtag otherTag = new Hashtag();
        otherTag.setId("Gym");
        hashtagRepo.save(otherTag);

        User otherAuthor = new User();
        otherAuthor.setUsername("FoodReviewer");
        userRepo.save(otherAuthor);

        for (int i = 0; i < 10; i++) {
          Video video = new Video();
          video.setAuthor(otherAuthor);
          video.setTitle("Video " + i);
          video.setHashtags(Set.of(otherTag));
          videoRepo.save(video);
        }

        for (int i = 0; i < expectedCount; i++) {
          Video video = new Video();
          video.setAuthor(author);
          video.setTitle("My video " + i);
          video.setHashtags(Set.of(zooTag));
          videoRepo.save(video);
        }

        Iterable<Video> result = client.list(author.getUsername(), "Zoo");

        assertThat(result).hasSize(expectedCount);
      }
    }
  }

  @Nested
  @DisplayName("publish video tests")
  class PublishVideoTest {
    @Test
    public void canPublishVideo() {
      User author = new User();
      author.setUsername("ZooLover");
      userRepo.save(author);

      Hashtag hashtag = new Hashtag();
      hashtag.setId("Zoo");
      hashtagRepo.save(hashtag);

      VideoDTO details =
          new VideoDTO("Me at the zoo", author.getUsername(), List.of(hashtag.getId()));

      HttpResponse<String> response = client.publish(details);
      Instant justAfterUpdate = Instant.now();

      assertEquals(response.getStatus(), HttpStatus.CREATED);
      String newId = response.getBody().get().substring(response.body().lastIndexOf(" ") + 1);

      Video createdVideo = videoRepo.findById(UUID.fromString(newId)).get();

      assertNotNull(createdVideo);
      assertEquals(createdVideo.getTitle(), "Me at the zoo");
      assertEquals(createdVideo.getAuthor().getUsername(), "ZooLover");
      assertEquals(
          createdVideo.getHashtags().stream().map(Hashtag::getId).collect(Collectors.toSet()),
          Set.of("Zoo"));
      assertEquals(createdVideo.getLikeCount(), 0);
      assertEquals(createdVideo.getDislikeCount(), 0);
      assertEquals(createdVideo.getViewCount(), 0);
      assert (Duration.between(createdVideo.getPublishedAt().toInstant(), justAfterUpdate)
              .toSeconds()
          <= 1);
    }

    @Test
    public void addsMissingHashtagsToDatabase() {
      User author = new User();
      author.setUsername("ZooLover");
      userRepo.save(author);

      VideoDTO details = new VideoDTO("Me at the zoo", author.getUsername(), List.of("Zoo"));

      HttpResponse<String> response = client.publish(details);

      assertEquals(response.getStatus(), HttpStatus.CREATED);
      String newId = response.getBody().get().substring(response.body().lastIndexOf(" ") + 1);
      Video createdVideo = videoRepo.findById(UUID.fromString(newId)).get();

      Hashtag createdHashtag = hashtagRepo.findById("Zoo").orElse(null);

      assertNotNull(createdHashtag);
      assertEquals(createdHashtag.getId(), "Zoo");
      assertEquals(
          createdVideo.getHashtags().stream().map(Hashtag::getId).collect(Collectors.toSet()),
          Set.of("Zoo"));
    }

    @Test
    public void handlesUnknownAuthor() {
      VideoDTO details = new VideoDTO("Me at the zoo", "random-user", List.of("Zoo"));

      HttpResponse<String> response = client.publish(details);

      assertEquals(response.getStatus(), HttpStatus.NOT_FOUND);
      assert (response.body().contains("Could not find author"));
    }
  }

  @Nested
  @DisplayName("like video tests")
  class LikeVideoTest {
    @Test
    public void canLikeVideo() {
      User author = new User();
      author.setUsername("ZooLover");
      userRepo.save(author);

      Video video = new Video();
      video.setTitle("Me at the zoo");
      videoRepo.save(video);

      HttpResponse<String> response = client.likeVideo(video.getId(), author.getUsername());

      assertEquals(response.getStatus(), HttpStatus.OK);

      Video videoAfterLike = videoRepo.findById(video.getId()).get();
      assert (videoAfterLike.getLikeCount() - video.getLikeCount() == 1);
    }

    @Test
    public void handlesUnknownUser() {
      Video video = new Video();
      video.setTitle("Me at the zoo");
      videoRepo.save(video);

      HttpResponse<String> response = client.likeVideo(video.getId(), "Unknown username");

      assertEquals(response.getStatus(), HttpStatus.NOT_FOUND);
      assert (response.getBody().get().contains("Could not find user"));
    }

    @Test
    public void handlesUnknownVideo() {
      User author = new User();
      author.setUsername("ZooLover");
      userRepo.save(author);

      HttpResponse<String> response = client.likeVideo(UUID.randomUUID(), author.getUsername());

      assertEquals(response.getStatus(), HttpStatus.NOT_FOUND);
      assert (response.getBody().get().contains("Could not find video"));
    }
  }

  @Nested
  @DisplayName("dislike video tests")
  class DislikeVideoTest {
    @Test
    public void canDislikeVideo() {
      User author = new User();
      author.setUsername("ZooLover");
      userRepo.save(author);

      Video video = new Video();
      video.setTitle("Me at the zoo");
      videoRepo.save(video);

      HttpResponse<String> response = client.dislikeVideo(video.getId(), author.getUsername());

      assertEquals(response.getStatus(), HttpStatus.OK);

      Video videoAfterDislike = videoRepo.findById(video.getId()).get();
      assert (video.getLikeCount() - videoAfterDislike.getLikeCount() == 1);
    }

    @Test
    public void handlesUnknownUser() {
      Video video = new Video();
      video.setTitle("Me at the zoo");
      videoRepo.save(video);

      HttpResponse<String> response = client.dislikeVideo(video.getId(), "Unknown username");

      assertEquals(response.getStatus(), HttpStatus.NOT_FOUND);
      assert (response.getBody().get().contains("Could not find user"));
    }

    @Test
    public void handlesUnknownVideo() {
      User author = new User();
      author.setUsername("ZooLover");
      userRepo.save(author);

      HttpResponse<String> response = client.dislikeVideo(UUID.randomUUID(), author.getUsername());

      assertEquals(response.getStatus(), HttpStatus.NOT_FOUND);
      assert (response.getBody().get().contains("Could not find video"));
    }
  }

  @Nested
  @DisplayName("view video tests")
  class ViewVideoTest {
    @Test
    public void canViewVideo() {
      User user = new User();
      user.setUsername("ZooLover");
      userRepo.save(user);

      Video video = new Video();
      video.setTitle("Me at the zoo");
      videoRepo.save(video);

      HttpResponse<String> response = client.watchVideo(video.getId(), user.getUsername());
      assertEquals(response.getStatus(), HttpStatus.OK);

      Video videoAfterView = videoRepo.findById(video.getId()).get();
      assert (videoAfterView.getViewCount() - video.getViewCount() == 1);

      assertEquals(videoAfterView.getViewers().size(), 1);
      assertEquals(videoAfterView.getViewers().iterator().next().getUsername(), user.getUsername());
    }

    @Test
    public void canHandleMultipleViewsBySameUser() {
      // Setup mimics a scenario where this user has already watched the video once.
      // We expect a database link between the two entities to already exists

      // Setup
      Video video = new Video();
      video.setTitle("Me at the zoo");
      videoRepo.save(video);
      User user = new User();
      user.setUsername("ZooLover");
      userRepo.save(user);
      client.watchVideo(video.getId(), user.getUsername());
      Video videoBeforeView = videoRepo.findById(video.getId()).get();
      assertEquals(
          videoBeforeView.getViewers().iterator().next().getUsername(), user.getUsername());
      assertEquals(videoBeforeView.getViewCount(), 1);

      // Act
      HttpResponse<String> response = client.watchVideo(video.getId(), user.getUsername());

      // Verify
      assertEquals(response.getStatus(), HttpStatus.OK);
      Video videoAfterView = videoRepo.findById(video.getId()).get();
      assertThat(videoAfterView.getViewers())
          .hasSameSizeAs(videoBeforeView.getViewers())
          .allMatch(
              it ->
                  videoAfterView.getViewers().stream()
                      .map(User::getId)
                      .toList()
                      .contains(it.getId()));

      assertEquals(videoAfterView.getViewCount() - videoBeforeView.getViewCount(), 1);
    }

    @Test
    public void handlesUnknownUser() {
      Video video = new Video();
      video.setTitle("Me at the zoo");
      videoRepo.save(video);

      HttpResponse<String> response = client.watchVideo(video.getId(), "Unknown username");

      assertEquals(response.getStatus(), HttpStatus.NOT_FOUND);
      assert (response.getBody().get().contains("Could not find user"));
    }

    @Test
    public void handlesUnknownVideo() {
      User user = new User();
      user.setUsername("ZooLover");
      userRepo.save(user);

      HttpResponse<String> response = client.watchVideo(UUID.randomUUID(), user.getUsername());

      assertEquals(response.getStatus(), HttpStatus.NOT_FOUND);
      assert (response.getBody().get().contains("Could not find video"));
    }
  }
}
