package com.eng2.assessment.thm.controllers;

import static com.eng2.assessment.thm.shared.Utils.trendingHashtagOrdering;

import com.eng2.assessment.thm.repositories.TrendingHashtagRepository;
import io.micronaut.context.annotation.Value;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;
import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.TreeSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import thm.domain.TrendingHashtag;

@Controller("/trending-hashtags")
public class TrendingHashtagController {
  @Inject private TrendingHashtagRepository repo;

  @Value(value = "${trending-hashtags.window-size: `1h`}")
  private Duration windowSize;

  @Value(value = "${trending-hashtags.leaderboard-size: 10}")
  private Integer leaderboardSize;

  private static final Logger logger = LoggerFactory.getLogger(TrendingHashtagController.class);

  @Get("/latest")
  public List<TrendingHashtag> latestStats() {

    TreeSet<TrendingHashtag> leaderboard = new TreeSet<>(trendingHashtagOrdering);

    repo.findByWindowEndLessThanEqualsAndWindowEndGreaterThanOrderByLikeCountDesc(
            Instant.now().toEpochMilli(), Instant.now().minus(windowSize).toEpochMilli())
        .forEach(
            entry -> {
              logger.info(entry.toString());
              TrendingHashtag previousValue =
                  leaderboard.stream()
                      .filter(it -> it.getHashtagName().equals(entry.getHashtagName()))
                      .findFirst()
                      .orElse(null);
              if (previousValue == null) {
                leaderboard.add(entry);
              } else if (previousValue.getLikeCount() < entry.getLikeCount()) {
                leaderboard.removeIf(it -> it.getHashtagName().equals(entry.getHashtagName()));
                leaderboard.add(entry);
              }

              if (leaderboard.size() > leaderboardSize) {
                leaderboard.pollLast();
              }
            });

    logger.info(leaderboard.toString());

    return leaderboard.stream().toList();
  }
}
