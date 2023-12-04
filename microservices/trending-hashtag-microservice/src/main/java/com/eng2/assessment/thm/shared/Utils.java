package com.eng2.assessment.thm.shared;

import com.eng2.assessment.thm.domain.TrendingHashtag;
import java.util.Comparator;

public class Utils {
  public static Comparator<TrendingHashtag> trendingHashtagOrdering =
      Comparator.comparing(TrendingHashtag::getLikeCount)
          .reversed()
          .thenComparing(TrendingHashtag::getHashtagName);
}
