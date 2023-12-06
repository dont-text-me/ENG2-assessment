package com.eng2.assessment.client.commands.vm.videos;

import com.eng2.assessment.client.utils.formatters.VideoFormatter;
import jakarta.inject.Inject;
import java.util.stream.Collectors;
import picocli.CommandLine;
import vm.api.VideosClient;
import vm.dto.VideoResultsDTO;

@CommandLine.Command(name = "list-videos", mixinStandardHelpOptions = true)
public class ListVideosCommand implements Runnable {
  @Inject private VideosClient client;

  @CommandLine.Option(
      names = {"-a", "--author-username"},
      description =
          "Optional. Can be provided to filter the list of videos based on the author's username. Case sensitive")
  private String authorUsername;

  @CommandLine.Option(
      names = {"-h", "--hashtag-name"},
      description =
          "Optional. Can be provided to filter the list of videos based on one of its hashtags. Case sensitive")
  private String hashtagName;

  @Override
  public void run() {
    VideoResultsDTO result = client.list(authorUsername, hashtagName);
    if (result == null || result.result() == null || result.result().isEmpty()) {
      if (authorUsername != null || hashtagName != null) {
        System.out.println("No videos matching the filter criteria found");
      } else {
        System.out.println("No videos available. Please try again later or post a video");
      }
    } else {
      System.out.println(
          result.result().stream()
              .map(VideoFormatter::prettyPrintVideo)
              .collect(Collectors.joining("--------------------------\n")));
    }
  }
}
