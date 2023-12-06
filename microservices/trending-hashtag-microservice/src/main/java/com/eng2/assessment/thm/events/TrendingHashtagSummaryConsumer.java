package com.eng2.assessment.thm.events;

import static com.eng2.assessment.thm.events.TrendingHashtagsStream.TOPIC_HASHTAG_SUMMARY;

import com.eng2.assessment.thm.repositories.TrendingHashtagRepository;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.Topic;
import jakarta.inject.Inject;
import java.util.List;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import thm.domain.TrendingHashtag;
import thm.dto.WindowedHashtagWithLikeCount;

@KafkaListener(batch = true)
public class TrendingHashtagSummaryConsumer {
  @Inject TrendingHashtagRepository hashtagRepo;

  private static final Logger logger =
      LoggerFactory.getLogger(TrendingHashtagSummaryConsumer.class);

  @Topic(TOPIC_HASHTAG_SUMMARY)
  void reportHashtagStatistics(List<ConsumerRecord<String, WindowedHashtagWithLikeCount>> records) {
    List<WindowedHashtagWithLikeCount> counts =
        records.stream().map(ConsumerRecord::value).toList();

    List<TrendingHashtag> trendingHashtags =
        counts.stream()
            .map(
                it -> {
                  TrendingHashtag hashtag = new TrendingHashtag();
                  hashtag.setHashtagName(it.hashtagName());
                  hashtag.setLikeCount(it.likeCount());
                  hashtag.setWindowStart(it.windowStart());
                  hashtag.setWindowEnd(it.windowEnd());
                  logger.debug("Created new trending hashtag entry " + hashtag);
                  return hashtag;
                })
            .toList();
    hashtagRepo.saveAll(trendingHashtags);
  }
}
