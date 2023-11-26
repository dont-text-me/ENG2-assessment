package com.eng2.assessment.client.utils;

public class TestContainerServicesInfo {
  public static final Integer VM_PORT = 8080;
  public static final Integer THM_PORT = 8081;

  public static final String VM_NAME = "vm";
  public static final String THM_NAME = "thm";

  public static final String VM_DB_JDBC_URL = "jdbc:mariadb://localhost:3306/videos";

  public static final String VM_DB_USERNAME = "video";
  public static final String VM_DB_PASSWORD = "featureTestVideoSecret";

  public static final String THM_DB_JDBC_URL = "jdbc:mariadb://localhost:3307/trendingHashtags";
  public static final String THM_DB_USERNAME = "trendingHashtag";
  public static final String THM_DB_PASSWORD = "featureTestHashtagSecret";

  public static final String SM_DB_JDBC_URL = "jdbc:mariadb://localhost:3308/subscriptions";
  public static final String SM_DB_USERNAME = "subscriptions";
  public static final String SM_DB_PASSWORD = "featureTestSubscriptionSecret";

  public static final String KAFKA_BOOTSTRAP_SERVERS =
      "localhost:9092,localhost:9092,localhost:9092";
}
