package com.eng2.assessment.client.utils.formatters;

import com.eng2.assessment.sm.domain.Video;

public class VideoRecommendationFormatter {
  public static String prettyPrintRecommendation(Video video) {
    return String.format(
        "%s (%s views)%nHashtags: %s%n",
        video.getTitle(), video.getViewCount(), String.join(", ", video.hashtagNames()));
  }
}
