package com.eng2.assessment.client.commands.vm.videos;

import com.eng2.assessment.client.clients.vm.VideosClient;
import com.eng2.assessment.vm.dto.VideoDTO;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import picocli.CommandLine;

@CommandLine.Command(name = "post-video", mixinStandardHelpOptions = true)
public class PostVideoCommand implements Runnable {
  @Inject private VideosClient client;

  private static final Logger logger = LoggerFactory.getLogger(PostVideoCommand.class);

  @CommandLine.Option(
      names = {"-a", "--author-username"},
      required = true,
      description =
          "The username of the user that will be recorded as this video's author. Must be a valid user")
  private String authorUsername;

  @CommandLine.Option(
      names = {"-t", "--title"},
      required = true,
      description = "The title of the video to be posted")
  private String title;

  @CommandLine.Option(
      names = {"-h", "--hashtags"},
      required = true,
      description =
          "The list of hashtags to tag the video with. Please provide a single string, with the hashtags separated by commas. Note that hashtag names are case sensitive.")
  private String hashtagsList;

  @Override
  public void run() {
    List<String> hashtags = Arrays.stream(hashtagsList.split(",")).map(String::trim).toList();
    VideoDTO detais = new VideoDTO(title, authorUsername, hashtags);
    logger.info("Attempting to create a video with these details: " + detais);

    HttpResponse<String> result = client.publish(detais);

    if (result.status() == HttpStatus.CREATED) {
      System.out.printf(
          "Success!%n%s%nThe following details were used: %s%n", result.body(), detais);
    } else if (result.status() == HttpStatus.NOT_FOUND
        || result.status() == HttpStatus.BAD_REQUEST) {
      System.out.println("Something went wrong: " + result.body());
    }
  }
}
