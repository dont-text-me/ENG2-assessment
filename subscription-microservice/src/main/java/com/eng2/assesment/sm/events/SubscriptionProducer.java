package com.eng2.assesment.sm.events;

import static com.eng2.assesment.sm.events.Topics.TOPIC_USER_SUBSCRIBED;
import static com.eng2.assesment.sm.events.Topics.TOPIC_USER_UNSUBSCRIBED;

import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;
import java.util.UUID;

@KafkaClient
public interface SubscriptionProducer {
  @Topic(TOPIC_USER_SUBSCRIBED)
  void userSubscribed(@KafkaKey UUID userId, String hashtagName);

  @Topic(TOPIC_USER_UNSUBSCRIBED)
  void userUnsubscribed(@KafkaKey UUID userId, String hashtagName);
}
