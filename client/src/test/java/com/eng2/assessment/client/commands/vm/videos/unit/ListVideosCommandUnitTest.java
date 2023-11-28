package com.eng2.assessment.client.commands.vm.videos.unit;

import static com.eng2.assessment.client.utils.mockResponses.MockResponses.getVideoList;
import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;
import static org.assertj.core.api.Assertions.assertThat;

import com.eng2.assessment.client.commands.vm.videos.ListVideosCommand;
import com.eng2.assessment.client.utils.mockResponses.MinifiedVideoDetails;
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
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

public class ListVideosCommandUnitTest {
  @RegisterExtension
  static WireMockExtension wireMock =
      WireMockExtension.newInstance().options(wireMockConfig().port(3000)).build();

  private ByteArrayOutputStream baos;

  private final Class<ListVideosCommand> sut = ListVideosCommand.class;

  @BeforeEach
  public void setup() {
    baos = new ByteArrayOutputStream();
    System.setOut(new PrintStream(baos));
  }

  @Test
  public void happyPathTestWithoutFilters() {
    try (ApplicationContext ctx = ApplicationContext.run(Environment.CLI, "unit-test")) {
      wireMock.stubFor(
          WireMock.get("/videos")
              .willReturn(
                  ResponseDefinitionBuilder.responseDefinition()
                      .withStatus(HttpStatus.OK.getCode())
                      .withHeader("Content-Type", MediaType.APPLICATION_JSON)
                      .withBody(
                          getVideoList(
                              new MinifiedVideoDetails("My video", "Joe", 5, 1, List.of("funny")),
                              new MinifiedVideoDetails(
                                  "Me at the zoo",
                                  "Maria",
                                  120,
                                  10,
                                  List.of("Giraffe", "Gorilla"))))));
      PicocliRunner.run(sut, ctx);
      assertThat(baos.toString())
          .contains("My video")
          .contains("Author: Joe")
          .contains("Likes: 5")
          .contains("Dislikes: 1")
          .contains("Hashtags: funny")
          .contains("---------")
          .contains("Me at the zoo")
          .contains("Author: Maria")
          .contains("Likes: 120")
          .contains("Dislikes: 10")
          .contains("Hashtags: ")
          .contains("Gorilla")
          .contains("Giraffe");
    }
  }

  @Test
  public void appliesAuthorUsername() {

    try (ApplicationContext ctx = ApplicationContext.run(Environment.CLI, "unit-test")) {
      wireMock.stubFor(
          WireMock.get(urlMatching("/videos"))
              .willReturn(
                  ResponseDefinitionBuilder.responseDefinition()
                      .withStatus(HttpStatus.OK.getCode())
                      .withHeader("Content-Type", MediaType.APPLICATION_JSON)));
      String[] args = new String[] {"-a", "someAuthor"};
      PicocliRunner.run(sut, ctx, args);
      wireMock.verify(getRequestedFor(urlEqualTo("/videos?author=someAuthor")));
    }
  }

  @Test
  public void appliesHashtagName() {

    try (ApplicationContext ctx = ApplicationContext.run(Environment.CLI, "unit-test")) {
      wireMock.stubFor(
          WireMock.get(urlMatching("/videos"))
              .willReturn(
                  ResponseDefinitionBuilder.responseDefinition()
                      .withStatus(HttpStatus.OK.getCode())
                      .withHeader("Content-Type", MediaType.APPLICATION_JSON)
                      .withBody("")));
      String[] args = new String[] {"-h", "someHashtag"};
      PicocliRunner.run(sut, ctx, args);
      wireMock.verify(getRequestedFor(urlEqualTo("/videos?hashtag=someHashtag")));
    }
  }

  @Test
  public void handlesEmptyList() {
    try (ApplicationContext ctx = ApplicationContext.run(Environment.CLI, "unit-test")) {
      wireMock.stubFor(
          WireMock.get("/videos")
              .willReturn(
                  ResponseDefinitionBuilder.responseDefinition()
                      .withStatus(HttpStatus.OK.getCode())
                      .withHeader("Content-Type", MediaType.APPLICATION_JSON)
                      .withBody(getVideoList())));
      PicocliRunner.run(sut, ctx);
      assertThat(baos.toString())
          .contains("No videos available. Please try again later or post a video");
    }
  }

  @Test
  public void handlesEmptyListWithFilters() {
    try (ApplicationContext ctx = ApplicationContext.run(Environment.CLI, "unit-test")) {
      wireMock.stubFor(
          WireMock.get(urlMatching("/videos"))
              .willReturn(
                  ResponseDefinitionBuilder.responseDefinition()
                      .withStatus(HttpStatus.OK.getCode())
                      .withHeader("Content-Type", MediaType.APPLICATION_JSON)));
      String[] args = new String[] {"-h", "someHashtag", "-a", "SomeUser"};

      PicocliRunner.run(sut, ctx, args);
      wireMock.verify(getRequestedFor(urlEqualTo("/videos?author=SomeUser&hashtag=someHashtag")));
      assertThat(baos.toString()).contains("No videos matching the filter criteria found");
    }
  }
}
