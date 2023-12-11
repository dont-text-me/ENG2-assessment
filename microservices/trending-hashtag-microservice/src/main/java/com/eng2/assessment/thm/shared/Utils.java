package com.eng2.assessment.thm.shared;

import java.util.Comparator;
import java.util.List;
import com.eng2.assessment.generated.thm.domain.TrendingHashtag;
import com.eng2.assessment.generated.thm.dto.TrendingHashtagResponseDTO;
import com.eng2.assessment.generated.thm.dto.WindowedHashtagWithLikeCount;

public class Utils {
  public static Comparator<TrendingHashtag> trendingHashtagOrdering =
      Comparator.comparing(TrendingHashtag::getLikeCount)
          .reversed()
          .thenComparing(TrendingHashtag::getHashtagName);

  public static TrendingHashtagResponseDTO convertEntityList(List<TrendingHashtag> hashtags) {
    return new TrendingHashtagResponseDTO(
        hashtags.stream()
            .map(
                it ->
                    new WindowedHashtagWithLikeCount(
                        it.getHashtagName(),
                        it.getLikeCount(),
                        it.getWindowStart(),
                        it.getWindowEnd()))
            .toList());
  }
}
