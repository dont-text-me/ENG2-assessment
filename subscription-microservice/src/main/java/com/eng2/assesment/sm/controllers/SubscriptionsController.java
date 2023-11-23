package com.eng2.assesment.sm.controllers;

import com.eng2.assesment.sm.domain.Hashtag;
import com.eng2.assesment.sm.domain.User;
import com.eng2.assesment.sm.repositories.HashtagRepository;
import com.eng2.assesment.sm.repositories.UserRepository;
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

  @Put("/{userName}/subscribe")
  @Transactional
  public HttpResponse<String> subscribe(String userName, @Body String hashtagName) {
    User user = userRepo.findById(userName).orElse(null);
    Hashtag hashtag = hashtagRepo.findById(hashtagName).orElse(null);
    if (hashtag == null) {
      return HttpResponse.badRequest("Hashtag with name " + hashtagName + " not found");
    }
    if (user == null) {
      return HttpResponse.badRequest("User with name " + userName + " not found");
    }

    user.addSubscription(hashtag);
    userRepo.update(user);
    logger.info(String.format("User %s subscribed to hashtag %s", userName, hashtagName));
    return HttpResponse.ok(
        String.format("User %s subscribed to hashtag %s", userName, hashtagName));
  }

  @Put("/{userName}/unsubscribe")
  @Transactional
  public HttpResponse<String> unsubscribe(String userName, @Body String hashtagName) {
    User user = userRepo.findById(userName).orElse(null);
    Hashtag hashtag = hashtagRepo.findById(hashtagName).orElse(null);
    if (hashtag == null) {
      return HttpResponse.badRequest("Hashtag with name " + hashtagName + " not found");
    }
    if (user == null) {
      return HttpResponse.badRequest("User with name " + userName + " not found");
    }

    user.removeSubscription(hashtag);
    userRepo.update(user);
    logger.info(String.format("User %s unsubscribed from hashtag %s", userName, hashtagName));
    return HttpResponse.ok(
        String.format("User %s unsubscribed from hashtag %s", userName, hashtagName));
  }
}
