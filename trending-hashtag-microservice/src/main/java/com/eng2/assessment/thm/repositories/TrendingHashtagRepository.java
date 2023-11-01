package com.eng2.assessment.thm.repositories;

import com.eng2.assessment.thm.domain.TrendingHashtag;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import java.util.UUID;

@Repository
public interface TrendingHashtagRepository extends CrudRepository<TrendingHashtag, UUID> {}
