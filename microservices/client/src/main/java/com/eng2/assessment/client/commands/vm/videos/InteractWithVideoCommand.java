package com.eng2.assessment.client.commands.vm.videos;

import commands.AInteractWithVideoCommand;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import jakarta.inject.Inject;
import picocli.CommandLine;
import vm.api.VideosClient;

@CommandLine.Command(name = "interact-with-video")
public class InteractWithVideoCommand extends AInteractWithVideoCommand {

  @Inject private VideosClient client;

  @Override
  public void run() {
    HttpResponse<String> result;
    switch (this.videointeractiontype) {
      case LIKE -> result = client.likeVideo(videoId, userName);
      case WATCH -> result = client.watchVideo(videoId, userName);
      case DISLIKE -> result = client.dislikeVideo(videoId, userName);
      default -> throw new IllegalArgumentException(
          "Invalid interaction type!"); // this won't happen, adding to satisfy compiler
    }
    if (result.status() == HttpStatus.OK) {
      System.out.println("Success! " + result.body());
    } else {
      System.out.println("Something went wrong: " + result.body());
    }
  }
}
