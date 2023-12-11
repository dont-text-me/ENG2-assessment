package com.eng2.assessment.client.commands.sm.recommendations.feature;

import com.eng2.assessment.client.commands.sm.recommendations.GetRecommendationsCommand;
import com.eng2.assessment.client.utils.AbstractFeatureTest;
import com.eng2.assessment.client.utils.FeatureTestExtension;
import com.eng2.assessment.generated.vm.api.UsersClient;
import com.eng2.assessment.generated.vm.api.VideosClient;
import com.eng2.assessment.generated.vm.dto.VideoDTO;
import io.micronaut.configuration.picocli.PicocliRunner;
import io.micronaut.context.ApplicationContext;
import io.micronaut.context.env.Environment;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.UUID;
import java.util.stream.IntStream;

import static com.eng2.assessment.client.utils.TestContainerServicesInfo.*;
import static org.assertj.core.api.Assertions.assertThat;

@MicronautTest
@Tag("feature-test")
@ExtendWith(FeatureTestExtension.class)
@DisplayName("Feature tests for the `get-recommendations` command")
public class GetRecommendationsCommandFeatureTest extends AbstractFeatureTest {

  @Inject VideosClient vmVideosClient;
  @Inject UsersClient vmUsersClient;

  private ByteArrayOutputStream baos;

  private final Class<GetRecommendationsCommand> sut = GetRecommendationsCommand.class;

  @BeforeEach
  public void setup() {
    baos = new ByteArrayOutputStream();
    System.setOut(new PrintStream(baos));
  }

  @Test
  @DisplayName("Returns recommendations for a user and omits videos that the user has already seen")
  public void returnsRecommendations() throws InterruptedException, SQLException {
    String videoAuthorUserName = "VideoAuthor";
    String videoViewerUserName = "VideoViewer";
    String hashtagName = "Zoo";
    String videoNamePrefix = "Video ";
    vmUsersClient.registerUser(videoAuthorUserName);
    vmUsersClient.registerUser(videoViewerUserName);

    for (int i = 0; i < 10; i++) {
      String postVideoResponseBody =
          vmVideosClient
              .publish(new VideoDTO(videoAuthorUserName, List.of(hashtagName), videoNamePrefix + i))
              .body();
      UUID videoId =
          UUID.fromString(
              postVideoResponseBody.substring(postVideoResponseBody.lastIndexOf(" ") + 1));
      Thread.sleep(2000L);
      if (i < 5) {
        vmVideosClient.watchVideo(videoId, videoViewerUserName);
      }
    }
    Thread.sleep(5000L); // Pause for all the messages to be fully processed
    seedSubscription(videoViewerUserName, hashtagName);

    try (ApplicationContext ctx = ApplicationContext.run(Environment.CLI)) {
      String[] args = new String[] {"-u", videoViewerUserName, "-h", hashtagName};
      PicocliRunner.run(sut, ctx, args);
      assertThat(baos.toString())
          .doesNotContain(
              IntStream.range(0, 5)
                  .mapToObj(it -> videoNamePrefix + it)
                  .toList()) // VideoViewer has already seen these so they should be omitted
          .contains(
              IntStream.range(5, 10)
                  .mapToObj(it -> String.format("%s%s (0 views)", videoNamePrefix, it))
                  .toList());
    }
  }

  @Test
  @DisplayName("Handles user not being subscribed to the hashtag")
  public void handlesUserNotSubscribed() throws InterruptedException {
    String videoAuthorUserName = "VideoAuthor";
    String videoViewerUserName = "VideoViewer";
    String hashtagName = "Video";
    vmUsersClient.registerUser(videoAuthorUserName);
    vmUsersClient.registerUser(videoViewerUserName);
    String postVideoResponseBody =
        vmVideosClient
            .publish(new VideoDTO(videoAuthorUserName, List.of(hashtagName), "My video"))
            .body();
    Thread.sleep(500L);
    UUID videoId =
        UUID.fromString(
            postVideoResponseBody.substring(postVideoResponseBody.lastIndexOf(" ") + 1));

    vmVideosClient.watchVideo(videoId, videoViewerUserName);
    Thread.sleep(500L);

    // At this point, there are 2 users stored in the SM database, but no subscriptions

    try (ApplicationContext ctx = ApplicationContext.run(Environment.CLI)) {
      String[] args = new String[] {"-u", videoViewerUserName, "-h", hashtagName};
      PicocliRunner.run(sut, ctx, args);
      assertThat(baos.toString())
          .contains("Something went wrong: ")
          .contains("User VideoViewer is not subscribed to hashtag Video");
    }
  }

  /** Sets up a subscription between an <b>Existing</b> user and an <b>Existing</b> hashtag */
  private void seedSubscription(String userName, String hashtagName) throws SQLException {
    try (Connection smConnection =
        DriverManager.getConnection(SM_DB_JDBC_URL, SM_DB_USERNAME, SM_DB_PASSWORD); ) {
      try (Statement smStatement = smConnection.createStatement()) {
        smStatement.executeUpdate(
            String.format(
                "INSERT INTO user_hashtag (subscribers_user_name, subscriptions_name) VALUE ('%s', '%s');",
                userName, hashtagName));
      }
    }
  }
}
