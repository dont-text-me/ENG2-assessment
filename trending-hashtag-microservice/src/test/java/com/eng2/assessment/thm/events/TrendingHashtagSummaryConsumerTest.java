package com.eng2.assessment.thm.events;

import static org.assertj.core.api.Assertions.assertThat;

import com.eng2.assessment.thm.events.dto.WindowedHashtagWIthLikeCount;
import com.eng2.assessment.thm.repositories.TrendingHashtagRepository;
import com.eng2.assessment.thm.utils.DbCleanupExtension;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import java.time.Duration;
import java.time.Instant;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@MicronautTest
@ExtendWith(DbCleanupExtension.class)
public class TrendingHashtagSummaryConsumerTest {
  @Inject TrendingHashtagRepository repo;

  @Inject TrendingHashtagSummaryConsumer consumer;

  @Test
  public void storesDetailsOfReceivedMessage() {
    WindowedHashtagWIthLikeCount messageData =
        new WindowedHashtagWIthLikeCount(
            "Zoo",
            10L,
            Instant.now().minus(Duration.ofMinutes(10)).toEpochMilli(),
            Instant.now().toEpochMilli());

    consumer.reportHashtagStatistics("Zoo", messageData);

    assertThat(repo.findAll()).isNotNull().isNotEmpty();

    assertThat(repo.findAll().get(0))
        .matches(it -> it.getHashtagName().equals("Zoo") && it.getLikeCount().equals(10L));
  }
}
