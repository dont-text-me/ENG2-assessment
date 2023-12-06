package com.eng2.assessment.client.utils.formatters;

import java.time.ZoneOffset;
import vm.dto.VideoResponseDTO;

public class VideoFormatter {
  public static String prettyPrintVideo(VideoResponseDTO video) {
    return String.format(
        "%s%nID: %s%nPosted at: %s%nAuthor: %s%nLikes: %s%nDislikes: %s%nHashtags: %s%n",
        video.title(),
        video.id(),
        video.publishedAt().atOffset(ZoneOffset.UTC),
        video.authorUsername(),
        video.likeCount(),
        video.dislikeCount(),
        String.join(", ", video.hashtagIds()));
  }
}
