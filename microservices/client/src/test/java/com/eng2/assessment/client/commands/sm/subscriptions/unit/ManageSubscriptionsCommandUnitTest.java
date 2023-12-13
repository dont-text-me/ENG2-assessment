package com.eng2.assessment.client.commands.sm.subscriptions.unit;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;
import static org.assertj.core.api.Assertions.assertThat;

import com.eng2.assessment.client.commands.sm.subscriptions.ManageSubscriptionsCommand;
import com.eng2.assessment.generated.enums.SubscriptionAction;
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
import org.junit.jupiter.api.extension.RegisterExtension;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

public class ManageSubscriptionsCommandUnitTest {
  @RegisterExtension
  static WireMockExtension wireMock =
      WireMockExtension.newInstance().options(wireMockConfig().port(3002)).build();

  private ByteArrayOutputStream baos;

  private final Class<ManageSubscriptionsCommand> sut = ManageSubscriptionsCommand.class;

  @BeforeEach
  public void setup() {
    baos = new ByteArrayOutputStream();
    System.setOut(new PrintStream(baos));
  }

  @ParameterizedTest
  @EnumSource(SubscriptionAction.class)
  public void happyPathTest(SubscriptionAction action) {
    try (ApplicationContext ctx = ApplicationContext.run(Environment.CLI, "unit-test")) {
      wireMock.stubFor(
          WireMock.put("/subscriptions/ZooLover/" + action.toString().toLowerCase())
              .willReturn(
                  ResponseDefinitionBuilder.responseDefinition()
                      .withStatus(HttpStatus.OK.getCode())
                      .withHeader("Content-Type", MediaType.APPLICATION_JSON)
                      .withBody("Action complete")));
      String[] args = new String[] {"-a", action.toString(), "-h", "Zoo", "-u", "ZooLover"};
      PicocliRunner.run(sut, ctx, args);
      assertThat(baos.toString()).contains("Success!").contains("Action complete");
      wireMock.verify(
          putRequestedFor(urlEqualTo("/subscriptions/ZooLover/" + action.toString().toLowerCase()))
              .withRequestBody(matching("Zoo")));
    }
  }

  @ParameterizedTest
  @EnumSource(SubscriptionAction.class)
  public void handlesError(SubscriptionAction action) {
    try (ApplicationContext ctx = ApplicationContext.run(Environment.CLI, "unit-test")) {
      wireMock.stubFor(
          WireMock.put("/subscriptions/ZooLover/" + action.toString().toLowerCase())
              .willReturn(
                  ResponseDefinitionBuilder.responseDefinition()
                      .withStatus(HttpStatus.BAD_REQUEST.getCode())
                      .withHeader("Content-Type", MediaType.APPLICATION_JSON)
                      .withBody("Error!")));
      String[] args = new String[] {"-a", action.toString(), "-h", "Zoo", "-u", "ZooLover"};
      PicocliRunner.run(sut, ctx, args);
      assertThat(baos.toString()).contains("Something went wrong: ").contains("Error!");
    }
  }
}
