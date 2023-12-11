package com.eng2.assessment.client.utils.formatters;

import com.eng2.assessment.generated.sm.dto.VideoDTO;

public class VideoRecommendationFormatter {
  public static String prettyPrintRecommendation(VideoDTO video) {
    return String.format(
        "%s (%s %s)%nID: %s%nHashtags: %s%n",
        video.title(),
        video.viewCount(),
        video.viewCount().equals(1L) ? "view" : "views",
        video.id(),
        String.join(", ", video.hashtagNames()));
  }
}
