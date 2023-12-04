package com.eng2.assessment.client.commands.sm.subscriptions.feature;

import static com.eng2.assessment.client.utils.TestContainerServicesInfo.*;
import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.assertj.core.api.Assertions.assertThat;

import com.eng2.assessment.client.commands.sm.subscriptions.ManageSubscriptionsCommand;
import com.eng2.assessment.client.utils.AbstractFeatureTest;
import com.eng2.assessment.client.utils.FeatureTestExtension;
import io.micronaut.configuration.picocli.PicocliRunner;
import io.micronaut.context.ApplicationContext;
import io.micronaut.context.env.Environment;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

/**
 * Feature tests for the `manage-subscriptions` command. Note: the subscription microservice does
 * not provide the functionality of accessing or modifying its user list. Therefore, an alternative
 * approach is taken, where
 *
 * <ul>
 *   <li>Raw SQL is executed into the subscription microservice database to create the user and
 *       hashtag
 *   <li>The success criteria is that a second attempt to subscribe the same user to the same
 *       hashtag fails with the correct error message
 * </ul>
 */
@MicronautTest
@Tag("feature-test")
@ExtendWith(FeatureTestExtension.class)
@DisplayName("Feature tests for the `manage-subscriptions` command")
public class ManageSubscriptionsCommandFeatureTest extends AbstractFeatureTest {
  private ByteArrayOutputStream baos;

  private final Class<ManageSubscriptionsCommand> sut = ManageSubscriptionsCommand.class;

  @BeforeEach
  public void setup() {
    baos = new ByteArrayOutputStream();
    System.setOut(new PrintStream(baos));
  }

  @Test
  @DisplayName("User is able to unsubscribe but can do so only once")
  public void canUnSubscribe() throws SQLException {
    seedUser("ZooLover");
    seedHashtag("Zoo");

    try (ApplicationContext ctx = ApplicationContext.run(Environment.CLI)) {
      String[] subArgs = new String[] {"-a", "SUBSCRIBE", "-h", "Zoo", "-u", "ZooLover"};
      PicocliRunner.run(sut, ctx, subArgs);
      assertThat(baos.toString())
          .contains("Success!")
          .contains("User ZooLover subscribed to hashtag Zoo");
      String[] unSubArgs = new String[] {"-a", "UNSUBSCRIBE", "-h", "Zoo", "-u", "ZooLover"};
      PicocliRunner.run(sut, ctx, unSubArgs);
      assertThat(baos.toString())
          .contains("Success!")
          .contains("User ZooLover unsubscribed from hashtag Zoo");

      PicocliRunner.run(sut, ctx, unSubArgs);
      assertThat(baos.toString())
          .contains("Success!")
          .contains("User ZooLover is not subscribed to hashtag Zoo");
    }
  }

  @Test
  @DisplayName("User is able to subscribe but can do so only once")
  public void canSubscribe() throws SQLException {
    seedUser("ZooLover");
    seedHashtag("Zoo");

    try (ApplicationContext ctx = ApplicationContext.run(Environment.CLI)) {
      String[] args = new String[] {"-a", "SUBSCRIBE", "-h", "Zoo", "-u", "ZooLover"};
      PicocliRunner.run(sut, ctx, args);
      assertThat(baos.toString())
          .contains("Success!")
          .contains("User ZooLover subscribed to hashtag Zoo");

      PicocliRunner.run(sut, ctx, args);
      assertThat(baos.toString())
          .contains("Something went wrong: ")
          .contains("User ZooLover is already subscribed to hashtag Zoo");
    }
  }

  private void seedUser(String userName) throws SQLException {
    try (Connection smConnection =
        DriverManager.getConnection(SM_DB_JDBC_URL, SM_DB_USERNAME, SM_DB_PASSWORD); ) {
      try (Statement smStatement = smConnection.createStatement()) {
        smStatement.executeUpdate("INSERT INTO user (user_name) values ('" + userName + "');");
      }
    }
  }

  private void seedHashtag(String hashtagName) throws SQLException {
    try (Connection smConnection =
        DriverManager.getConnection(SM_DB_JDBC_URL, SM_DB_USERNAME, SM_DB_PASSWORD); ) {
      try (Statement smStatement = smConnection.createStatement()) {
        smStatement.executeUpdate("INSERT INTO hashtag (name) values ('" + hashtagName + "');");
      }
    }
  }
}
