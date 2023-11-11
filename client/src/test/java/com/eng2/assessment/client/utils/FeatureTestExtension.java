package com.eng2.assessment.client.utils;

import static com.eng2.assessment.client.utils.TestContainerServicesInfo.*;

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
          .withLocalCompose(
              !Boolean.parseBoolean(
                  System.getenv()
                      .get("RUNNING_IN_CI"))); // use local docker compose if not running in CI

  @Override
  public void beforeEach(ExtensionContext extensionContext) throws Exception {
    try (Connection vmConnection =
            DriverManager.getConnection(VM_DB_JDBC_URL, VM_DB_USERNAME, VM_DB_PASSWORD);
        Connection thmConnection =
            DriverManager.getConnection(THM_DB_JDBC_URL, THM_DB_USERNAME, THM_DB_PASSWORD)) {
      try (Statement vmStatement = vmConnection.createStatement();
          Statement thmStatement = thmConnection.createStatement(); ) {
        vmStatement.addBatch("SET foreign_key_checks = 0;");
        vmStatement.addBatch("TRUNCATE TABLE video_hashtag;");
        vmStatement.addBatch("TRUNCATE TABLE user_video;");
        vmStatement.addBatch("TRUNCATE TABLE video;");
        vmStatement.addBatch("TRUNCATE TABLE user;");
        vmStatement.addBatch("TRUNCATE TABLE hashtag;");
        vmStatement.addBatch("SET foreign_key_checks = 1;");
        vmStatement.executeBatch();
        thmStatement.executeUpdate("TRUNCATE TABLE trending_hashtag");
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
