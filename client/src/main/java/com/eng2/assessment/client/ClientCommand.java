package com.eng2.assessment.client;

import com.eng2.assessment.client.commands.thm.ListTrendingHashtagsCommand;
import com.eng2.assessment.client.commands.vm.users.ListUsersCommand;
import com.eng2.assessment.client.commands.vm.users.RegisterUserCommand;
import com.eng2.assessment.client.commands.vm.videos.*;
import io.micronaut.configuration.picocli.PicocliRunner;
import picocli.CommandLine.Command;

@Command(
    name = "client",
    description =
        "The root command for the video platform. Please use the subcommands to interact with videos.",
    mixinStandardHelpOptions = true,
    subcommands = {
      ListUsersCommand.class,
      RegisterUserCommand.class,
      PostVideoCommand.class,
      InteractWithVideoCommand.class,
      ListVideosCommand.class,
      ListTrendingHashtagsCommand.class
    })
public class ClientCommand implements Runnable {
  public static void main(String[] args) {
    PicocliRunner.run(ClientCommand.class, args);
  }

  public void run() {}
}
