package com.eng2.assessment.client.commands.vm.videos.unit;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;
import static org.assertj.core.api.Assertions.assertThat;

import com.eng2.assessment.client.commands.vm.videos.InteractWithVideoCommand;
import com.github.tomakehurst.wiremock.client.ResponseDefinitionBuilder;
import com.github.tomakehurst.wiremock.client.WireMock;
import com.github.tomakehurst.wiremock.junit5.WireMockExtension;
import io.micronaut.configuration.picocli.PicocliRunner;
import io.micronaut.context.ApplicationContext;
import io.micronaut.context.env.Environment;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.MediaType;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Random;
import java.util.Set;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.RegisterExtension;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import wiremock.com.google.common.collect.Sets;

public class InteractWithVideoCommandUnitTest {
  @RegisterExtension
  static WireMockExtension wireMock =
      WireMockExtension.newInstance().options(wireMockConfig().port(3000)).build();

  private ByteArrayOutputStream baos;
  private final Random r = new Random();

  private final Class<InteractWithVideoCommand> sut = InteractWithVideoCommand.class;

  @BeforeEach
  public void setup() {
    baos = new ByteArrayOutputStream();
    System.setOut(new PrintStream(baos));
  }

  @ParameterizedTest
  @EnumSource(InteractWithVideoCommand.VideoInteractionType.class)
  public void canInteractWithVideo(InteractWithVideoCommand.VideoInteractionType type) {
    Long videoId = r.nextLong();
    String userName = "Some-user";

    try (ApplicationContext ctx = ApplicationContext.run(Environment.CLI, "unit-test")) {
      wireMock.stubFor(
          WireMock.put(urlMatching("/videos/" + videoId + "/" + type.toString().toLowerCase()))
              .willReturn(
                  ResponseDefinitionBuilder.responseDefinition()
                      .withStatus(HttpStatus.OK.getCode())
                      .withHeader("Content-Type", MediaType.APPLICATION_JSON)
                      .withBody("Interacted with video!")));
      String[] args =
          new String[] {"-v", videoId.toString(), "-t", type.toString(), "-u", userName};
      PicocliRunner.run(sut, ctx, args);
      wireMock.verify(
          putRequestedFor(
              urlEqualTo(String.format("/videos/%s/%s", videoId, type.toString().toLowerCase()))));
      assertThat(baos.toString()).contains("Success!").contains("Interacted with video!");
    }
  }

  /**
   * A workaround of junit's lack of ability to provide multiple sources to a test.
   *
   * <p>Computes a cartesian product between the set of possible video interactions(like, dislike,
   * watch) and some error codes (400, 404).
   */
  private static Stream<Arguments> interactionTypeXErrorCode() {
    return Sets.cartesianProduct(
            Set.of(InteractWithVideoCommand.VideoInteractionType.values()), Set.of(400, 404))
        .stream()
        .map(it -> Arguments.of(it.get(0), it.get(1)));
  }

  @ParameterizedTest
  @MethodSource("interactionTypeXErrorCode")
  public void handlesError(InteractWithVideoCommand.VideoInteractionType type, Integer status) {
    Long videoId = r.nextLong();
    String userName = "Some-user";

    try (ApplicationContext ctx = ApplicationContext.run(Environment.CLI, "unit-test")) {
      wireMock.stubFor(
          WireMock.put(urlMatching("/videos/" + videoId + "/" + type.toString().toLowerCase()))
              .willReturn(
                  ResponseDefinitionBuilder.responseDefinition()
                      .withStatus(status)
                      .withHeader("Content-Type", MediaType.APPLICATION_JSON)
                      .withBody("Error!")));
      String[] args =
          new String[] {"-v", videoId.toString(), "-t", type.toString(), "-u", userName};
      PicocliRunner.run(sut, ctx, args);
      assertThat(baos.toString()).contains("Something went wrong: ").contains("Error!");
    }
  }
}
