package com.eng2.assessment.client.clients.vm;

import com.eng2.assessment.vm.dto.UserDTO;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.client.annotation.Client;

@Client(value = "${client-urls.vm.users:`http://localhost:8080/users`}", errorType = String.class)
public interface UsersClient {
  @Post("/")
  HttpResponse<String> registerUser(@Body UserDTO userDetails);
}
