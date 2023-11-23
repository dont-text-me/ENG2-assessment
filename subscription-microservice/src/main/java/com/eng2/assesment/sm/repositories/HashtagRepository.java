package com.eng2.assesment.sm.repositories;

import com.eng2.assesment.sm.domain.Hashtag;
import io.micronaut.data.repository.CrudRepository;
import java.util.Collection;
import java.util.List;

public interface HashtagRepository extends CrudRepository<Hashtag, String> {
  Boolean existsByNameEqual(String name);

  List<Hashtag> findByNameIn(Collection<String> name);
}
