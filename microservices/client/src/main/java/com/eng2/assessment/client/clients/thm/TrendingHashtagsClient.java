package com.eng2.assessment.client.clients.thm;

import com.eng2.assessment.thm.domain.TrendingHashtag;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import java.util.List;

@Client(
    value = "${client-urls.thm.trending-hashtags:`http://localhost:8081/trending-hashtags`}",
    errorType = String.class)
public interface TrendingHashtagsClient {
  @Get("/latest")
  List<TrendingHashtag> latestStats();
}
