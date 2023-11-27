package com.eng2.assessment.client.commands.vm.users.feature;

import static com.eng2.assessment.client.utils.TestContainerServicesInfo.*;
import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.assertj.core.api.Assertions.assertThat;

import com.eng2.assessment.client.commands.vm.users.RegisterUserCommand;
import com.eng2.assessment.client.utils.AbstractFeatureTest;
import com.eng2.assessment.client.utils.FeatureTestExtension;
import io.micronaut.configuration.picocli.PicocliRunner;
import io.micronaut.context.ApplicationContext;
import io.micronaut.context.env.Environment;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@MicronautTest
@Tag("feature-test")
@ExtendWith(FeatureTestExtension.class)
@DisplayName("Feature tests for the `register-user` command")
public class RegisterUserCommandFeatureTest extends AbstractFeatureTest {

  private ByteArrayOutputStream baos;

  private final Class<RegisterUserCommand> sut = RegisterUserCommand.class;

  @BeforeEach
  public void setup() {
    baos = new ByteArrayOutputStream();
    System.setOut(new PrintStream(baos));
  }

  @Test
  @DisplayName(
      "Can create user. Created user also appears in the database of the subscription microservice")
  public void canDisplayUser() throws SQLException, InterruptedException {
    try (ApplicationContext ctx = ApplicationContext.run(Environment.CLI)) {
      String[] args = new String[] {"-u", "newUser"};
      PicocliRunner.run(sut, ctx, args);
      assertThat(baos.toString())
          .contains("Success!")
          .contains("Created user with username")
          .contains("newUser");
      Thread.sleep(2000L);

      assertThat(getSmUserList()).contains("newUser");
      assertThat(getVmUserList()).contains("newUser");
    }
  }

  private String getSmUserList() throws SQLException {
    try (Connection smConnection =
        DriverManager.getConnection(SM_DB_JDBC_URL, SM_DB_USERNAME, SM_DB_PASSWORD); ) {
      try (Statement smStatement = smConnection.createStatement()) {
        ResultSet resultSet = smStatement.executeQuery("SELECT user_name FROM user;");
        List<String> result = new ArrayList<>();
        while (resultSet.next()) {
          result.add(resultSet.getString("user_name"));
        }
        return String.join(",", result);
      }
    }
  }

  private String getVmUserList() throws SQLException {
    try (Connection vmConnection =
        DriverManager.getConnection(VM_DB_JDBC_URL, VM_DB_USERNAME, VM_DB_PASSWORD); ) {
      try (Statement vmStatement = vmConnection.createStatement()) {
        ResultSet resultSet = vmStatement.executeQuery("SELECT username FROM user;");
        List<String> result = new ArrayList<>();
        while (resultSet.next()) {
          result.add(resultSet.getString("userName"));
        }
        return String.join(",", result);
      }
    }
  }
}
