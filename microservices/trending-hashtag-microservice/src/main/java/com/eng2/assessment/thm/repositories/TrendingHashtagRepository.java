package com.eng2.assessment.thm.repositories;

import com.eng2.assessment.generated.thm.domain.TrendingHashtag;
import com.eng2.assessment.generated.thm.dto.WindowedHashtagWithLikeCount;
import io.micronaut.data.annotation.Query;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import java.util.List;
import java.util.UUID;

@Repository
public interface TrendingHashtagRepository extends CrudRepository<TrendingHashtag, UUID> {
  /**
   * Fetches a list of {@link WindowedHashtagWithLikeCount} entities representing the **max** like count for a given hashtag within a given period of time.
   * The max function is needed to handle records belonging to multiple windows at a time: only the one with the most likes will be returned.
   *
   * @param windowEndFrom The maximum age of a window - windows that have closed earlier than this point are not returned
   * */
  @Query(
      """
select new com.eng2.assessment.generated.thm.dto.WindowedHashtagWithLikeCount(th.hashtagName, max(th.likeCount), th.windowStart, th.windowEnd)
from TrendingHashtag th
where th.windowEnd >= :windowEndFrom
and th.windowEnd <= :windowEndTo
group by th.hashtagName
order by max(th.likeCount) desc, th.hashtagName
""")
  List<WindowedHashtagWithLikeCount> getTrending(Long windowEndFrom, Long windowEndTo);
}
