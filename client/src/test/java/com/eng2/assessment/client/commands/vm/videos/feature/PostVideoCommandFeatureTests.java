package com.eng2.assessment.client.commands.vm.videos.feature;

import static com.eng2.assessment.client.utils.TestContainerServicesInfo.*;
import static org.assertj.core.api.Assertions.assertThat;

import com.eng2.assessment.client.commands.vm.videos.ListVideosCommand;
import com.eng2.assessment.client.utils.FeatureTestExtension;
import io.micronaut.configuration.picocli.PicocliRunner;
import io.micronaut.context.ApplicationContext;
import io.micronaut.context.env.Environment;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testcontainers.containers.ComposeContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@MicronautTest
@Tag("feature-test")
@ExtendWith(FeatureTestExtension.class)
@DisplayName("Feature tests for the `post-video` command")
public class PostVideoCommandFeatureTests {

  private ByteArrayOutputStream baos;

  private final Class<ListVideosCommand> sut = ListVideosCommand.class;

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
