package com.eng2.assessment.client.utils.formatters;

import com.eng2.assessment.vm.domain.Video;
import java.time.ZoneOffset;

public class VideoFormatter {
  public static String prettyPrintVideo(Video video) {
    return String.format(
        "%s%nPosted at: %s%nAuthor: %s%nLikes: %s%nDislikes: %s%nHashtags: %s%n",
        video.getTitle(),
        video.getPublishedAt().atOffset(ZoneOffset.UTC),
        video.getAuthor().getUsername(),
        video.getLikeCount(),
        video.getDislikeCount(),
        String.join(", ", video.getHashtagIds()));
  }
}
