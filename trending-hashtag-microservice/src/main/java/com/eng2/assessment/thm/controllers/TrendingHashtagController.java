package com.eng2.assessment.thm.controllers;

import com.eng2.assessment.thm.domain.TrendingHashtag;
import com.eng2.assessment.thm.repositories.TrendingHashtagRepository;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import jakarta.inject.Inject;
import java.util.Collections;
import java.util.List;

@Controller("/trending-hashtags")
public class TrendingHashtagController {
  @Inject private TrendingHashtagRepository repo;

  @Get("/latest-{number}")
  public List<TrendingHashtag> latestStats(@PathVariable String number) {
    // get latest timestamp
    // fetch last x hashtags
    return Collections.emptyList();
  }
}
