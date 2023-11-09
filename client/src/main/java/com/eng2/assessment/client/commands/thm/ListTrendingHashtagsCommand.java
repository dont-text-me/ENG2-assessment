package com.eng2.assessment.client.commands.thm;

import com.eng2.assessment.client.clients.thm.TrendingHashtagsClient;
import com.eng2.assessment.client.utils.formatters.TrendingHashtagFormatter;
import com.eng2.assessment.thm.domain.TrendingHashtag;
import jakarta.inject.Inject;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import picocli.CommandLine;

@CommandLine.Command(name = "list-trending-hashtags", mixinStandardHelpOptions = true)
public class ListTrendingHashtagsCommand implements Runnable {
  @Inject private TrendingHashtagsClient client;

  @Override
  public void run() {
    List<TrendingHashtag> result = client.latestStats();

    if (result.isEmpty()) {
      System.out.println("No statistics available. Please try again later");
    } else {
      Date wStart = new Date(result.get(0).getWindowStart()),
          wEnd = new Date(result.get(0).getWindowEnd());
      System.out.printf("Latest trending hashtags between %s and %s:%n", wStart, wEnd);
      System.out.println(
          result.stream()
              .map(TrendingHashtagFormatter::prettyPrintTrendingHashtag)
              .collect(Collectors.joining()));
    }
  }
}
