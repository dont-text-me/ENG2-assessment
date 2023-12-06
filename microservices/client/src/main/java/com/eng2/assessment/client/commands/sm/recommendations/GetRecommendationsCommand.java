package com.eng2.assessment.client.commands.sm.recommendations;

import com.eng2.assessment.client.utils.formatters.VideoRecommendationFormatter;
import commands.AGetRecommendationsCommand;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import jakarta.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;
import picocli.CommandLine;
import sm.api.RecommendationsClient;
import sm.dto.VideoDTO;
import sm.dto.VideoRecommendationDTO;

@CommandLine.Command(name = "get-recommendations")
public class GetRecommendationsCommand extends AGetRecommendationsCommand {
  @Inject private RecommendationsClient client;

  @Override
  public void run() {
    HttpResponse<VideoRecommendationDTO> result =
        client.getRecommendations(this.userName, this.hashtagName);
    if (result.status().equals(HttpStatus.OK)) {
      List<VideoDTO> videoResult = result.body().result();
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
