package com.eng2.assessment.vm.events;

import static shared.Topics.TOPIC_USER_REGISTERED;

import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;
import java.util.UUID;

@KafkaClient
public interface UserCreationProducer {
  @Topic(TOPIC_USER_REGISTERED)
  void userRegistered(@KafkaKey String userName, UUID userId);
}
