package com.eng2.assessment.thm.events;

import static com.eng2.assessment.thm.events.Topics.TOPIC_HASHTAG_SUMMARY;

import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.Topic;
import java.util.Map;

@KafkaListener
public class TrendingHashtagSummaryConsumer {
  @Topic(TOPIC_HASHTAG_SUMMARY)
  void reportHashtagStatistics(@KafkaKey String topTenHashtags, Long likeCount) {
    System.out.println(
        "Received trending hashtag statistics: top ten hashtags are " + topTenHashtags);
  }
}
