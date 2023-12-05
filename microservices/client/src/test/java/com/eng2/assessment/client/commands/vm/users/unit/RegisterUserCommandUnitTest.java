package com.eng2.assessment.client.commands.vm.users.unit;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;
import static org.assertj.core.api.Assertions.assertThat;

import com.eng2.assessment.client.commands.vm.users.RegisterUserCommand;
import com.github.tomakehurst.wiremock.client.ResponseDefinitionBuilder;
import com.github.tomakehurst.wiremock.client.WireMock;
import com.github.tomakehurst.wiremock.junit5.WireMockExtension;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.micronaut.configuration.picocli.PicocliRunner;
import io.micronaut.context.ApplicationContext;
import io.micronaut.context.env.Environment;
import io.micronaut.http.HttpStatus;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;
import vm.dto.UserDTO;

public class RegisterUserCommandUnitTest {
  @RegisterExtension
  static WireMockExtension wireMock =
      WireMockExtension.newInstance().options(wireMockConfig().port(3000)).build();

  private ByteArrayOutputStream baos;

  private final Gson gson = new GsonBuilder().create();

  private final Class<RegisterUserCommand> sut = RegisterUserCommand.class;

  @BeforeEach
  public void setup() {
    baos = new ByteArrayOutputStream();
    System.setOut(new PrintStream(baos));
  }

  @Test
  public void happyPathTest() {
    try (ApplicationContext ctx = ApplicationContext.run(Environment.CLI, "unit-test")) {
      wireMock.stubFor(
          WireMock.post("/users")
              .willReturn(
                  ResponseDefinitionBuilder.responseDefinition()
                      .withStatus(HttpStatus.CREATED.getCode())
                      .withBody("Created user with username firstUser")));

      String[] args = new String[] {"-u", "someUser"};
      PicocliRunner.run(sut, ctx, args);
      wireMock.verify(
          postRequestedFor(urlEqualTo("/users"))
              .withRequestBody(equalTo(gson.toJson(new UserDTO("someUser")))));
      assertThat(baos.toString()).contains("Success!").contains("Created user with username");
    }
  }

  @Test
  public void handlesError() {
    try (ApplicationContext ctx = ApplicationContext.run(Environment.CLI, "unit-test")) {
      wireMock.stubFor(
          WireMock.post("/users")
              .willReturn(
                  ResponseDefinitionBuilder.responseDefinition()
                      .withStatus(HttpStatus.BAD_REQUEST.getCode())
                      .withBody("Error!")));

      String[] args = new String[] {"-u", "someUser"};
      PicocliRunner.run(sut, ctx, args);
      wireMock.verify(
          postRequestedFor(urlEqualTo("/users"))
              .withRequestBody(equalTo(gson.toJson(new UserDTO("someUser")))));
      assertThat(baos.toString()).contains("Something went wrong:").contains("Error!");
    }
  }
}
