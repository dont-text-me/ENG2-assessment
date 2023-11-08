package com.eng2.assessment.client.commands.vm.videos;

import com.eng2.assessment.client.clients.vm.VideosClient;
import com.eng2.assessment.vm.domain.Video;
import jakarta.inject.Inject;
import picocli.CommandLine;

@CommandLine.Command(name = "list-videos", mixinStandardHelpOptions = true)
public class ListVideosCommand implements Runnable {
  @Inject private VideosClient client;

  @CommandLine.Option(names = {"-a", "--author-username"})
  private String authorUsername;

  @CommandLine.Option(names = {"-h", "--hashtag-name"})
  private String hashtagName;

  @Override
  public void run() {
    Iterable<Video> result = client.list(authorUsername, hashtagName);
    if (!result.iterator().hasNext()) {
      System.out.println("No videos available. Please try again later or post a video");
    } else {
      result.forEach(
          it ->
              System.out.printf(
                  "%s%nAuthor: %s%nLikes: %s%nDislikes: %s%nHashtags: %s%n----------------------%n",
                  it.getTitle(),
                  it.getAuthor().getUsername(),
                  it.getLikeCount(),
                  it.getDislikeCount(),
                  String.join(", ", it.getHashtagIds())));
    }
  }
}
