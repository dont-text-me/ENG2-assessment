package com.eng2.assessment.thm.controllers;

import com.eng2.assessment.generated.thm.api.IHealthClient;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/health")
public class HealthController implements IHealthClient {
  @Override
  @Get("/")
  public HttpResponse<String> health() {
    return HttpResponse.ok("Service running");
  }
}
