package com.eng2.assessment.thm.controllers;

import com.eng2.assessment.thm.domain.TrendingHashtag;
import com.eng2.assessment.thm.repositories.TrendingHashtagRepository;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;
import java.util.List;

@Controller("/trending-hashtags")
public class TrendingHashtagController {
  @Inject private TrendingHashtagRepository repo;

  @Get("/latest")
  public List<TrendingHashtag> latestStats() {
    Long latestWindowEnd = repo.findMaxWindowEnd();
    return repo.findFirst10ByWindowEndEqualOrderByLikeCountDesc(latestWindowEnd);
  }
}
