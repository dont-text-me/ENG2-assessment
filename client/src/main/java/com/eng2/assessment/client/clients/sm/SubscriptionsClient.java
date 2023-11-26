package com.eng2.assessment.client.clients.sm;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Put;
import io.micronaut.http.client.annotation.Client;

@Client(
    value = "${client-urls.sm.subscriptions:`http://localhost:8082/subscriptions`}",
    errorType = String.class)
public interface SubscriptionsClient {
  @Put("/{userName}/subscribe")
  HttpResponse<String> subscribe(String userName, @Body String hashtagName);

  @Put("/{userName}/unsubscribe")
  HttpResponse<String> unsubscribe(String userName, @Body String hashtagName);
}
