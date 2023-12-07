package com.eng2.assessment.vm.controllers;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import vm.api.IHealthClient;

@Controller("/health")
public class HealthController implements IHealthClient {
  @Override
  @Get("/")
  public HttpResponse<String> health() {
    return HttpResponse.ok("Service running");
  }
}
