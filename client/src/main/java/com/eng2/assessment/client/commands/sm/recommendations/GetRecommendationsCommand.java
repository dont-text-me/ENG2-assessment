package com.eng2.assessment.client.commands.sm.recommendations;

import com.eng2.assessment.client.clients.sm.RecommendationsClient;
import com.eng2.assessment.client.utils.formatters.VideoRecommendationFormatter;
import com.eng2.assessment.sm.domain.Video;
import com.eng2.assessment.sm.dto.VideoRecommendationDTO;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import jakarta.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;
import picocli.CommandLine;

@CommandLine.Command(name = "get-recommendations", mixinStandardHelpOptions = true)
public class GetRecommendationsCommand implements Runnable {
  @Inject private RecommendationsClient client;

  @CommandLine.Option(
      names = {"-u", "--username"},
      required = true,
      description = "The username of the user to get recommendations for")
  private String userName;

  @CommandLine.Option(
      names = {"-h", "--hashtag"},
      required = true,
      description =
          "The name of the hashtag to get recommendations for (must be in user's subscriptions)")
  private String hashtagName;

  @Override
  public void run() {
    HttpResponse<VideoRecommendationDTO> result = client.getRecommendations(userName, hashtagName);
    if (result.status().equals(HttpStatus.OK)) {
      List<Video> videoResult = result.body().result();
      if (videoResult == null || videoResult.isEmpty()) {
        System.out.println("No recommendations available. Please try again later");
      } else {
        System.out.println(
            videoResult.stream()
                .map(VideoRecommendationFormatter::prettyPrintRecommendation)
                .collect(Collectors.joining("--------------------------\n")));
      }
    } else {
      System.out.println("Something went wrong: " + result.body().errorMessage());
    }
  }
}
