package com.eng2.assessment.client.commands.sm.subscriptions;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import jakarta.inject.Inject;
import picocli.CommandLine;
import sm.api.SubscriptionsClient;

@CommandLine.Command(name = "manage-subscriptions", mixinStandardHelpOptions = true)
public class ManageSubscriptionsCommand implements Runnable {
  @Inject private SubscriptionsClient client;

  public enum SubscriptionAction {
    SUBSCRIBE,
    UNSUBSCRIBE
  }

  @CommandLine.Option(
      names = {"-u", "--userName"},
      required = true,
      description = "The username in the subscription")
  private String userName;

  @CommandLine.Option(
      names = {"-a", "--action"},
      required = true,
      description = "The desired action (SUBSCRIBE, UNSUBSCRIBE)")
  private SubscriptionAction actionType;

  @CommandLine.Option(
      names = {"-h", "--hashtagName"},
      required = true,
      description = "The name of the hashtag in the subscription")
  private String hashtagName;

  @Override
  public void run() {
    HttpResponse<String> result =
        actionType.equals(SubscriptionAction.SUBSCRIBE)
            ? client.subscribe(userName, hashtagName)
            : client.unsubscribe(userName, hashtagName);
    if (result.status().equals(HttpStatus.OK)) {
      System.out.println("Success! " + result.body());
    } else {
      System.out.println("Something went wrong: " + result.body());
    }
  }
}
