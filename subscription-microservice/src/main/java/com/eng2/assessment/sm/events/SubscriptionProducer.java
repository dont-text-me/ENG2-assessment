package com.eng2.assessment.sm.events;

import static com.eng2.assessment.sm.events.Topics.TOPIC_USER_SUBSCRIBED;
import static com.eng2.assessment.sm.events.Topics.TOPIC_USER_UNSUBSCRIBED;

import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;

@KafkaClient
public interface SubscriptionProducer {
  @Topic(TOPIC_USER_SUBSCRIBED)
  void userSubscribed(@KafkaKey String userName, String hashtagName);

  @Topic(TOPIC_USER_UNSUBSCRIBED)
  void userUnsubscribed(@KafkaKey String userName, String hashtagName);
}
