package com.eng2.assessment.sm.repositories;

import com.eng2.assessment.generated.sm.domain.Hashtag;
import io.micronaut.data.annotation.Join;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Repository
public interface HashtagRepository extends CrudRepository<Hashtag, String> {
  Boolean existsByNameEqual(String name);

  List<Hashtag> findByNameIn(Collection<String> name);

  @Join(value = "taggedVideos", type = Join.Type.LEFT_FETCH)
  @Join(value = "subscribers", type = Join.Type.LEFT_FETCH)
  Optional<Hashtag> findByNameEqual(String name);
}
