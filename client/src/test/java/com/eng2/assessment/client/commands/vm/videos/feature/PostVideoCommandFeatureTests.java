package com.eng2.assessment.client.commands.vm.videos.feature;

import static com.eng2.assessment.client.utils.TestContainerServicesInfo.*;
import static org.assertj.core.api.Assertions.assertThat;

import com.eng2.assessment.client.commands.vm.videos.ListVideosCommand;
import io.micronaut.configuration.picocli.PicocliRunner;
import io.micronaut.context.ApplicationContext;
import io.micronaut.context.env.Environment;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testcontainers.containers.ComposeContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@Testcontainers
public class PostVideoCommandFeatureTests {

  private ByteArrayOutputStream baos;

  private final Class<ListVideosCommand> sut = ListVideosCommand.class;

  @Container
  public static ComposeContainer ENV =
      new ComposeContainer(new File("src/test/resources/compose-feature-tests.yml"))
          .withExposedService(VM_NAME, VM_PORT)
          .withLocalCompose(true);

  @BeforeEach
  public void setup() {
    baos = new ByteArrayOutputStream();
    System.setOut(new PrintStream(baos));
  }

  @Test
  public void simpleTest() {
    try (ApplicationContext ctx = ApplicationContext.run(Environment.CLI, Environment.TEST)) {
      PicocliRunner.run(sut, ctx);
      assertThat(baos.toString())
          .contains("No videos available. Please try again later or post a video");
    }
  }
}
