package com.eng2.assessment.thm.controllers;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import thm.api.IHealthClient;
@Controller("/health")
public class HealthController implements IHealthClient {
    @Override
    public HttpResponse<String> health() {
        return HttpResponse.ok("Service running");
    }
}
