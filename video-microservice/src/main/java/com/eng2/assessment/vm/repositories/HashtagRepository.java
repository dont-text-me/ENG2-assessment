package com.eng2.assessment.vm.repositories;

import com.eng2.assessment.vm.domain.Hashtag;
import io.micronaut.data.annotation.Join;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import jakarta.annotation.Nonnull;
import java.util.Collection;

@Repository
public interface HashtagRepository extends CrudRepository<Hashtag, String> {
  @Join(value = "taggedVideos", type = Join.Type.LEFT_FETCH)
  Collection<Hashtag> findByIdIn(@Nonnull Collection<String> ids);
}
