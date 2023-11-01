package com.eng2.assessment.thm.events;

import static com.eng2.assessment.thm.events.Topics.TOPIC_HASHTAG_SUMMARY;

import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.Topic;

@KafkaListener
public class TrendingHashtagSummaryConsumer {
  @Topic(TOPIC_HASHTAG_SUMMARY)
  void reportHashtagStatistics(@KafkaKey Long windowStart, Top10Hashtags stats) {
    System.out.printf(
        "Received trending hashtag statistics for window starting at %s: top ten hashtags are %s%n",
        windowStart, stats.toString());
  }
}
