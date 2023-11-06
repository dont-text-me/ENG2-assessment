package com.eng2.assessment.client;

import com.eng2.assessment.client.commands.thm.ListTrendingHashtagsCommand;
import com.eng2.assessment.client.commands.vm.users.ListUsersCommand;
import com.eng2.assessment.client.commands.vm.users.RegisterUserCommand;
import com.eng2.assessment.client.commands.vm.videos.DislikeVideoCommand;
import com.eng2.assessment.client.commands.vm.videos.LikeVideoCommand;
import com.eng2.assessment.client.commands.vm.videos.PostVideoCommand;
import com.eng2.assessment.client.commands.vm.videos.WatchVideoCommand;
import io.micronaut.configuration.picocli.PicocliRunner;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(
    name = "client",
    description = "...",
    mixinStandardHelpOptions = true,
    subcommands = {
      ListUsersCommand.class,
      RegisterUserCommand.class,
      DislikeVideoCommand.class,
      ListUsersCommand.class,
      LikeVideoCommand.class,
      PostVideoCommand.class,
      WatchVideoCommand.class,
      ListTrendingHashtagsCommand.class
    })
public class ClientCommand implements Runnable {

  @Option(
      names = {"-v", "--verbose"},
      description = "...")
  boolean verbose;

  public static void main(String[] args) throws Exception {
    PicocliRunner.run(ClientCommand.class, args);
  }

  public void run() {
    // business logic here
    if (verbose) {
      System.out.println("Hi!");
    }
  }
}
