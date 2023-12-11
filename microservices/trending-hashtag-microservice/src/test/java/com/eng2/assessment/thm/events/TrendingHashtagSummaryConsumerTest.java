package com.eng2.assessment.thm.events;

import com.eng2.assessment.generated.thm.domain.TrendingHashtag;
import com.eng2.assessment.generated.thm.dto.WindowedHashtagWithLikeCount;
import com.eng2.assessment.thm.repositories.TrendingHashtagRepository;
import com.eng2.assessment.thm.utils.DbCleanupExtension;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

import static com.eng2.assessment.generated.shared.Topics.TOPIC_TRENDING_HASHTAGS;
import static java.lang.String.valueOf;
import static org.assertj.core.api.Assertions.assertThat;

@MicronautTest
@ExtendWith(DbCleanupExtension.class)
public class TrendingHashtagSummaryConsumerTest {
  @Inject TrendingHashtagRepository repo;

  @Inject TrendingHashtagSummaryConsumer sut;

  @Test
  public void storesDetailsOfReceivedMessage() {
    WindowedHashtagWithLikeCount messageData =
        new WindowedHashtagWithLikeCount(
            "Zoo",
            10L,
            Instant.now().minus(Duration.ofMinutes(10)).toEpochMilli(),
            Instant.now().toEpochMilli());

    sut.consumeTrendingHashtagsMessages(
        List.of(new ConsumerRecord<>(TOPIC_TRENDING_HASHTAGS, 1, 1L, "Zoo", messageData)));

    assertThat(repo.findAll()).isNotNull().isNotEmpty();

    assertThat(repo.findAll().get(0))
        .matches(it -> it.getHashtagName().equals("Zoo") && it.getLikeCount().equals(10L));
  }

  @Test
  public void handlesBatchedMessages() {
    ArrayList<ConsumerRecord<String, WindowedHashtagWithLikeCount>> records = new ArrayList<>();
    IntStream.range(0, 15)
        .forEach(
            it ->
                records.add(
                    new ConsumerRecord<>(
                        TOPIC_TRENDING_HASHTAGS,
                        1,
                        it,
                        valueOf(it),
                        new WindowedHashtagWithLikeCount(
                            valueOf(it),
                            (long) it,
                            Instant.now().minus(Duration.ofMinutes(10)).toEpochMilli(),
                            Instant.now().toEpochMilli()))));

    sut.consumeTrendingHashtagsMessages(records);

    assertThat(repo.findAll()).isNotNull().isNotEmpty().hasSize(15);
    assertThat(
            repo.findAll().stream()
                .sorted(Comparator.comparing(TrendingHashtag::getLikeCount).reversed())
                .toList()
                .get(0))
        .matches(it -> it.getHashtagName().equals("14") && it.getLikeCount().equals(14L));
  }
}
