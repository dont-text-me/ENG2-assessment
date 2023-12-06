package com.eng2.assessment.client.utils.formatters;

import thm.dto.WindowedHashtagWithLikeCount;

public class TrendingHashtagFormatter {
  public static String prettyPrintTrendingHashtag(WindowedHashtagWithLikeCount hashtag) {
    return String.format(
        "\t%s (%s %s)%n",
        hashtag.hashtagName(),
        hashtag.likeCount(),
        hashtag.likeCount().equals(1L) ? "like" : "likes");
  }
}
