package com.eng2.assessment.thm.controllers;

import com.eng2.assessment.generated.thm.api.ITrendingHashtagsClient;
import com.eng2.assessment.generated.thm.dto.TrendingHashtagResponseDTO;
import com.eng2.assessment.generated.thm.dto.WindowedHashtagWithLikeCount;
import com.eng2.assessment.thm.repositories.TrendingHashtagRepository;
import io.micronaut.context.annotation.Value;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;
import java.time.Duration;
import java.time.Instant;
import java.util.List;

@Controller("/trending-hashtags")
public class TrendingHashtagController implements ITrendingHashtagsClient {
  @Inject private TrendingHashtagRepository repo;

  @Value(value = "${trending-hashtags.window-size: `1h`}")
  private Duration windowSize;

  @Value(value = "${trending-hashtags.leaderboard-size: 10}")
  private Integer leaderboardSize;

  @Get("/latest")
  public TrendingHashtagResponseDTO latestStats() {
    List<WindowedHashtagWithLikeCount> results =
        repo
            .getTrending(
                Instant.now().minus(windowSize).toEpochMilli(), Instant.now().toEpochMilli())
            .stream()
            .limit(leaderboardSize)
            .toList();
    return new TrendingHashtagResponseDTO(results);
  }
}
