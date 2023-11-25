package com.eng2.assessment.client.commands.sm.recommendations.unit;

import static com.eng2.assessment.client.utils.mockResponses.MockResponses.getRecommendationsList;
import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;
import static org.assertj.core.api.Assertions.assertThat;

import com.eng2.assessment.client.commands.sm.recommendations.GetRecommendationsCommand;
import com.eng2.assessment.client.utils.mockResponses.MinifiedVideoRecommendationDetails;
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

public class GetRecommendationsCommandUnitTest {
  @RegisterExtension
  static WireMockExtension wireMock =
      WireMockExtension.newInstance().options(wireMockConfig().port(3002)).build();

  private ByteArrayOutputStream baos;

  private final Class<GetRecommendationsCommand> sut = GetRecommendationsCommand.class;

  @BeforeEach
  public void setup() {
    baos = new ByteArrayOutputStream();
    System.setOut(new PrintStream(baos));
  }

  @Test
  public void happyPathTest() {
    try (ApplicationContext ctx = ApplicationContext.run(Environment.CLI, "unit-test")) {
      wireMock.stubFor(
          WireMock.get("/recommendations/ZooLover?hashtagName=Zoo")
              .willReturn(
                  ResponseDefinitionBuilder.responseDefinition()
                      .withStatus(HttpStatus.OK.getCode())
                      .withHeader("Content-Type", MediaType.APPLICATION_JSON)
                      .withBody(
                          getRecommendationsList(
                              null,
                              new MinifiedVideoRecommendationDetails("Video 1", 10, List.of("Zoo")),
                              new MinifiedVideoRecommendationDetails("Video 2", 6, List.of("Zoo")),
                              new MinifiedVideoRecommendationDetails(
                                  "Video 3", 1, List.of("Zoo"))))));
      String[] args = new String[] {"-h", "Zoo", "-u", "ZooLover"};
      PicocliRunner.run(sut, ctx, args);
      wireMock.verify(getRequestedFor(urlEqualTo("/recommendations/ZooLover?hashtagName=Zoo")));
      assertThat(baos.toString())
          .contains(
              "Video 1 (10 views)",
              "Hashtags: Zoo",
              "------",
              "Video 2 (6 views)",
              "Hashtags: Zoo",
              "------",
              "Video 3 (1 view)", // Tests that the plural/singular is correct for videos with 1
              // view
              "Hashtags: Zoo",
              "------");
    }
  }

  @Test
  public void handlesError() {
    try (ApplicationContext ctx = ApplicationContext.run(Environment.CLI, "unit-test")) {
      wireMock.stubFor(
          WireMock.get("/recommendations/ZooLover?hashtagName=Zoo")
              .willReturn(
                  ResponseDefinitionBuilder.responseDefinition()
                      .withStatus(HttpStatus.BAD_REQUEST.getCode())
                      .withHeader("Content-Type", MediaType.APPLICATION_JSON)
                      .withBody(getRecommendationsList("Error!"))));
      String[] args = new String[] {"-h", "Zoo", "-u", "ZooLover"};
      PicocliRunner.run(sut, ctx, args);
      wireMock.verify(getRequestedFor(urlEqualTo("/recommendations/ZooLover?hashtagName=Zoo")));
      assertThat(baos.toString()).contains("Something went wrong: ", "Error!");
    }
  }
}
