package com.eng2.assessment.client.utils.formatters;

import com.eng2.assessment.sm.domain.Video;

public class VideoRecommendationFormatter {
  public static String prettyPrintRecommendation(Video video) {
    return String.format(
        "%s (%s %s)%nID: %s%nHashtags: %s%n",
        video.getTitle(),
        video.getViewCount(),
        video.getViewCount().equals(1L) ? "view" : "views",
        video.getId(),
        String.join(", ", video.hashtagNames()));
  }
}
