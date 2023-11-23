package com.eng2.assesment.sm.events;

import static com.eng2.assessment.vm.events.Topics.TOPIC_VIDEO_POSTED;
import static com.eng2.assessment.vm.events.Topics.TOPIC_VIDEO_VIEWED;

import com.eng2.assesment.sm.repositories.HashtagRepository;
import com.eng2.assesment.sm.repositories.UserRepository;
import com.eng2.assesment.sm.repositories.VideoRepository;
import com.eng2.assessment.vm.dto.VideoInteractionDetailsDTO;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.Topic;
import jakarta.inject.Inject;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Handles incoming messages from VM and recreates (with minimal information) the links between
 * hashtags, users and videos.
 */
@KafkaListener(groupId = "subscription-microservice")
public class VideoInteractionConsumer {
  private static final Logger logger = LoggerFactory.getLogger(VideoInteractionConsumer.class);

  @Inject private HashtagRepository hashtagRepository;
  @Inject private UserRepository userRepository;
  @Inject private VideoRepository videoRepository;

  @Topic(TOPIC_VIDEO_POSTED)
  void processPosted(@KafkaKey UUID videoId, VideoInteractionDetailsDTO details) {
    System.out.println("example");
  }

  @Topic(TOPIC_VIDEO_VIEWED)
  void processViewed(@KafkaKey UUID videoId, VideoInteractionDetailsDTO details) {
    System.out.println("example");
  }
}
