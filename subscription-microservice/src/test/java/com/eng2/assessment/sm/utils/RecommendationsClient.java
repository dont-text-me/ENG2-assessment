package com.eng2.assessment.sm.utils;

import com.eng2.assessment.sm.domain.Video;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.QueryValue;
import io.micronaut.http.client.annotation.Client;
import java.util.List;

@Client(value = "${recommendations.url: `http://localhost:8083/recommendations`}")
public interface RecommendationsClient {

  @Get("/{userName}")
  List<Video> getRecommendations(String userName, @QueryValue String hashtagName);
}
