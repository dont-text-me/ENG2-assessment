package com.eng2.assessment.client.commands.sm.subscriptions;

import com.eng2.assessment.generated.commands.AManageSubscriptionsCommand;
import com.eng2.assessment.generated.enums.SubscriptionAction;
import com.eng2.assessment.generated.sm.api.SubscriptionsClient;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import jakarta.inject.Inject;
import picocli.CommandLine;

@CommandLine.Command(name = "manage-subscriptions")
public class ManageSubscriptionsCommand extends AManageSubscriptionsCommand {
  @Inject private SubscriptionsClient client;

  @Override
  public void run() {
    HttpResponse<String> result =
        this.subscriptionaction.equals(SubscriptionAction.SUBSCRIBE)
            ? client.subscribe(this.userName, this.hashtagName)
            : client.unsubscribe(this.userName, this.hashtagName);
    if (result.status().equals(HttpStatus.OK)) {
      System.out.println("Success! " + result.body());
    } else {
      System.out.println("Something went wrong: " + result.body());
    }
  }
}
