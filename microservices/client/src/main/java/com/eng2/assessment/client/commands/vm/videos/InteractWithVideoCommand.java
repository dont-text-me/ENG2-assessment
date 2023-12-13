package com.eng2.assessment.client.commands.vm.videos;

import com.eng2.assessment.generated.commands.AInteractWithVideoCommand;
import com.eng2.assessment.generated.vm.api.VideosClient;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import jakarta.inject.Inject;
import picocli.CommandLine;

@CommandLine.Command(name = "interact-with-video")
public class InteractWithVideoCommand extends AInteractWithVideoCommand {

  @Inject private VideosClient client;

  @Override
  public void run() {
    HttpResponse<String> result =
        switch (this.videointeractiontype) {
          case LIKE -> client.likeVideo(videoId, userName);
          case WATCH -> client.watchVideo(videoId, userName);
          case DISLIKE -> client.dislikeVideo(videoId, userName);
        };
    if (result.status() == HttpStatus.OK) {
      System.out.println("Success! " + result.body());
    } else {
      System.out.println("Something went wrong: " + result.body());
    }
  }
}
