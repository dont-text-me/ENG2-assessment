package com.eng2.assessment.thm.events;

import static com.eng2.assessment.thm.events.TrendingHashtagsStream.TOPIC_HASHTAG_SUMMARY;

import com.eng2.assessment.thm.domain.TrendingHashtag;
import com.eng2.assessment.thm.events.dto.WindowedHashtagWIthLikeCount;
import com.eng2.assessment.thm.repositories.TrendingHashtagRepository;
import com.eng2.assessment.vm.controllers.VideosController;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.Topic;
import jakarta.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@KafkaListener
public class TrendingHashtagSummaryConsumer {
  @Inject TrendingHashtagRepository hashtagRepo;

  private static final Logger logger = LoggerFactory.getLogger(VideosController.class);

  @Topic(TOPIC_HASHTAG_SUMMARY)
  void reportHashtagStatistics(@KafkaKey String hashtagName, WindowedHashtagWIthLikeCount stats) {
    TrendingHashtag hashtag = new TrendingHashtag();
    hashtag.setHashtagName(hashtagName);
    hashtag.setLikeCount(stats.likeCount());
    hashtag.setWindowStart(stats.windowStart());
    hashtag.setWindowEnd(stats.windowEnd());
    logger.debug("Storing new trending hashtag entry " + hashtag);
    hashtagRepo.save(hashtag);
  }
}
