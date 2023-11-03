package com.eng2.assessment.vm.events;

import static com.eng2.assessment.vm.events.Topics.*;

import com.eng2.assessment.vm.dto.VideoInteractionDetailsDTO;
import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;
import java.util.UUID;

@KafkaClient
public interface VideoInteractionProducer {
  @Topic(TOPIC_VIDEO_DISLIKED)
  void dislikeVideo(@KafkaKey UUID videoId, VideoInteractionDetailsDTO details);

  @Topic(TOPIC_VIDEO_LIKED)
  void likeVideo(@KafkaKey UUID videoId, VideoInteractionDetailsDTO details);

  @Topic(TOPIC_VIDEO_VIEWED)
  void viewVideo(@KafkaKey UUID videoId, VideoInteractionDetailsDTO details);
}
