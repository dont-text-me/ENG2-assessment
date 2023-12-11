package com.eng2.assessment.client.commands.vm.videos;

import com.eng2.assessment.client.utils.formatters.VideoFormatter;
import com.eng2.assessment.generated.commands.AListVideosCommand;
import jakarta.inject.Inject;
import java.util.stream.Collectors;
import picocli.CommandLine;
import com.eng2.assessment.generated.vm.api.VideosClient;
import com.eng2.assessment.generated.vm.dto.VideoResultsDTO;

@CommandLine.Command(name = "list-videos")
public class ListVideosCommand extends AListVideosCommand {
  @Inject private VideosClient client;

  @Override
  public void run() {
    VideoResultsDTO result = client.list(this.authorUsername, this.hashtagName);
    if (result == null || result.result() == null || result.result().isEmpty()) {
      if (this.authorUsername != null || this.hashtagName != null) {
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
