package com.eng2.assessment.client.commands.vm.users;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import jakarta.inject.Inject;
import picocli.CommandLine;
import vm.api.UsersClient;
import vm.dto.UserDTO;

@CommandLine.Command(name = "register-user", mixinStandardHelpOptions = true)
public class RegisterUserCommand implements Runnable {
  @Inject private UsersClient client;

  @CommandLine.Option(
      names = {"-u", "--username"},
      required = true,
      description = "The username of the user to be created")
  private String userName;

  @Override
  public void run() {
    HttpResponse<String> result = client.registerUser(new UserDTO(userName));
    if (result.status().equals(HttpStatus.CREATED)) {
      System.out.println("Success! " + result.body());
    } else {
      System.out.println("Something went wrong: " + result.body());
    }
  }
}
