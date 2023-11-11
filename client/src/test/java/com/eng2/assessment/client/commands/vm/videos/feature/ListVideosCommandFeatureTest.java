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
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(FeatureTestExtension.class)
@MicronautTest
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
  public void whenNoVideos() {
    try (ApplicationContext ctx = ApplicationContext.run(Environment.CLI, Environment.TEST)) {
      PicocliRunner.run(sut, ctx);
      assertThat(baos.toString())
          .contains("No videos available. Please try again later or post a video");
    }
  }

  @Test
  public void canListVideos() {
    usersClient.registerUser(new UserDTO("AnimalPlanet"));
    videosClient.publish(
        new VideoDTO("Me at the zoo", "AnimalPlanet", List.of("Zoo", "Giraffe", "Gorilla")));

    try (ApplicationContext ctx = ApplicationContext.run(Environment.CLI, Environment.TEST)) {
      PicocliRunner.run(sut, ctx);
      assertThat(baos.toString())
          .contains("No videos available. Please try again later or post a video");
    }
  }
}
