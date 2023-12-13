package com.eng2.assessment.sm.controllers;

import static com.eng2.assessment.sm.utils.UserUtils.addSubscription;
import static com.eng2.assessment.sm.utils.UserUtils.removeSubscription;

import com.eng2.assessment.generated.sm.api.ISubscriptionsClient;
import com.eng2.assessment.generated.sm.domain.Hashtag;
import com.eng2.assessment.generated.sm.domain.User;
import com.eng2.assessment.generated.sm.dto.UserSubscriptionMessageValueDTO;
import com.eng2.assessment.generated.sm.events.SubscriptionProducer;
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
public class SubscriptionsController implements ISubscriptionsClient {

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

    addSubscription(user, hashtag);
    userRepo.update(user);
    producer.produceUserSubscribedMessage(
        userName, new UserSubscriptionMessageValueDTO(hashtagName));
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

    removeSubscription(user, hashtag);
    userRepo.update(user);
    producer.produceUserUnsubscribedMessage(
        userName, new UserSubscriptionMessageValueDTO(hashtagName));
    logger.info(String.format("User %s unsubscribed from hashtag %s", userName, hashtagName));
    return HttpResponse.ok(
        String.format("User %s unsubscribed from hashtag %s", userName, hashtagName));
  }
}
