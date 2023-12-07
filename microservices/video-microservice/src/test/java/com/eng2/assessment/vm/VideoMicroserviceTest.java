package com.eng2.assessment.vm;

import io.micronaut.http.HttpStatus;
import io.micronaut.runtime.EmbeddedApplication;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import vm.api.HealthClient;

import static org.assertj.core.api.Assertions.assertThat;

@MicronautTest
class VideoMicroserviceTest {

  @Inject EmbeddedApplication<?> application;
  @Inject
  HealthClient healthClient;

  @Test
  void testItWorks() {
    Assertions.assertTrue(application.isRunning());
    assertThat(healthClient.health().code()).isEqualTo(HttpStatus.OK.getCode());
  }
}
