package com.eng2.assessment.vm.controllers;

import static org.assertj.core.api.Assertions.assertThat;

import com.eng2.assessment.generated.vm.api.HealthClient;
import com.eng2.assessment.vm.utils.DbCleanupExtension;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@MicronautTest(transactional = false)
@ExtendWith(DbCleanupExtension.class)
public class HealthControllerTest {
  @Inject HealthClient healthClient;

  @Test
  public void reportsHealth() {
    HttpResponse<String> result = healthClient.health();
    assertThat(result.code()).isEqualTo(HttpStatus.OK.getCode());
    assertThat(result.body()).isEqualTo("Service running");
  }
}
