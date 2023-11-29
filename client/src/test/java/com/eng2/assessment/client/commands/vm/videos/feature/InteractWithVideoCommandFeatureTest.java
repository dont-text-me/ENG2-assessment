package com.eng2.assessment.client.commands.vm.videos.feature;

import static org.assertj.core.api.Assertions.assertThat;

import com.eng2.assessment.client.clients.vm.UsersClient;
import com.eng2.assessment.client.clients.vm.VideosClient;
import com.eng2.assessment.client.commands.vm.videos.InteractWithVideoCommand;
import com.eng2.assessment.client.utils.AbstractFeatureTest;
import com.eng2.assessment.client.utils.FeatureTestExtension;
import com.eng2.assessment.vm.domain.Video;
import com.eng2.assessment.vm.dto.UserDTO;
import com.eng2.assessment.vm.dto.VideoDTO;
import io.micronaut.configuration.picocli.PicocliRunner;
import io.micronaut.context.ApplicationContext;
import io.micronaut.context.env.Environment;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.Random;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

@MicronautTest
@Tag("feature-test")
@ExtendWith(FeatureTestExtension.class)
@DisplayName("Feature tests for the `interact-with-video` command")
public class InteractWithVideoCommandFeatureTest extends AbstractFeatureTest {
  private ByteArrayOutputStream baos;

  @Inject VideosClient videosClient;
  @Inject UsersClient usersClient;
  private final Random r = new Random();

  private final Class<InteractWithVideoCommand> sut = InteractWithVideoCommand.class;

  @BeforeEach
  public void setup() {
    baos = new ByteArrayOutputStream();
    System.setOut(new PrintStream(baos));
  }

  @ParameterizedTest
  @DisplayName("Can interact with video")
  @EnumSource(InteractWithVideoCommand.VideoInteractionType.class)
  public void canInteractWithVideo(InteractWithVideoCommand.VideoInteractionType type) {
    String userName = "AnimalPlanet";
    String videoTitle = "Elephant sighting";
    usersClient.registerUser(new UserDTO(userName));
    String postVideoResponseBody =
        videosClient
            .publish(new VideoDTO(videoTitle, userName, List.of("Elephant", "Awesome", "Safari")))
            .body();
    Long videoId =
        Long.valueOf(postVideoResponseBody.substring(postVideoResponseBody.lastIndexOf(" ") + 1));

    try (ApplicationContext ctx = ApplicationContext.run(Environment.CLI, Environment.TEST)) {
      String[] args =
          new String[] {"-v", videoId.toString(), "-t", type.toString(), "-u", userName};
      PicocliRunner.run(sut, ctx, args);
      assertThat(baos.toString())
          .contains("Success!")
          .contains("Video with title " + videoTitle)
          .contains(
              type.equals(InteractWithVideoCommand.VideoInteractionType.WATCH)
                  ? "viewed"
                  : (type.equals(InteractWithVideoCommand.VideoInteractionType.LIKE)
                      ? "liked"
                      : "disliked"));

      Video videoAfterUpdate = videosClient.list(null, null).get(0);

      if (type.equals(InteractWithVideoCommand.VideoInteractionType.LIKE)) {
        assertThat(videoAfterUpdate.getLikeCount()).isEqualTo(1);
      } else if (type.equals(InteractWithVideoCommand.VideoInteractionType.DISLIKE)) {
        assertThat(videoAfterUpdate.getDislikeCount()).isEqualTo(1);
      } else {
        assertThat(videoAfterUpdate.getViewCount()).isEqualTo(1);
      }
    }
  }

  @ParameterizedTest
  @DisplayName("Handles unknown username")
  @EnumSource(InteractWithVideoCommand.VideoInteractionType.class)
  public void handlesUnknownUser(InteractWithVideoCommand.VideoInteractionType type) {
    String userName = "AnimalPlanet";
    String videoTitle = "Elephant sighting";
    usersClient.registerUser(new UserDTO(userName));
    String postVideoResponseBody =
        videosClient
            .publish(new VideoDTO(videoTitle, userName, List.of("Elephant", "Awesome", "Safari")))
            .body();
    Long videoId =
        Long.valueOf(postVideoResponseBody.substring(postVideoResponseBody.lastIndexOf(" ") + 1));

    try (ApplicationContext ctx = ApplicationContext.run(Environment.CLI, Environment.TEST)) {
      String[] args =
          new String[] {"-v", videoId.toString(), "-t", type.toString(), "-u", "UnknownUser"};
      PicocliRunner.run(sut, ctx, args);
      assertThat(baos.toString())
          .contains("Something went wrong: ")
          .contains("Could not find user with username UnknownUser");
    }
  }

  @ParameterizedTest
  @DisplayName("Handles unknown video ID")
  @EnumSource(InteractWithVideoCommand.VideoInteractionType.class)
  public void handlesUnknownVideo(InteractWithVideoCommand.VideoInteractionType type) {
    String userName = "AnimalPlanet";
    usersClient.registerUser(new UserDTO(userName));
    String unknownId = String.valueOf(r.nextLong());

    try (ApplicationContext ctx = ApplicationContext.run(Environment.CLI, Environment.TEST)) {
      String[] args = new String[] {"-v", unknownId, "-t", type.toString(), "-u", userName};
      PicocliRunner.run(sut, ctx, args);
      assertThat(baos.toString())
          .contains("Something went wrong: ")
          .contains("Could not find video with id " + unknownId);
    }
  }

  @ParameterizedTest
  @DisplayName("Limits likes and dislikes to 1 each per user")
  @EnumSource(
      value = InteractWithVideoCommand.VideoInteractionType.class,
      mode = EnumSource.Mode.EXCLUDE,
      names = {"WATCH"})
  public void canLikeAndDislikeOnlyOnce(InteractWithVideoCommand.VideoInteractionType type) {
    String userName = "AnimalPlanet";
    String videoTitle = "Elephant sighting";
    usersClient.registerUser(new UserDTO(userName));
    String postVideoResponseBody =
        videosClient
            .publish(new VideoDTO(videoTitle, userName, List.of("Elephant", "Awesome", "Safari")))
            .body();
    Long videoId =
        Long.valueOf(postVideoResponseBody.substring(postVideoResponseBody.lastIndexOf(" ") + 1));

    // make it so that the user has already liked/disliked the video prior to running the command
    if (type.equals(InteractWithVideoCommand.VideoInteractionType.LIKE)) {
      videosClient.likeVideo(videoId, userName);
    } else if (type.equals(InteractWithVideoCommand.VideoInteractionType.DISLIKE)) {
      videosClient.dislikeVideo(videoId, userName);
    }

    try (ApplicationContext ctx = ApplicationContext.run(Environment.CLI, Environment.TEST)) {
      String[] args =
          new String[] {"-v", videoId.toString(), "-t", type.toString(), "-u", userName};
      PicocliRunner.run(sut, ctx, args);
      assertThat(baos.toString())
          .contains("Something went wrong: ")
          .contains(
              String.format(
                  "User %s has already %sd the video with title %s",
                  userName, type.toString().toLowerCase(), videoTitle));
    }
  }
}
