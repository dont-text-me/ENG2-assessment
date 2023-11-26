package com.eng2.assessment.sm.utils;

import com.eng2.assessment.sm.dto.VideoRecommendationDTO;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.QueryValue;
import io.micronaut.http.client.annotation.Client;

@Client(
    value = "${recommendations.url: `http://localhost:8082/recommendations`}",
    errorType = VideoRecommendationDTO.class)
public interface RecommendationsClient {

  @Get("/{userName}")
  HttpResponse<VideoRecommendationDTO> getRecommendations(
      String userName, @QueryValue String hashtagName);
}
