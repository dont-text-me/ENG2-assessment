package com.eng2.assessment.client.utils.formatters;

import com.eng2.assessment.thm.domain.TrendingHashtag;

public class TrendingHashtagFormatter {
  public static String prettyPrintTrendingHashtag(TrendingHashtag hashtag) {
    return String.format("\t%s (%s likes)%n", hashtag.getHashtagName(), hashtag.getLikeCount());
  }
}
