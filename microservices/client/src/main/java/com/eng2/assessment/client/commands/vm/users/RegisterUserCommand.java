package com.eng2.assessment.client.commands.vm.users;

import com.eng2.assessment.generated.commands.ARegisterUserCommand;
import com.eng2.assessment.generated.vm.api.UsersClient;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import jakarta.inject.Inject;
import picocli.CommandLine;

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
