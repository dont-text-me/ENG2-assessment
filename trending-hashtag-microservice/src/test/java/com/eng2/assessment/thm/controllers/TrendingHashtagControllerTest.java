package com.eng2.assessment.thm.controllers;

import static java.lang.String.valueOf;
import static org.assertj.core.api.Assertions.assertThat;

import com.eng2.assessment.thm.domain.TrendingHashtag;
import com.eng2.assessment.thm.repositories.TrendingHashtagRepository;
import com.eng2.assessment.thm.utils.DbCleanupExtension;
import com.eng2.assessment.thm.utils.TrendingHashtagsClient;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@MicronautTest(transactional = false)
@ExtendWith(DbCleanupExtension.class)
public class TrendingHashtagControllerTest {
  @Inject private TrendingHashtagsClient client;

  @Inject private TrendingHashtagRepository repo;

  private final Comparator<TrendingHashtag> expectedOrdering =
      Comparator.comparing(TrendingHashtag::getLikeCount)
          .reversed()
          .thenComparing(TrendingHashtag::getHashtagName);

  @Test
  public void whenNoHashtags() {
    List<TrendingHashtag> result = client.latestStats();

    assertThat(result).isEmpty();
  }

  @Test
  public void whenLessThanTenHashtags() {
    Long windowStart = Instant.now().minus(Duration.ofMinutes(50)).toEpochMilli(),
        windowEnd = Instant.now().minus(Duration.ofMinutes(10)).toEpochMilli();
    IntStream.range(0, 5)
        .forEach(
            it -> {
              TrendingHashtag h = new TrendingHashtag();
              h.setWindowEnd(windowEnd);
              h.setWindowStart(windowStart);
              h.setHashtagName(valueOf(it));
              h.setLikeCount((long) it);
              repo.save(h);
            });

    List<TrendingHashtag> result = client.latestStats();

    assertThat(result).isNotEmpty().hasSize(5).isSortedAccordingTo(expectedOrdering);
  }

  @Test
  public void whenDuplicateRecords() {
    Long windowStart = Instant.now().minus(Duration.ofMinutes(50)).toEpochMilli(),
        windowEnd = Instant.now().minus(Duration.ofMinutes(10)).toEpochMilli();
    IntStream.range(0, 5)
        .forEach(
            it -> {
              TrendingHashtag h = new TrendingHashtag();
              h.setWindowEnd(windowEnd);
              h.setWindowStart(windowStart);
              h.setHashtagName(valueOf(it));
              h.setLikeCount((long) it);
              repo.save(h);
            });

    TrendingHashtag duplicate = new TrendingHashtag();
    duplicate.setHashtagName("2");
    duplicate.setLikeCount(20L);
    duplicate.setWindowEnd(windowEnd);
    duplicate.setWindowStart(windowStart);
    repo.save(duplicate);

    List<TrendingHashtag> result = client.latestStats();

    assertThat(result).isNotEmpty().hasSize(5).isSortedAccordingTo(expectedOrdering);
    assertThat(result.get(0).getHashtagName()).isEqualTo("2");
    assertThat(result.get(0).getLikeCount()).isEqualTo(20L);
    assertThat(result)
        .noneMatch(
            it ->
                it.getHashtagName().equals("2")
                    && it.getLikeCount().equals(2L)); // duplicate entry replaces old one
  }

  @Test
  public void whenMoreThanTenHashtags() {
    Long windowStart = Instant.now().minus(Duration.ofMinutes(50)).toEpochMilli(),
        windowEnd = Instant.now().minus(Duration.ofMinutes(20)).toEpochMilli();
    IntStream.range(0, 20)
        .forEach(
            it -> {
              TrendingHashtag h = new TrendingHashtag();
              h.setWindowEnd(windowEnd);
              h.setWindowStart(windowStart);
              h.setHashtagName(valueOf(it));
              h.setLikeCount((long) it);
              repo.save(h);
            }); // name: 0, likeCount:0, 1, 1 and so on

    List<TrendingHashtag> result = client.latestStats();

    assertThat(result).isNotEmpty().hasSize(10).isSortedAccordingTo(expectedOrdering);
    assertThat(result.get(result.size() - 1).getHashtagName()).isEqualTo("10");
  }

  @Test
  public void limitsRecordAge() {
    Long oldWindowStart = Instant.now().minus(Duration.ofHours(3)).toEpochMilli(),
        oldWindowEnd =
            Instant.now().minus(Duration.ofHours(3)).plus(Duration.ofMinutes(10)).toEpochMilli(),
        recentWindowStart = Instant.now().minus(Duration.ofMinutes(30)).toEpochMilli(),
        recentWindowEnd = Instant.now().minus(Duration.ofMinutes(10)).toEpochMilli();
    IntStream.range(0, 20)
        .forEach(
            it -> {
              TrendingHashtag h = new TrendingHashtag();
              h.setWindowEnd(oldWindowEnd);
              h.setWindowStart(oldWindowStart);
              h.setHashtagName(valueOf(it));
              h.setLikeCount((long) it);
              repo.save(h);
            }); // old window data, should not be returned

    IntStream.range(0, 5)
        .forEach(
            it -> {
              TrendingHashtag h = new TrendingHashtag();
              h.setWindowEnd(recentWindowEnd);
              h.setWindowStart(recentWindowStart);
              h.setHashtagName(it + "-new");
              h.setLikeCount((long) it);
              repo.save(h);
            });

    List<TrendingHashtag> result = client.latestStats();

    assertThat(result).isNotEmpty().hasSize(5).isSortedAccordingTo(expectedOrdering);
    assertThat(result)
        .allMatch(
            it -> it.getHashtagName().contains("new") && it.getWindowEnd().equals(recentWindowEnd));
  }
}
