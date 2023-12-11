package com.eng2.assessment.sm.controllers;

import com.eng2.assessment.generated.sm.api.IHealthClient;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/health")
public class HealthController implements IHealthClient {
  @Get("/")
  public HttpResponse<String> health() {
    return HttpResponse.ok("Service running");
  }
}
