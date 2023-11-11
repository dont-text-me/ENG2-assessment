package com.eng2.assessment.client.commands.thm.feature;

import static org.assertj.core.api.Assertions.assertThat;

import com.eng2.assessment.client.clients.vm.UsersClient;
import com.eng2.assessment.client.clients.vm.VideosClient;
import com.eng2.assessment.client.commands.thm.ListTrendingHashtagsCommand;
import com.eng2.assessment.client.utils.FeatureTestExtension;
import com.eng2.assessment.vm.dto.UserDTO;
import com.eng2.assessment.vm.dto.VideoDTO;
import io.micronaut.configuration.picocli.PicocliRunner;
import io.micronaut.context.ApplicationContext;
import io.micronaut.context.env.Environment;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@MicronautTest
@Tag("feature-test")
@ExtendWith(FeatureTestExtension.class)
@DisplayName("Feature tests for the `list-trending-hashtags` command")
public class TrendingHashtagsCommandFeatureTest {
  private ByteArrayOutputStream baos;

  @Inject VideosClient videosClient;
  @Inject UsersClient usersClient;

  private final Class<ListTrendingHashtagsCommand> sut = ListTrendingHashtagsCommand.class;

  @BeforeEach
  public void setup() {
    baos = new ByteArrayOutputStream();
    System.setOut(new PrintStream(baos));
  }

  @Test
  @DisplayName("When no trending hashtag info is available")
  public void whenNoStats() {
    try (ApplicationContext ctx = ApplicationContext.run(Environment.CLI, Environment.TEST)) {
      PicocliRunner.run(sut, ctx);
      assertThat(baos.toString()).contains("No statistics available. Please try again later");
    }
  }

  @Test
  @DisplayName("Calculates and displays top 10 trending hashtags")
  public void canDisplayTrendingHashtags() throws InterruptedException {
    ArrayList<UUID> videoIds = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      usersClient.registerUser(new UserDTO("User-" + i));

      String postVideoResponseBody =
          videosClient.publish(new VideoDTO("Video " + i, "User-" + i, List.of("Elephant"))).body();
      UUID videoId =
          UUID.fromString(
              postVideoResponseBody.substring(postVideoResponseBody.lastIndexOf(" ") + 1));
      videoIds.add(videoId);
    }

    videosClient.likeVideo(videoIds.get(0), "User-1");
    Thread.sleep(1000L);
    videosClient.likeVideo(videoIds.get(1), "User-1");

    try (ApplicationContext ctx = ApplicationContext.run(Environment.CLI, Environment.TEST)) {
      PicocliRunner.run(sut, ctx);
      assertThat(baos.toString()).contains(" bbbbbbbbbb");
    }
  }
}
