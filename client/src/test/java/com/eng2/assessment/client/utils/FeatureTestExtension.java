package com.eng2.assessment.client.utils;

import static com.eng2.assessment.client.utils.TestContainerServicesInfo.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

/** Resets the databases of each microservice inbetween feature tests. */
public class FeatureTestExtension implements BeforeEachCallback {

  @Override
  public void beforeEach(ExtensionContext extensionContext) throws Exception {
    try (Connection vmConnection =
            DriverManager.getConnection(VM_DB_JDBC_URL, VM_DB_USERNAME, VM_DB_PASSWORD);
        Connection thmConnection =
            DriverManager.getConnection(THM_DB_JDBC_URL, THM_DB_USERNAME, THM_DB_PASSWORD)) {
      try (Statement vmStatement = vmConnection.createStatement();
          Statement thmStatement = thmConnection.createStatement()) {
        // Note: this is not the most correct way to go about this,
        // but we are deleting everything so there is less need to worry about these checks.
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
}
