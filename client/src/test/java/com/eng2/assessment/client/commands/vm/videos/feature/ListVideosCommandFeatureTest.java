package com.eng2.assessment.client.commands.vm.videos.feature;

import static com.eng2.assessment.client.utils.TestContainerServicesInfo.*;
import static org.assertj.core.api.Assertions.assertThat;

import com.eng2.assessment.client.clients.vm.UsersClient;
import com.eng2.assessment.client.clients.vm.VideosClient;
import com.eng2.assessment.client.commands.vm.videos.ListVideosCommand;
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
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testcontainers.shaded.org.apache.commons.lang3.StringUtils;

@MicronautTest
@Tag("feature-test")
@ExtendWith(FeatureTestExtension.class)
@DisplayName("Feature tests for the `list-videos` command")
public class ListVideosCommandFeatureTest {

  private ByteArrayOutputStream baos;

  @Inject VideosClient videosClient;
  @Inject UsersClient usersClient;

  private final Class<ListVideosCommand> sut = ListVideosCommand.class;

  @BeforeEach
  public void setup() {
    baos = new ByteArrayOutputStream();
    System.setOut(new PrintStream(baos));
  }

  @Test
  @DisplayName("When no videos available")
  public void whenNoVideos() {
    try (ApplicationContext ctx = ApplicationContext.run(Environment.CLI, Environment.TEST)) {
      PicocliRunner.run(sut, ctx);
      assertThat(baos.toString())
          .contains("No videos available. Please try again later or post a video");
    }
  }

  @Test
  @DisplayName("Happy path (videos are available, no filter)")
  public void canListVideos() {
    usersClient.registerUser(new UserDTO("AnimalPlanet"));
    videosClient.publish(
        new VideoDTO("Me at the zoo", "AnimalPlanet", List.of("Zoo", "Giraffe", "Gorilla")));

    try (ApplicationContext ctx = ApplicationContext.run(Environment.CLI, Environment.TEST)) {
      PicocliRunner.run(sut, ctx);
      assertThat(baos.toString())
          .contains("Me at the zoo")
          .contains("Author: AnimalPlanet")
          .contains("Likes: 0")
          .contains("Dislikes: 0")
          .contains("Hashtags: ")
          .contains("Zoo")
          .contains("Giraffe")
          .contains("Gorilla");
    }
  }

  @Test
  @DisplayName("Can filter by author's username")
  public void canFilterByAuthorName() throws InterruptedException {
    usersClient.registerUser(new UserDTO("AnimalPlanet"));
    usersClient.registerUser(new UserDTO("OtherUser"));

    for (int i = 0; i < 10; i++) {
      videosClient.publish(new VideoDTO("Included video " + i, "AnimalPlanet", List.of("spam")));
      Thread.sleep(100L);
      videosClient.publish(new VideoDTO("Excluded video " + i, "OtherUser", List.of("spam")));
    }

    try (ApplicationContext ctx = ApplicationContext.run(Environment.CLI, Environment.TEST)) {
      String[] args = new String[] {"-a", "AnimalPlanet"};
      PicocliRunner.run(sut, ctx, args);
      assertThat(StringUtils.countMatches(baos.toString(), "Author: "))
          .isEqualTo(10); // only the 10 videos by "AnimalPlanet" are returned
      assertThat(baos.toString()).doesNotContain("OtherUser").doesNotContain("Excluded video ");
    }
  }

  @Test
  @DisplayName("Can filter by hashtag name")
  public void canFilterByHashtagName() throws InterruptedException {
    usersClient.registerUser(new UserDTO("AnimalPlanet"));

    for (int i = 0; i < 10; i++) {
      videosClient.publish(
          new VideoDTO("Included video " + i, "AnimalPlanet", List.of("Included")));
      Thread.sleep(100L);
      videosClient.publish(new VideoDTO("Excluded video " + i, "AnimalPlanet", List.of("spam")));
    }

    try (ApplicationContext ctx = ApplicationContext.run(Environment.CLI, Environment.TEST)) {
      String[] args = new String[] {"-h", "Included"};
      PicocliRunner.run(sut, ctx, args);
      assertThat(StringUtils.countMatches(baos.toString(), "Author: "))
          .isEqualTo(10); // only the 10 videos with hashtag "Included" are returned
      assertThat(baos.toString()).doesNotContain("spam");
    }
  }
}
