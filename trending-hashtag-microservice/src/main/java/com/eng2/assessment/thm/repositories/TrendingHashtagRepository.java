package com.eng2.assessment.thm.repositories;

import com.eng2.assessment.thm.domain.TrendingHashtag;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import java.util.List;
import java.util.UUID;

@Repository
public interface TrendingHashtagRepository extends CrudRepository<TrendingHashtag, UUID> {
  Long findMaxWindowEnd();

  /**
   * Returns the top 10 most liked hashtags for a provided time window. <br>
   * <br>
   * <strong>Note:</strong> Because of the implementation of the underlying stream (see {@link
   * com.eng2.assessment.thm.events.TrendingHashtagsStream}), there is no need to de-duplicate
   * hashtags within a window as the updates are suppressed until the window closes. Therefore, this
   * method only needs to apply ordering and (if needed) limiting to the returned data.
   */
  List<TrendingHashtag> findFirst10ByWindowEndEqualOrderByLikeCountDesc(Long windowEnd);
}
