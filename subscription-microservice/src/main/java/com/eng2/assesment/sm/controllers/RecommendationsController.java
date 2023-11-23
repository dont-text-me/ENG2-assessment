package com.eng2.assesment.sm.controllers;

import com.eng2.assesment.sm.domain.Video;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.QueryValue;
import java.util.Collections;
import java.util.List;

@Controller("/recommendations")
public class RecommendationsController {
  @Get("/{userName}")
  public List<Video> getRecommendations(String userName, @QueryValue String hashtagName) {
    return Collections.emptyList();
  }
}
