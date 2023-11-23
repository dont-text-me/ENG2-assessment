package com.eng2.assessment.sm.repositories;

import com.eng2.assessment.sm.domain.Hashtag;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import java.util.Collection;
import java.util.List;

@Repository
public interface HashtagRepository extends CrudRepository<Hashtag, String> {
  Boolean existsByNameEqual(String name);

  List<Hashtag> findByNameIn(Collection<String> name);
}
