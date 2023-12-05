package com.eng2.assessment.thm.utils;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import java.util.List;
import thm.domain.TrendingHashtag;

@Client(value = "${trending-hashtags.url: `http://localhost:8080/trending-hashtags`}")
public interface TrendingHashtagsClient {
  @Get("/latest")
  List<TrendingHashtag> latestStats();
}
