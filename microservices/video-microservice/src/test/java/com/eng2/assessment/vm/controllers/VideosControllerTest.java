package com.eng2.assessment.vm.controllers;

import static com.eng2.assessment.vm.utils.VideoEntityUtils.getHashtagIds;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.mockito.MockitoAnnotations.openMocks;

import com.eng2.assessment.vm.repositories.HashtagRepository;
import com.eng2.assessment.vm.repositories.UsersRepository;
import com.eng2.assessment.vm.repositories.VideosRepository;
import com.eng2.assessment.vm.utils.DbCleanupExtension;
import io.micronaut.context.annotation.Replaces;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import vm.api.VideosClient;
import vm.domain.Hashtag;
import vm.domain.User;
import vm.domain.Video;
import vm.dto.VideoDTO;
import vm.dto.VideoInteractionDetailsDTO;
import vm.dto.VideoResponseDTO;
import vm.dto.VideoResultsDTO;
import vm.events.VideoInteractionProducer;

@MicronautTest(transactional = false)
@ExtendWith(DbCleanupExtension.class)
public class VideosControllerTest {
  @Inject private VideosClient client;
  @Inject private VideosRepository videoRepo;
  @Inject private UsersRepository userRepo;
  @Inject private HashtagRepository hashtagRepo;

  @Singleton
  @Replaces(VideoInteractionProducer.class)
  VideoInteractionProducer mockProducer() {
    return mock(VideoInteractionProducer.class);
  }

  @Inject VideoInteractionProducer mockProducer;

  @BeforeEach
  public void setup() {
    openMocks(this);
  }

  @AfterEach
  public void cleanup() {
    reset(mockProducer);
  }

  //  @Nested
  //  @DisplayName("retrieve video tests")
  //  class GetVideoTest {
  //    @Test
  //    public void whenNoVideo() {
  //      Video result = client.getVideo(UUID.randomUUID(), null, null);
  //      assertThat(result).isNull();
  //    }
  //
  //    @Test
  //    public void findsById() {
  //      Hashtag hashtag = new Hashtag();
  //      hashtag.setId("Zoo");
  //      hashtagRepo.save(hashtag);
  //
  //      Video video = new Video();
  //      video.setTitle("Me at the zoo");
  //      video.setHashtags(Set.of(hashtag));
  //      videoRepo.save(video);
  //
  //      Video result = client.getVideo(video.getId(), null, null);
  //
  //      assertThat(result)
  //          .isNotNull()
  //          .satisfies(it -> assertThat(it.getTitle()).isEqualTo(video.getTitle()))
  //          .satisfies(it -> assertThat(it.getLikeCount()).isEqualTo(video.getLikeCount()));
  //    }
  //
  //    @Test
  //    public void findsByIdAndAuthor() {
  //      Hashtag hashtag = new Hashtag();
  //      hashtag.setId("Zoo");
  //      hashtagRepo.save(hashtag);
  //      User author = new User();
  //      author.setUsername("ZooLover");
  //      userRepo.save(author);
  //      Video video = new Video();
  //      video.setTitle("Me at the zoo");
  //      video.setAuthor(author);
  //      video.setHashtags(Set.of(hashtag));
  //      videoRepo.save(video);
  //
  //      Video otherVideo = new Video();
  //      otherVideo.setTitle("Me at the park");
  //      otherVideo.setHashtags(Set.of(hashtag));
  //      videoRepo.save(otherVideo); // should not be returned
  //
  //      Video result = client.getVideo(video.getId(), author.getUsername(), null);
  //
  //      assertThat(result)
  //          .isNotNull()
  //          .satisfies(it -> assertThat(it.getTitle()).isEqualTo(video.getTitle()))
  //          .satisfies(it -> assertThat(it.getLikeCount()).isEqualTo(video.getLikeCount()));
  //    }
  //
  //    @Test
  //    public void findsByIdAndHashtag() {
  //      Hashtag zooTag = new Hashtag();
  //      zooTag.setId("Zoo");
  //      hashtagRepo.save(zooTag);
  //
  //      Hashtag hashtag = new Hashtag();
  //      hashtag.setId("Gym");
  //      hashtagRepo.save(hashtag);
  //
  //      Video video = new Video();
  //      video.setTitle("Me at the zoo");
  //      video.setHashtags(Set.of(zooTag));
  //      videoRepo.save(video);
  //
  //      Video otherVideo = new Video();
  //      otherVideo.setTitle("Me at the park");
  //      otherVideo.setHashtags(Set.of(hashtag));
  //      videoRepo.save(otherVideo); // should not be returned
  //
  //      Video result = client.getVideo(video.getId(), null, zooTag.getId());
  //
  //      assertThat(result)
  //          .isNotNull()
  //          .satisfies(it -> assertThat(it.getTitle()).isEqualTo(video.getTitle()))
  //          .satisfies(it -> assertThat(it.getLikeCount()).isEqualTo(video.getLikeCount()));
  //    }
  //
  //    @Test
  //    public void findsByIdAuthorAndHashtag() {
  //      User author = new User();
  //      author.setUsername("ZooLover");
  //      userRepo.save(author);
  //
  //      Hashtag hashtag = new Hashtag();
  //      hashtag.setId("Gym");
  //      hashtagRepo.save(hashtag);
  //
  //      Hashtag zooTag = new Hashtag();
  //      zooTag.setId("Zoo");
  //      hashtagRepo.save(zooTag);
  //
  //      Video video = new Video();
  //      video.setTitle("Me at the zoo");
  //      video.setHashtags(Set.of(zooTag));
  //      video.setAuthor(author);
  //      videoRepo.save(video);
  //
  //      Video otherVideo = new Video();
  //      otherVideo.setTitle("Me at the park");
  //      otherVideo.setHashtags(Set.of(hashtag));
  //      videoRepo.save(otherVideo); // should not be returned
  //
  //      Video result = client.getVideo(video.getId(), author.getUsername(), zooTag.getId());
  //
  //      assertThat(result)
  //          .isNotNull()
  //          .satisfies(it -> assertThat(it.getTitle()).isEqualTo(video.getTitle()))
  //          .satisfies(it -> assertThat(it.getLikeCount()).isEqualTo(video.getLikeCount()));
  //    }
  //  }

  @Nested
  @DisplayName("list videos tests")
  class ListVideosTest {
    @Test
    public void emptyList() {
      VideoResultsDTO result = client.list(null, null);
      assertThat(result).isNotNull();
      assertThat(result.result()).isNull();
    }

    @Test
    public void returnsList() {
      Hashtag hashtag = new Hashtag();
      hashtag.setId("Zoo");
      hashtagRepo.save(hashtag);

      User user = new User();
      user.setUsername("AnimalPlanet");
      userRepo.save(user);

      Video video = new Video();
      video.setTitle("Me at the zoo");
      video.setHashtags(Set.of(hashtag));
      video.setAuthor(user);
      videoRepo.save(video);

      VideoResponseDTO result = client.list(null, null).result().get(0);

      assertThat(result).isNotNull();
      assertThat(result.title()).isEqualTo("Me at the zoo");
    }

    @Nested
    @DisplayName("filtering")
    class VideoFilteringTest {
      @Test
      public void canFilterByAuthor() {
        int expectedCount = 5;
        Hashtag hashtag = new Hashtag();
        hashtag.setId("Zoo");
        hashtagRepo.save(hashtag);

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
          video.setHashtags(Set.of(hashtag));
          videoRepo.save(video);
        }

        for (int i = 0; i < expectedCount; i++) {
          Video video = new Video();
          video.setAuthor(author);
          video.setTitle("My video " + i);
          video.setHashtags(Set.of(hashtag));
          videoRepo.save(video);
        }

        VideoResultsDTO result = client.list(author.getUsername(), null);

        assertThat(result.result()).hasSize(expectedCount);
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

        VideoResultsDTO result = client.list(null, "Zoo");

        assertThat(result.result()).hasSize(expectedCount);
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

        VideoResultsDTO result = client.list(author.getUsername(), "Zoo");

        assertThat(result.result()).hasSize(expectedCount);
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
          new VideoDTO(author.getUsername(), List.of(hashtag.getId()), "Me at the zoo");

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
      assert (Duration.between(createdVideo.getPublishedAt(), justAfterUpdate).toSeconds() <= 1);

      verify(mockProducer)
          .produceVideoPostedMessage(
              createdVideo.getId(),
              new VideoInteractionDetailsDTO(
                  createdVideo.getTitle(), getHashtagIds(createdVideo), author.getUsername()));
    }

    @Test
    public void addsMissingHashtagsToDatabase() {
      User author = new User();
      author.setUsername("ZooLover");
      userRepo.save(author);

      VideoDTO details = new VideoDTO(author.getUsername(), List.of("Zoo"), "Me at the zoo");

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
      VideoDTO details = new VideoDTO("random-user", List.of("Zoo"), "Me at the zoo");

      HttpResponse<String> response = client.publish(details);

      assertEquals(response.getStatus(), HttpStatus.NOT_FOUND);
      assert (response.body().contains("Could not find author"));
    }

    @ParameterizedTest
    @NullSource
    @EmptySource
    public void handlesInvalidHashtags(List<String> badHashtags) {
      User author = new User();
      author.setUsername("ZooLover");
      userRepo.save(author);
      VideoDTO details = new VideoDTO(author.getUsername(), badHashtags, "Me at the zoo");

      HttpResponse<String> response = client.publish(details);
      assertEquals(response.getStatus(), HttpStatus.BAD_REQUEST);

      assertThat(response.body()).contains("Please specify one or more hashtags for your video");
    }

    @Test
    public void handlesUnsafeHashtags() {
      User author = new User();
      author.setUsername("ZooLover");
      userRepo.save(author);
      VideoDTO details =
          new VideoDTO(
              author.getUsername(),
              List.of("GoodHashtag", "Bad hashtag", "Wow!BadHashtag", "", "?*12`'"),
              "Me at the zoo");

      HttpResponse<String> response = client.publish(details);
      assertEquals(response.getStatus(), HttpStatus.BAD_REQUEST);

      assertThat(response.body())
          .contains("One or more hashtags contained unsafe characters")
          .contains("Offending hashtags are:")
          .contains("Bad hashtag,")
          .contains("Wow!BadHashtag,")
          .contains(" ,")
          .contains("?*12`'");
    }
  }

  @Nested
  @DisplayName("like video tests")
  class LikeVideoTest {
    @Test
    public void canLikeVideo() {

      Hashtag hashtag = new Hashtag();
      hashtag.setId("Zoo");
      hashtagRepo.save(hashtag);

      User author = new User();
      author.setUsername("ZooLover");
      userRepo.save(author);

      Video video = new Video();
      video.setTitle("Me at the zoo");
      video.setHashtags(Set.of(hashtag));
      videoRepo.save(video);

      HttpResponse<String> response = client.likeVideo(video.getId(), author.getUsername());

      assertEquals(response.getStatus(), HttpStatus.OK);

      // check that the producer has been called with the correct data
      verify(mockProducer)
          .produceVideoLikedMessage(
              video.getId(),
              new VideoInteractionDetailsDTO(
                  video.getTitle(), List.of(hashtag.getId()), author.getUsername()));

      Video videoAfterLike = videoRepo.findById(video.getId()).get();
      assert (videoAfterLike.getLikeCount() - video.getLikeCount() == 1);
    }

    @Test
    public void cannotLikeVideoTwice() {
      Hashtag hashtag = new Hashtag();
      hashtag.setId("Zoo");
      hashtagRepo.save(hashtag);

      Video video = new Video();
      video.setTitle("Me at the zoo");
      video.setHashtags(Set.of(hashtag));
      videoRepo.save(video);

      User author = new User();
      author.setUsername("ZooLover");
      author.setLikedVideos(Set.of(video));
      userRepo.save(author);

      HttpResponse<String> response = client.likeVideo(video.getId(), author.getUsername());

      assertEquals(response.getStatus(), HttpStatus.BAD_REQUEST);
      assertThat(response.body()).contains("has already liked");

      // check that the producer has not been called with the correct data
      verifyNoInteractions(mockProducer);
    }

    @Test
    public void handlesUnknownUser() {
      Hashtag hashtag = new Hashtag();
      hashtag.setId("Zoo");
      hashtagRepo.save(hashtag);
      Video video = new Video();
      video.setTitle("Me at the zoo");
      video.setHashtags(Set.of(hashtag));
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
      Hashtag hashtag = new Hashtag();
      hashtag.setId("Zoo");
      hashtagRepo.save(hashtag);

      User user = new User();
      user.setUsername("ZooLover");
      userRepo.save(user);

      Video video = new Video();
      video.setTitle("Me at the zoo");
      video.setHashtags(Set.of(hashtag));
      videoRepo.save(video);

      HttpResponse<String> response = client.dislikeVideo(video.getId(), user.getUsername());

      assertEquals(response.getStatus(), HttpStatus.OK);

      // check that the producer has been called with the correct data
      verify(mockProducer)
          .produceVideoDislikedMessage(
              video.getId(),
              new VideoInteractionDetailsDTO(
                  video.getTitle(), List.of(hashtag.getId()), user.getUsername()));

      Video videoAfterDislike = videoRepo.findById(video.getId()).get();
      assertThat(videoAfterDislike.getDislikeCount() - video.getDislikeCount()).isOne();
    }

    @Test
    public void cannotDislikeVideoTwice() {
      Hashtag hashtag = new Hashtag();
      hashtag.setId("Zoo");
      hashtagRepo.save(hashtag);

      Video video = new Video();
      video.setTitle("Me at the zoo");
      video.setHashtags(Set.of(hashtag));
      videoRepo.save(video);

      User author = new User();
      author.setUsername("ZooLover");
      author.setDislikedVideos(Set.of(video));
      userRepo.save(author);

      HttpResponse<String> response = client.dislikeVideo(video.getId(), author.getUsername());

      assertEquals(response.getStatus(), HttpStatus.BAD_REQUEST);
      assertThat(response.body()).contains("has already disliked");

      // check that the producer has not been called with the correct data
      verifyNoInteractions(mockProducer);
    }

    @Test
    public void handlesUnknownUser() {
      Hashtag hashtag = new Hashtag();
      hashtag.setId("Zoo");
      hashtagRepo.save(hashtag);

      Video video = new Video();
      video.setTitle("Me at the zoo");
      video.setHashtags(Set.of(hashtag));
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
      Hashtag hashtag = new Hashtag();
      hashtag.setId("Zoo");
      hashtagRepo.save(hashtag);

      User user = new User();
      user.setUsername("ZooLover");
      userRepo.save(user);

      Video video = new Video();
      video.setTitle("Me at the zoo");
      video.setHashtags(Set.of(hashtag));
      videoRepo.save(video);

      HttpResponse<String> response = client.watchVideo(video.getId(), user.getUsername());
      assertEquals(response.getStatus(), HttpStatus.OK);

      Video videoAfterView = videoRepo.findById(video.getId()).get();

      // check that the producer has been called with the correct data
      verify(mockProducer)
          .produceVideoViewedMessage(
              video.getId(),
              new VideoInteractionDetailsDTO(
                  video.getTitle(), List.of(hashtag.getId()), user.getUsername()));
      assert (videoAfterView.getViewCount() - video.getViewCount() == 1);

      assertEquals(videoAfterView.getViewers().size(), 1);
      assertEquals(videoAfterView.getViewers().iterator().next().getUsername(), user.getUsername());
    }

    @Test
    public void canHandleMultipleViewsBySameUser() {
      // Setup mimics a scenario where this user has already watched the video once.
      // We expect a database link between the two entities to already exists

      // Setup
      Hashtag hashtag = new Hashtag();
      hashtag.setId("Zoo");
      hashtagRepo.save(hashtag);
      Video video = new Video();
      video.setTitle("Me at the zoo");
      video.setViewCount(1);
      video.setHashtags(Set.of(hashtag));
      videoRepo.save(video);
      User user = new User();
      user.setUsername("ZooLover");
      user.setViewedVideos(Set.of(video));
      userRepo.save(user);
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
      Hashtag hashtag = new Hashtag();
      hashtag.setId("Zoo");
      hashtagRepo.save(hashtag);
      Video video = new Video();
      video.setTitle("Me at the zoo");
      video.setHashtags(Set.of(hashtag));
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
