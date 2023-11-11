package com.eng2.assessment.client.utils;

import static com.eng2.assessment.client.utils.TestContainerServicesInfo.VM_NAME;
import static com.eng2.assessment.client.utils.TestContainerServicesInfo.VM_PORT;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.testcontainers.containers.ComposeContainer;

public class FeatureTestExtension
    implements BeforeAllCallback, AfterAllCallback, BeforeEachCallback {

  public static ComposeContainer ENV =
      new ComposeContainer(new File("src/test/resources/compose-feature-tests.yml"))
          .withExposedService(VM_NAME, VM_PORT)
          .withLocalCompose(true);

  @Override
  public void beforeEach(ExtensionContext extensionContext) throws Exception {
    try (Connection connection =
        DriverManager.getConnection(
            "jdbc:mariadb://localhost:3306/videos", "video", "videosecret")) {
      try (Statement statement = connection.createStatement()) {
        // TODO make this nicer (look at joining + deleting)
        statement.addBatch("SET foreign_key_checks = 0;");
        statement.addBatch("TRUNCATE TABLE video_hashtag;");
        statement.addBatch("TRUNCATE TABLE user_video;");
        statement.addBatch("TRUNCATE TABLE video;");
        statement.addBatch("TRUNCATE TABLE user;");
        statement.addBatch("TRUNCATE TABLE hashtag;");
        statement.addBatch("SET foreign_key_checks = 1;");

        statement.executeBatch();
      }
    }
  }

  @Override
  public void afterAll(ExtensionContext extensionContext) {
    ENV.stop();
  }

  @Override
  public void beforeAll(ExtensionContext extensionContext) {
    ENV.start();
  }
}
