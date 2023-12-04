package com.eng2.assessment.client.commands.vm.videos;

import com.eng2.assessment.client.clients.vm.VideosClient;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import jakarta.inject.Inject;
import java.util.UUID;
import picocli.CommandLine;

@CommandLine.Command(name = "interact-with-video", mixinStandardHelpOptions = true)
public class InteractWithVideoCommand implements Runnable {

  public enum VideoInteractionType {
    LIKE,
    DISLIKE,
    WATCH
  }

  @Inject private VideosClient client;

  @CommandLine.Option(
      names = {"-v", "--video-id"},
      required = true,
      description = "The ID (UUID) of the video to be interacted with")
  private UUID videoId;

  @CommandLine.Option(
      names = {"-t", "--type"},
      required = true,
      description = "The type of interaction (LIKE, DISLIKE, WATCH)")
  private VideoInteractionType interactionType;

  @CommandLine.Option(
      names = {"-u", "--username"},
      required = true,
      description = "The username of the user performing the interaction (case sensitive)")
  private String userName;

  @Override
  public void run() {
    HttpResponse<String> result;
    switch (interactionType) {
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
