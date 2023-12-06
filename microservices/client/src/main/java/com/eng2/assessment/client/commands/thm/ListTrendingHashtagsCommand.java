package com.eng2.assessment.client.commands.thm;

import com.eng2.assessment.client.utils.formatters.TrendingHashtagFormatter;
import jakarta.inject.Inject;
import java.util.Date;
import java.util.stream.Collectors;
import picocli.CommandLine;
import thm.api.TrendingHashtagsClient;
import thm.dto.TrendingHashtagResponseDTO;

@CommandLine.Command(name = "list-trending-hashtags", mixinStandardHelpOptions = true)
public class ListTrendingHashtagsCommand implements Runnable {
  @Inject private TrendingHashtagsClient client;

  @Override
  public void run() {
    TrendingHashtagResponseDTO result = client.latestStats();

    if (result.hashtags() == null || result.hashtags().isEmpty()) {
      System.out.println("No statistics available. Please try again later");
    } else {
      Date wStart = new Date(result.hashtags().get(0).windowStart()),
          wEnd = new Date(result.hashtags().get(0).windowEnd());
      System.out.printf("Latest trending hashtags between %s and %s:%n", wStart, wEnd);
      System.out.println(
          result.hashtags().stream()
              .map(TrendingHashtagFormatter::prettyPrintTrendingHashtag)
              .collect(Collectors.joining()));
    }
  }
}
