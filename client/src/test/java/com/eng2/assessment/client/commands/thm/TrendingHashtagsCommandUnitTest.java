package com.eng2.assessment.client.commands.thm;

import static com.eng2.assessment.client.commands.vm.utils.mockResponses.MockResponses.getTrendingHashtagsList;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;
import static org.assertj.core.api.Assertions.assertThat;

import com.eng2.assessment.client.commands.vm.utils.mockResponses.MinifiedTrendingHashtagDetails;
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
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

public class TrendingHashtagsCommandUnitTest {
  @RegisterExtension
  static WireMockExtension wireMock =
      WireMockExtension.newInstance().options(wireMockConfig().port(8081)).build();

  private ByteArrayOutputStream baos;

  private final Class<ListTrendingHashtagsCommand> sut = ListTrendingHashtagsCommand.class;

  @BeforeEach
  public void setup() {
    baos = new ByteArrayOutputStream();
    System.setOut(new PrintStream(baos));
  }

  @Test
  public void happyPathTestWithoutFilters() {
    try (ApplicationContext ctx = ApplicationContext.run(Environment.CLI, Environment.TEST)) {
      wireMock.stubFor(
          WireMock.get("/trending-hashtags/latest")
              .willReturn(
                  ResponseDefinitionBuilder.responseDefinition()
                      .withStatus(HttpStatus.OK.getCode())
                      .withHeader("Content-Type", MediaType.APPLICATION_JSON)
                      .withBody(
                          getTrendingHashtagsList(
                              new MinifiedTrendingHashtagDetails("Hashtag1", 50L),
                              new MinifiedTrendingHashtagDetails("Hashtag2", 20L)))));
      PicocliRunner.run(sut, ctx);
      assertThat(baos.toString())
          .contains("Latest trending hashtags")
          .contains("Hashtag1 (50 likes)")
          .contains("Hashtag2 (20 likes)");
    }
  }

  @Test
  public void handlesEmptyList() {
    try (ApplicationContext ctx = ApplicationContext.run(Environment.CLI, Environment.TEST)) {
      wireMock.stubFor(
          WireMock.get("/trending-hashtags/latest")
              .willReturn(
                  ResponseDefinitionBuilder.responseDefinition()
                      .withStatus(HttpStatus.OK.getCode())
                      .withHeader("Content-Type", MediaType.APPLICATION_JSON)
                      .withBody(getTrendingHashtagsList())));
      PicocliRunner.run(sut, ctx);
      assertThat(baos.toString()).contains("No statistics available. Please try again later");
    }
  }
}
