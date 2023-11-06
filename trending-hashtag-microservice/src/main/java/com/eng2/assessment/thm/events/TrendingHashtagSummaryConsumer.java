package com.eng2.assessment.thm.events;

import static com.eng2.assessment.thm.events.TrendingHashtagsStream.TOPIC_HASHTAG_SUMMARY;
import static com.eng2.assessment.thm.shared.Utils.trendingHashtagOrdering;

import com.eng2.assessment.thm.domain.TrendingHashtag;
import com.eng2.assessment.thm.events.dto.WindowedHashtagWIthLikeCount;
import com.eng2.assessment.thm.repositories.TrendingHashtagRepository;
import com.eng2.assessment.vm.controllers.VideosController;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.Topic;
import io.micronaut.context.annotation.Value;
import jakarta.inject.Inject;
import java.util.List;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@KafkaListener(batch = true)
public class TrendingHashtagSummaryConsumer {
  @Inject TrendingHashtagRepository hashtagRepo;

  private static final Logger logger = LoggerFactory.getLogger(VideosController.class);

  @Value(value = "${trending-hashtags.leaderboard-size: 10}")
  private Integer leaderboardSize;

  @Topic(TOPIC_HASHTAG_SUMMARY)
  void reportHashtagStatistics(List<ConsumerRecord<String, WindowedHashtagWIthLikeCount>> records) {
    List<WindowedHashtagWIthLikeCount> counts =
        records.stream().map(ConsumerRecord::value).toList();
    List<WindowedHashtagWIthLikeCount> leaderBoard =
        counts.stream().sorted(trendingHashtagOrdering).limit(leaderboardSize).toList();

    List<TrendingHashtag> trendingHashtags =
        leaderBoard.stream()
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
