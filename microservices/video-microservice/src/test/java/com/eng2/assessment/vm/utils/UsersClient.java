package com.eng2.assessment.vm.utils;

import vm.dto.UserDTO;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.client.annotation.Client;

@Client(value = "${users.url: `http://localhost:8080/users`}", errorType = String.class)
public interface UsersClient {
  @Post("/")
  HttpResponse<String> registerUser(@Body UserDTO userDetails);
}
