package com.eng2.assessment.vm.events;

import static com.eng2.assessment.vm.events.Topics.TOPIC_USER_REGISTERED;

import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;

@KafkaClient
public interface UserCreationProducer {
  @Topic(TOPIC_USER_REGISTERED)
  void userRegistered(@KafkaKey String userName, Long userId);
}
