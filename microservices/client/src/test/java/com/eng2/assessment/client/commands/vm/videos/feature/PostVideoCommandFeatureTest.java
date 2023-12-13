package com.eng2.assessment.client.commands.vm.videos.feature;

import static org.assertj.core.api.Assertions.assertThat;

import com.eng2.assessment.client.commands.vm.videos.PostVideoCommand;
import com.eng2.assessment.client.utils.AbstractFeatureTest;
import com.eng2.assessment.client.utils.FeatureTestExtension;
import com.eng2.assessment.generated.vm.api.UsersClient;
import com.eng2.assessment.generated.vm.api.VideosClient;
import com.eng2.assessment.generated.vm.dto.VideoResponseDTO;
import io.micronaut.configuration.picocli.PicocliRunner;
import io.micronaut.context.ApplicationContext;
import io.micronaut.context.env.Environment;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@MicronautTest
@Tag("feature-test")
@ExtendWith(FeatureTestExtension.class)
@DisplayName("Feature tests for the `post-video` command")
public class PostVideoCommandFeatureTest extends AbstractFeatureTest {

  @Inject VideosClient videosClient;
  @Inject UsersClient usersClient;

  private ByteArrayOutputStream baos;

  private final Class<PostVideoCommand> sut = PostVideoCommand.class;

  @BeforeEach
  public void setup() {
    baos = new ByteArrayOutputStream();
    System.setOut(new PrintStream(baos));
  }

  @Test
  @DisplayName("When provided author does not exist")
  public void whenNoAuthor() {
    try (ApplicationContext ctx = ApplicationContext.run(Environment.CLI, Environment.TEST)) {
      String[] args =
          new String[] {"-a", "someAuthor", "-t", "me at the zoo", "-h", "tiger, lion, giraffe"};
      PicocliRunner.run(sut, ctx, args);
      assertThat(baos.toString())
          .contains("Something went wrong:")
          .contains("Could not find author with username someAuthor");
    }
  }

  @Test
  @DisplayName("When provided hashtags contain unsafe characters")
  public void whenBadHashtags() {
    usersClient.registerUser("someAuthor");
    try (ApplicationContext ctx = ApplicationContext.run(Environment.CLI, Environment.TEST)) {
      String[] args =
          new String[] {"-a", "someAuthor", "-t", "me at the zoo", "-h", "omg!, no way!, ???"};
      PicocliRunner.run(sut, ctx, args);
      assertThat(baos.toString())
          .contains("Something went wrong:")
          .contains("One or more hashtags contained unsafe characters")
          .contains("Offending hashtags are")
          .contains("omg!")
          .contains("no way!")
          .contains("???");
    }
  }

  @Test
  @DisplayName("Happy path test")
  public void happyPath() {
    usersClient.registerUser("someAuthor");

    try (ApplicationContext ctx = ApplicationContext.run(Environment.CLI, Environment.TEST)) {
      String[] args =
          new String[] {"-a", "someAuthor", "-t", "Me at the zoo", "-h", "tiger, lion, giraffe"};
      PicocliRunner.run(sut, ctx, args);
      assertThat(baos.toString()).contains("Success!").contains("Created video with ID");
      assertThat(videosClient.list(null, null).result()).hasSize(1);
      // Using the client instead of the CLI to retrieve users to not depend on the correctness of
      // the command's implementation
      VideoResponseDTO result = videosClient.list(null, null).result().get(0);
      assertThat(result.title()).isEqualTo("Me at the zoo");
      assertThat(result.authorUsername()).isEqualTo("someAuthor");
      assertThat(result.hashtagIds()).containsExactlyInAnyOrder("tiger", "lion", "giraffe");
    }
  }
}
