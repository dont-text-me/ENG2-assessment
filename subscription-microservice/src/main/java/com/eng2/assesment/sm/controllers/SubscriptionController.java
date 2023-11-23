package com.eng2.assesment.sm.controllers;

import com.eng2.assesment.sm.domain.Subscription;
import com.eng2.assesment.sm.events.SubscriptionProducer;
import com.eng2.assesment.sm.repositories.SubsscriptionRepository;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Post;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.util.UUID;

@Controller("/subscriptions")
public class SubscriptionController {
  @Inject private SubsscriptionRepository subsscriptionRepo;
  @Inject private SubscriptionProducer subscriptionProducer;

  @Post("/{userId}/subscribe")
  @Transactional
  public HttpResponse<String> subscribe(UUID userId, @Body String hashtagName) {
    if (subsscriptionRepo.existsByUserIdEqualAndHashtagIdEqual(userId, hashtagName)) {
      return HttpResponse.badRequest(
          String.format(
              "User with Id %s is already subscribed to hashtag %s", userId, hashtagName));
    }
    Subscription newSubscription = new Subscription()
            .setUserId(userId)
            .setHashtagId(hashtagName);
    subsscriptionRepo.save(newSubscription);
    subscriptionProducer.userSubscribed(userId, hashtagName);
    return HttpResponse.created(
        String.format("User with Id %s has subscribed to hashtag %s", userId, hashtagName));
  }

  @Delete("/{userId}/unsubscribe")
  public HttpResponse<String> unsubscribe(UUID userId, @Body String hashtagName) {
    if (!subsscriptionRepo.existsByUserIdEqualAndHashtagIdEqual(userId, hashtagName)) {
      return HttpResponse.badRequest(
          String.format("User with Id %s is not subscribed to hashtag %s", userId, hashtagName));
    }
    subsscriptionRepo.deleteByUserIdEqualAndHashtagIdEqual(userId, hashtagName);
    subscriptionProducer.userUnsubscribed(userId, hashtagName);
    return HttpResponse.ok(
        String.format("User with Id %s has unsubscribed from hashtag %s", userId, hashtagName));
  }
}
