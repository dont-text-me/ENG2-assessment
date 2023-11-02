package com.eng2.assessment.thm.controllers;

import static java.lang.String.valueOf;
import static org.assertj.core.api.Assertions.assertThat;

import com.eng2.assessment.thm.domain.TrendingHashtag;
import com.eng2.assessment.thm.repositories.TrendingHashtagRepository;
import com.eng2.assessment.thm.utils.TrendingHashtagsClient;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@MicronautTest(transactional = false)
public class TrendingHashtagControllerTest {
  @Inject private TrendingHashtagsClient client;

  @Inject private TrendingHashtagRepository repo;

  private final Comparator<TrendingHashtag> expectedOrdering =
      Comparator.comparing(TrendingHashtag::getLikeCount)
          .reversed()
          .thenComparing(TrendingHashtag::getHashtagName);

  @BeforeEach
  public void reset() {
    repo.deleteAll();
  }

  @Test
  public void whenNoHashtags() {
    List<TrendingHashtag> result = client.latestStats();

    assertThat(result).isEmpty();
  }

  @Test
  public void whenLessThanTenHashtags() {
    Long windowStart = Instant.now().toEpochMilli(),
        windowEnd = Instant.now().plus(Duration.ofMinutes(10)).toEpochMilli();
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
  public void whenMoreThanTenHashtags() {
    Long windowStart = Instant.now().toEpochMilli(),
        windowEnd = Instant.now().plus(Duration.ofMinutes(10)).toEpochMilli();
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
  public void whenSeveralTimeWindows() {
    Long oldWindowStart = Instant.now().minus(Duration.ofMinutes(20)).toEpochMilli(),
        oldWindowEnd =
            Instant.now().minus(Duration.ofMinutes(20)).plus(Duration.ofMinutes(10)).toEpochMilli(),
        recentWindowStart = Instant.now().toEpochMilli(),
        recentWindowEnd = Instant.now().plus(Duration.ofMinutes(10)).toEpochMilli();
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
