package com.eng2.assessment.client.commands.vm.videos.unit;

import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;
import static org.assertj.core.api.Assertions.assertThat;

import com.eng2.assessment.client.commands.vm.videos.PostVideoCommand;
import com.github.tomakehurst.wiremock.client.ResponseDefinitionBuilder;
import com.github.tomakehurst.wiremock.client.WireMock;
import com.github.tomakehurst.wiremock.junit5.WireMockExtension;
import io.micronaut.configuration.picocli.PicocliRunner;
import io.micronaut.context.ApplicationContext;
import io.micronaut.context.env.Environment;
import io.micronaut.http.HttpStatus;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PostVideoCommandUnitTest {

  @RegisterExtension
  static WireMockExtension wireMock =
      WireMockExtension.newInstance().options(wireMockConfig().port(8080)).build();

  private ByteArrayOutputStream baos;

  private final Class<PostVideoCommand> sut = PostVideoCommand.class;

  @BeforeEach
  public void setup() {
    baos = new ByteArrayOutputStream();
    System.setOut(new PrintStream(baos));
  }

  @Test
  public void happyPathTest() {
    try (ApplicationContext ctx = ApplicationContext.run(Environment.CLI, Environment.TEST)) {
      wireMock.stubFor(
          WireMock.post("/videos")
              .willReturn(
                  ResponseDefinitionBuilder.responseDefinition()
                      .withStatus(HttpStatus.CREATED.getCode())
                      .withBody("Created video with ID " + UUID.randomUUID())));

      String[] args =
          new String[] {"-a", "someAuthor", "-t", "me at the zoo", "-h", "tiger, lion, giraffe"};
      PicocliRunner.run(sut, ctx, args);
      assertThat(baos.toString()).contains("Success!").contains("Created video with ID");
    }
  }

  @ParameterizedTest
  @ValueSource(ints = {404, 400})
  public void handlesRequestFailure(int statusCode) {
    try (ApplicationContext ctx = ApplicationContext.run(Environment.CLI, Environment.TEST)) {
      wireMock.stubFor(
          WireMock.post("/videos")
              .willReturn(
                  ResponseDefinitionBuilder.responseDefinition()
                      .withStatus(statusCode)
                      .withBody("Error!")));

      String[] args =
          new String[] {"-a", "someAuthor", "-t", "me at the zoo", "-h", "tiger, lion, giraffe"};
      PicocliRunner.run(sut, ctx, args);
      assertThat(baos.toString()).contains("Something went wrong").contains("Error!");
    }
  }
}
