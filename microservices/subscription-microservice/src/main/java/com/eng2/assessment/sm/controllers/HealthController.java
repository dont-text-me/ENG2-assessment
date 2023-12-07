package com.eng2.assessment.sm.controllers;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import sm.api.IHealthClient;
@Controller("/health")
public class HealthController implements IHealthClient {
    @Override
    @Get("/")
    public HttpResponse<String> health() {
        return HttpResponse.ok("Service running");
    }
}
