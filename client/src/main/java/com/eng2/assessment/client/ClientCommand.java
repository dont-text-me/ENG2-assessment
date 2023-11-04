package com.eng2.assessment.client;

import io.micronaut.configuration.picocli.PicocliRunner;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "client", description = "...", mixinStandardHelpOptions = true)
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
