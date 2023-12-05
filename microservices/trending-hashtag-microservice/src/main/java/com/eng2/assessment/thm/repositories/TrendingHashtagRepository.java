package com.eng2.assessment.thm.repositories;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import thm.domain.TrendingHashtag;

@Repository
public interface TrendingHashtagRepository extends CrudRepository<TrendingHashtag, UUID> {
  Optional<Long> findMaxWindowEnd();

  List<TrendingHashtag> findByWindowEndLessThanEqualsAndWindowEndGreaterThanOrderByLikeCountDesc(
      Long windowEnd, Long windowEnd2);
}
