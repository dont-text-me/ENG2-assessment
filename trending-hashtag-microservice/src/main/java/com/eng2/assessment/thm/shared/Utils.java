package com.eng2.assessment.thm.shared;

import com.eng2.assessment.thm.events.dto.WindowedHashtagWIthLikeCount;
import java.util.Comparator;

public class Utils {
  public static Comparator<WindowedHashtagWIthLikeCount> trendingHashtagOrdering =
      Comparator.comparing(WindowedHashtagWIthLikeCount::likeCount)
          .reversed()
          .thenComparing(WindowedHashtagWIthLikeCount::hashtagName);
}
