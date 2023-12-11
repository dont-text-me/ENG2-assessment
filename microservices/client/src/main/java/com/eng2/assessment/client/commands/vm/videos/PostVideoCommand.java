package com.eng2.assessment.client.commands.vm.videos;

import com.eng2.assessment.generated.commands.APostVideoCommand;
import com.eng2.assessment.generated.vm.api.VideosClient;
import com.eng2.assessment.generated.vm.dto.VideoDTO;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import jakarta.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import picocli.CommandLine;

import java.util.Arrays;
import java.util.List;

@CommandLine.Command(name = "post-video")
public class PostVideoCommand extends APostVideoCommand {
  @Inject private VideosClient client;

  private static final Logger logger = LoggerFactory.getLogger(PostVideoCommand.class);

  @Override
  public void run() {
    List<String> hashtags = Arrays.stream(this.hashtagsList.split(",")).map(String::trim).toList();
    VideoDTO detais = new VideoDTO(this.authorUsername, hashtags, this.title);
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
