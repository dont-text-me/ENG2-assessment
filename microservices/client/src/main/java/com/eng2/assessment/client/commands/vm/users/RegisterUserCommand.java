package com.eng2.assessment.client.commands.vm.users;

import commands.ARegisterUserCommand;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import jakarta.inject.Inject;
import picocli.CommandLine;
import vm.api.UsersClient;

@CommandLine.Command(name = "register-user")
public class RegisterUserCommand extends ARegisterUserCommand {
  @Inject private UsersClient client;

  @Override
  public void run() {
    HttpResponse<String> result = client.registerUser(this.userName);
    if (result.status().equals(HttpStatus.CREATED)) {
      System.out.println("Success! " + result.body());
    } else {
      System.out.println("Something went wrong: " + result.body());
    }
  }
}
