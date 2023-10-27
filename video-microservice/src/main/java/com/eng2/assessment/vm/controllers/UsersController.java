package com.eng2.assessment.vm.controllers;

import com.eng2.assessment.vm.domain.User;
import com.eng2.assessment.vm.dto.UserDTO;
import com.eng2.assessment.vm.repositories.UsersRepository;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import jakarta.inject.Inject;
import java.net.URI;

@Controller("/users")
public class UsersController {

  @Inject private UsersRepository repo;

  @Post("/")
  public HttpResponse<String> registerUser(@Body UserDTO userDetails) {
    User newUser = new User();
    newUser.setUsername(userDetails.username());

    repo.save(newUser);

    return HttpResponse.created(URI.create("/users/" + newUser.getId()));
  }
}
