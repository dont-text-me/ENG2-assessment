package com.eng2.assessment.sm.controllers;

import com.eng2.assessment.sm.domain.Hashtag;
import com.eng2.assessment.sm.domain.User;
import com.eng2.assessment.sm.events.SubscriptionProducer;
import com.eng2.assessment.sm.repositories.HashtagRepository;
import com.eng2.assessment.sm.repositories.UserRepository;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Put;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller("/subscriptions")
public class SubscriptionsController {

  private static final Logger logger = LoggerFactory.getLogger(SubscriptionsController.class);

  @Inject UserRepository userRepo;
  @Inject HashtagRepository hashtagRepo;
  @Inject SubscriptionProducer producer;

  @Put("/{userName}/subscribe")
  @Transactional
  public HttpResponse<String> subscribe(String userName, @Body String hashtagName) {
    User user = userRepo.findByUserNameEqual(userName).orElse(null);
    Hashtag hashtag = hashtagRepo.findById(hashtagName).orElse(null);
    if (hashtag == null) {
      return HttpResponse.badRequest("Hashtag with name " + hashtagName + " not found");
    }
    if (user == null) {
      return HttpResponse.badRequest("User with name " + userName + " not found");
    }
    if (user.getSubscriptions().stream().anyMatch(it -> it.getName().equals(hashtagName))) {
      return HttpResponse.badRequest(
          String.format("User %s is already subscribed to hashtag %s", userName, hashtagName));
    }

    user.addSubscription(hashtag);
    userRepo.update(user);
    producer.userSubscribed(userName, hashtagName);
    logger.info(String.format("User %s subscribed to hashtag %s", userName, hashtagName));
    return HttpResponse.ok(
        String.format("User %s subscribed to hashtag %s", userName, hashtagName));
  }

  @Put("/{userName}/unsubscribe")
  @Transactional
  public HttpResponse<String> unsubscribe(String userName, @Body String hashtagName) {
    User user = userRepo.findByUserNameEqual(userName).orElse(null);
    Hashtag hashtag = hashtagRepo.findById(hashtagName).orElse(null);
    if (hashtag == null) {
      return HttpResponse.badRequest("Hashtag with name " + hashtagName + " not found");
    }
    if (user == null) {
      return HttpResponse.badRequest("User with name " + userName + " not found");
    }
    if (user.getSubscriptions().stream().noneMatch(it -> it.getName().equals(hashtagName))) {
      return HttpResponse.badRequest(
          String.format("User %s is not subscribed to hashtag %s", userName, hashtagName));
    }

    user.removeSubscription(hashtag);
    userRepo.update(user);
    producer.userUnsubscribed(userName, hashtagName);
    logger.info(String.format("User %s unsubscribed from hashtag %s", userName, hashtagName));
    return HttpResponse.ok(
        String.format("User %s unsubscribed from hashtag %s", userName, hashtagName));
  }
}
