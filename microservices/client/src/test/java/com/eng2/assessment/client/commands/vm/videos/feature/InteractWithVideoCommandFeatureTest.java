package com.eng2.assessment.client.commands.vm.videos.feature;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.assertj.core.api.Assertions.assertThat;

import com.eng2.assessment.client.commands.vm.videos.InteractWithVideoCommand;
import com.eng2.assessment.client.utils.AbstractFeatureTest;
import com.eng2.assessment.client.utils.FeatureTestExtension;
import com.eng2.assessment.generated.enums.VideoInteractionType;
import io.micronaut.configuration.picocli.PicocliRunner;
import io.micronaut.context.ApplicationContext;
import io.micronaut.context.env.Environment;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import com.eng2.assessment.generated.vm.api.UsersClient;
import com.eng2.assessment.generated.vm.api.VideosClient;
import com.eng2.assessment.generated.vm.dto.VideoDTO;
import com.eng2.assessment.generated.vm.dto.VideoResponseDTO;

@MicronautTest
@Tag("feature-test")
@ExtendWith(FeatureTestExtension.class)
@DisplayName("Feature tests for the `interact-with-video` command")
public class InteractWithVideoCommandFeatureTest extends AbstractFeatureTest {
  private ByteArrayOutputStream baos;

  @Inject VideosClient videosClient;
  @Inject UsersClient usersClient;

  private final Class<InteractWithVideoCommand> sut = InteractWithVideoCommand.class;

  @BeforeEach
  public void setup() {
    baos = new ByteArrayOutputStream();
    System.setOut(new PrintStream(baos));
  }

  @ParameterizedTest
  @DisplayName("Can interact with video")
  @EnumSource(VideoInteractionType.class)
  public void canInteractWithVideo(VideoInteractionType type) {
    String userName = "AnimalPlanet";
    String videoTitle = "Elephant sighting";
    usersClient.registerUser(userName);
    String postVideoResponseBody =
        videosClient
            .publish(new VideoDTO(userName, List.of("Elephant", "Awesome", "Safari"), videoTitle))
            .body();
    UUID videoId =
        UUID.fromString(
            postVideoResponseBody.substring(postVideoResponseBody.lastIndexOf(" ") + 1));

    try (ApplicationContext ctx = ApplicationContext.run(Environment.CLI, Environment.TEST)) {
      String[] args =
          new String[] {"-v", videoId.toString(), "-t", type.toString(), "-u", userName};
      PicocliRunner.run(sut, ctx, args);
      assertThat(baos.toString())
          .contains("Success!")
          .contains("Video with title " + videoTitle)
          .contains(
              type.equals(VideoInteractionType.WATCH)
                  ? "viewed"
                  : (type.equals(VideoInteractionType.LIKE) ? "liked" : "disliked"));

      VideoResponseDTO videoAfterUpdate = videosClient.list(null, null).result().get(0);

      if (type.equals(VideoInteractionType.LIKE)) {
        assertThat(videoAfterUpdate.likeCount()).isEqualTo(1);
      } else if (type.equals(VideoInteractionType.DISLIKE)) {
        assertThat(videoAfterUpdate.dislikeCount()).isEqualTo(1);
      } else {
        assertThat(videoAfterUpdate.viewCount()).isEqualTo(1);
      }
    }
  }

  @ParameterizedTest
  @DisplayName("Handles unknown username")
  @EnumSource(VideoInteractionType.class)
  public void handlesUnknownUser(VideoInteractionType type) {
    String userName = "AnimalPlanet";
    String videoTitle = "Elephant sighting";
    usersClient.registerUser(userName);
    String postVideoResponseBody =
        videosClient
            .publish(new VideoDTO(userName, List.of("Elephant", "Awesome", "Safari"), videoTitle))
            .body();
    UUID videoId =
        UUID.fromString(
            postVideoResponseBody.substring(postVideoResponseBody.lastIndexOf(" ") + 1));

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
  @EnumSource(VideoInteractionType.class)
  public void handlesUnknownVideo(VideoInteractionType type) {
    String userName = "AnimalPlanet";
    usersClient.registerUser(userName);
    String unknownId = UUID.randomUUID().toString();

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
      value = VideoInteractionType.class,
      mode = EnumSource.Mode.EXCLUDE,
      names = {"WATCH"})
  public void canLikeAndDislikeOnlyOnce(VideoInteractionType type) {
    String userName = "AnimalPlanet";
    String videoTitle = "Elephant sighting";
    usersClient.registerUser(userName);
    String postVideoResponseBody =
        videosClient
            .publish(new VideoDTO(userName, List.of("Elephant", "Awesome", "Safari"), videoTitle))
            .body();
    UUID videoId =
        UUID.fromString(
            postVideoResponseBody.substring(postVideoResponseBody.lastIndexOf(" ") + 1));

    // make it so that the user has already liked/disliked the video prior to running the command
    if (type.equals(VideoInteractionType.LIKE)) {
      videosClient.likeVideo(videoId, userName);
    } else if (type.equals(VideoInteractionType.DISLIKE)) {
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
