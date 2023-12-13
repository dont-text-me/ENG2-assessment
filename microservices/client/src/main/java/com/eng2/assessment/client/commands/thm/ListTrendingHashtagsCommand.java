package com.eng2.assessment.client.commands.thm;

import com.eng2.assessment.client.utils.formatters.TrendingHashtagFormatter;
import com.eng2.assessment.generated.commands.AListTrendingHashtagsCommand;
import com.eng2.assessment.generated.thm.api.TrendingHashtagsClient;
import com.eng2.assessment.generated.thm.dto.TrendingHashtagResponseDTO;
import com.eng2.assessment.generated.thm.dto.WindowedHashtagWithLikeCount;
import jakarta.inject.Inject;

import java.util.Comparator;
import java.util.Date;
import java.util.stream.Collectors;
import picocli.CommandLine;

@CommandLine.Command(name = "list-trending-hashtags")
public class ListTrendingHashtagsCommand extends AListTrendingHashtagsCommand {
  @Inject private TrendingHashtagsClient client;

  @Override
  public void run() {
    TrendingHashtagResponseDTO result = client.latestStats();

    if (result.hashtags() == null || result.hashtags().isEmpty()) {
      System.out.println("No statistics available. Please try again later");
    } else {
      Date wStart = new Date(result.hashtags().stream().min(Comparator.comparing(WindowedHashtagWithLikeCount::windowStart)).get().windowStart()),
          wEnd = new Date(result.hashtags().stream().max(Comparator.comparing(WindowedHashtagWithLikeCount::windowEnd)).get().windowEnd());
      System.out.printf("Latest trending hashtags between %s and %s:%n", wStart, wEnd);
      System.out.println(
          result.hashtags().stream()
              .map(TrendingHashtagFormatter::prettyPrintTrendingHashtag)
              .collect(Collectors.joining()));
    }
  }
}
