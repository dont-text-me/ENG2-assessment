package com.eng2.assessment.vm.controllers;

import com.eng2.assessment.generated.vm.api.IUsersClient;
import com.eng2.assessment.generated.vm.domain.User;
import com.eng2.assessment.generated.vm.dto.UserRegisteredMessageValueDTO;
import com.eng2.assessment.generated.vm.events.UserCreationProducer;
import com.eng2.assessment.vm.repositories.UsersRepository;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import jakarta.inject.Inject;
import java.net.URI;

@Controller("/users")
public class UsersController implements IUsersClient {

  @Inject private UsersRepository repo;
  @Inject private UserCreationProducer producer;

  @Post("/")
  public HttpResponse<String> registerUser(@Body String userName) {
    User newUser = new User();
    newUser.setUsername(userName);
    if (repo.existsByUsernameEqual(userName)) {
      return HttpResponse.badRequest("User with username " + userName + " already exists.");
    }
    repo.save(newUser);
    producer.produceUserRegisteredMessage(
        newUser.getUsername(), new UserRegisteredMessageValueDTO(newUser.getId()));
    return HttpResponse.created(URI.create("/users/" + newUser.getId()))
        .body(String.format("Created user with username " + newUser.getUsername()));
  }
}
