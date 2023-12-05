package com.eng2.assessment.vm.controllers;

import vm.domain.User;
import vm.dto.UserDTO;
import com.eng2.assessment.vm.events.UserCreationProducer;
import com.eng2.assessment.vm.repositories.UsersRepository;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import jakarta.inject.Inject;
import vm.api.UserAPIDefinition;

import java.net.URI;

@Controller("/users")
public class UsersController {

  @Inject private UsersRepository repo;
  @Inject private UserCreationProducer producer;

  @Post("/")
  public HttpResponse<String> registerUser(@Body UserDTO userDetails) {
    User newUser = new User();
    newUser.setUsername(userDetails.username());
    if (repo.existsByUsernameEqual(userDetails.username())) {
      return HttpResponse.badRequest(
          "User with username " + userDetails.username() + " already exists.");
    }
    repo.save(newUser);
    producer.userRegistered(newUser.getUsername(), newUser.getId());
    return HttpResponse.created(URI.create("/users/" + newUser.getId()))
        .body(String.format("Created user with username " + newUser.getUsername()));
  }

}
