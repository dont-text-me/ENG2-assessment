package com.eng2.assessment.sm.events;

import static org.assertj.core.api.Assertions.assertThat;

import com.eng2.assessment.sm.domain.Hashtag;
import com.eng2.assessment.sm.domain.User;
import com.eng2.assessment.sm.domain.Video;
import com.eng2.assessment.sm.repositories.HashtagRepository;
import com.eng2.assessment.sm.repositories.UserRepository;
import com.eng2.assessment.sm.repositories.VideoRepository;
import com.eng2.assessment.sm.utils.DbCleanupExtension;
import com.eng2.assessment.vm.dto.VideoInteractionDetailsDTO;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@MicronautTest(transactional = false)
@ExtendWith(DbCleanupExtension.class)
public class VideoInteractionConsumerTest {
  @Inject VideoInteractionConsumer sut;
  @Inject UserRepository userRepo;
  @Inject VideoRepository videoRepo;
  @Inject HashtagRepository hashtagRepo;
  private final Random r = new Random();

  @Nested
  @DisplayName("Receiving a 'video-viewed' message")
  class ProcessViewedTest {
    @Test
    @DisplayName(
        "Handles case when no entities in message exist in the database and increments view count")
    public void handlesNewEntities() {
      Long videoId = r.nextLong();
      String userName = "AnimalPlanet";
      List<String> hashtagNames = List.of("Elephant", "Lion", "Tiger");
      String videoTitle = "Safari trip";

      sut.processViewed(
          videoId, new VideoInteractionDetailsDTO(userName, hashtagNames, videoTitle));

      assertThat(hashtagRepo.findAll().stream().map(Hashtag::getName))
          .hasSize(3)
          .containsExactlyElementsOf(hashtagNames);

      assertThat(userRepo.findAll()).hasSize(1);
      assertThat(userRepo.findAll().get(0).getUserName()).isEqualTo(userName);
      assertThat(userRepo.findAll().get(0).getViewedVideos()).hasSize(1);

      assertThat(videoRepo.findAll()).hasSize(1);
      assertThat(videoRepo.findAll().get(0).getTitle()).isEqualTo(videoTitle);
      assertThat(videoRepo.findAll().get(0).getId()).isEqualTo(videoId);
      assertThat(videoRepo.findAll().get(0).getViewCount()).isEqualTo(1L);
    }

    @Test
    @DisplayName("Handles case when some entities already exist and increments view count")
    public void handlesExistingEntities() {
      Long videoId = r.nextLong();
      String userName = "AnimalPlanet";
      List<String> hashtagNames = List.of("Elephant", "Lion", "Tiger");
      String videoTitle = "Safari trip";

      User user = new User();
      user.setUserName(userName);
      userRepo.save(user);

      Hashtag hashtag = new Hashtag();
      hashtag.setName("Lion");
      hashtagRepo.save(hashtag);

      sut.processViewed(
          videoId, new VideoInteractionDetailsDTO(userName, hashtagNames, videoTitle));

      assertThat(hashtagRepo.findAll().stream().map(Hashtag::getName))
          .hasSize(3)
          .containsExactlyElementsOf(hashtagNames);

      assertThat(userRepo.findAll()).hasSize(1);
      assertThat(userRepo.findAll().get(0).getUserName()).isEqualTo(userName);

      assertThat(videoRepo.findAll()).hasSize(1);
      assertThat(videoRepo.findAll().get(0).getTitle()).isEqualTo(videoTitle);
      assertThat(videoRepo.findAll().get(0).getId()).isEqualTo(videoId);
      assertThat(videoRepo.findAll().get(0).getViewCount()).isEqualTo(1L);
    }

    @Test
    @DisplayName("Handles case when all entities already exist and increments view count")
    public void handlesAllEntitiesExisting() {
      Long videoId = r.nextLong();
      String userName = "AnimalPlanet";
      List<String> hashtagNames = List.of("Elephant", "Lion", "Tiger");
      String videoTitle = "Safari trip";

      User user = new User();
      user.setUserName(userName);
      userRepo.save(user);

      hashtagNames.forEach(
          it -> {
            Hashtag hashtag = new Hashtag();
            hashtag.setName(it);
            hashtagRepo.save(hashtag);
          });

      Video video = new Video();
      video.setId(videoId);
      video.setViewCount(0L);
      video.setTitle(videoTitle);
      videoRepo.save(video);

      sut.processViewed(
          videoId, new VideoInteractionDetailsDTO(userName, hashtagNames, videoTitle));

      assertThat(hashtagRepo.findAll().stream().map(Hashtag::getName))
          .hasSize(3)
          .containsExactlyElementsOf(hashtagNames);

      assertThat(userRepo.findAll()).hasSize(1);
      assertThat(userRepo.findAll().get(0).getUserName()).isEqualTo(userName);

      assertThat(videoRepo.findAll()).hasSize(1);
      assertThat(videoRepo.findAll().get(0).getTitle()).isEqualTo(videoTitle);
      assertThat(videoRepo.findAll().get(0).getId()).isEqualTo(videoId);
      assertThat(videoRepo.findAll().get(0).getViewCount()).isEqualTo(1L);
    }

    @Test
    @DisplayName("Handles several views for same video")
    public void handlesSeveralViews() {
      Long videoId = r.nextLong();
      List<String> hashtagNames = List.of("Elephant", "Lion", "Tiger");
      String videoTitle = "Safari trip";

      // 10 views total: 6 by different users, the remaining 4 by a user called RepeatedViewer

      IntStream.range(0, 10)
          .forEach(
              it ->
                  sut.processViewed(
                      videoId,
                      new VideoInteractionDetailsDTO(
                          it <= 5 ? "User-" + it : "RepeatedViewer", hashtagNames, videoTitle)));

      assertThat(hashtagRepo.findAll().stream().map(Hashtag::getName))
          .hasSize(3)
          .containsExactlyElementsOf(hashtagNames);

      assertThat(videoRepo.findAll()).hasSize(1);
      assertThat(videoRepo.findAll().get(0).getTitle()).isEqualTo(videoTitle);
      assertThat(videoRepo.findAll().get(0).getId()).isEqualTo(videoId);
      assertThat(videoRepo.findAll().get(0).getViewCount()).isEqualTo(10L);
      assertThat(videoRepo.findAll().get(0).getViewers()).hasSize(7);
    }
  }

  @Nested
  @DisplayName("Receiving a 'video-posted' message")
  class ProcessPostedTest {
    @Test
    @DisplayName("Handles case when no entities in message exist in the database")
    public void handlesNewEntities() {
      Long videoId = r.nextLong();
      String userName = "AnimalPlanet";
      List<String> hashtagNames = List.of("Elephant", "Lion", "Tiger");
      String videoTitle = "Safari trip";

      sut.processPosted(
          videoId, new VideoInteractionDetailsDTO(userName, hashtagNames, videoTitle));

      assertThat(hashtagRepo.findAll().stream().map(Hashtag::getName))
          .hasSize(3)
          .containsExactlyElementsOf(hashtagNames);

      assertThat(userRepo.findAll()).hasSize(1);
      assertThat(userRepo.findAll().get(0).getUserName()).isEqualTo(userName);

      assertThat(videoRepo.findAll()).hasSize(1);
      assertThat(videoRepo.findAll().get(0).getTitle()).isEqualTo(videoTitle);
      assertThat(videoRepo.findAll().get(0).getId()).isEqualTo(videoId);
    }

    @Test
    @DisplayName("Handles case when some entities already exist")
    public void handlesExistingEntities() {
      Long videoId = r.nextLong();
      String userName = "AnimalPlanet";
      List<String> hashtagNames = List.of("Elephant", "Lion", "Tiger");
      String videoTitle = "Safari trip";

      User user = new User();
      user.setUserName(userName);
      userRepo.save(user);

      Hashtag hashtag = new Hashtag();
      hashtag.setName("Lion");
      hashtagRepo.save(hashtag);

      sut.processPosted(
          videoId, new VideoInteractionDetailsDTO(userName, hashtagNames, videoTitle));

      assertThat(hashtagRepo.findAll().stream().map(Hashtag::getName))
          .hasSize(3)
          .containsExactlyElementsOf(hashtagNames);

      assertThat(userRepo.findAll()).hasSize(1);
      assertThat(userRepo.findAll().get(0).getUserName()).isEqualTo(userName);

      assertThat(videoRepo.findAll()).hasSize(1);
      assertThat(videoRepo.findAll().get(0).getTitle()).isEqualTo(videoTitle);
      assertThat(videoRepo.findAll().get(0).getId()).isEqualTo(videoId);
    }

    @Test
    @DisplayName("Handles case when all entities already exist")
    public void handlesAllEntitiesExisting() {
      Long videoId = r.nextLong();
      String userName = "AnimalPlanet";
      List<String> hashtagNames = List.of("Elephant", "Lion", "Tiger");
      String videoTitle = "Safari trip";

      User user = new User();
      user.setUserName(userName);
      userRepo.save(user);

      hashtagNames.forEach(
          it -> {
            Hashtag hashtag = new Hashtag();
            hashtag.setName(it);
            hashtagRepo.save(hashtag);
          });

      Video video = new Video();
      video.setId(videoId);
      video.setViewCount(0L);
      video.setTitle(videoTitle);
      videoRepo.save(video);

      sut.processPosted(
          videoId, new VideoInteractionDetailsDTO(userName, hashtagNames, videoTitle));

      assertThat(hashtagRepo.findAll().stream().map(Hashtag::getName))
          .hasSize(3)
          .containsExactlyElementsOf(hashtagNames);

      assertThat(userRepo.findAll()).hasSize(1);
      assertThat(userRepo.findAll().get(0).getUserName()).isEqualTo(userName);

      assertThat(videoRepo.findAll()).hasSize(1);
      assertThat(videoRepo.findAll().get(0).getTitle()).isEqualTo(videoTitle);
      assertThat(videoRepo.findAll().get(0).getId()).isEqualTo(videoId);
    }
  }
}
