package com.eng2.assessment.thm.shared;

import java.util.Comparator;
import thm.domain.TrendingHashtag;

public class Utils {
  public static Comparator<TrendingHashtag> trendingHashtagOrdering =
      Comparator.comparing(TrendingHashtag::getLikeCount)
          .reversed()
          .thenComparing(TrendingHashtag::getHashtagName);
}
