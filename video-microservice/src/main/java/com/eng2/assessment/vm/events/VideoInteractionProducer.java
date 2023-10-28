package com.eng2.assessment.vm.events;

import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;

import java.util.UUID;

import static com.eng2.assessment.vm.events.Topics.*;

@KafkaClient
public interface VideoInteractionProducer {
    @Topic(TOPIC_VIDEO_DISLIKED)
    void dislikeVideo(@KafkaKey UUID videoId, String username);
    @Topic(TOPIC_VIDEO_LIKED)
    void likeVideo(@KafkaKey UUID videoId, String username);

    @Topic(TOPIC_VIDEO_VIEWED)
    void viewVideo(@KafkaKey UUID videoId, String username);

}
