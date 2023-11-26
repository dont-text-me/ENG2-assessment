package com.eng2.assessment.sm.repositories;

import com.eng2.assessment.sm.domain.Video;
import io.micronaut.data.annotation.Join;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface VideoRepository extends CrudRepository<Video, UUID> {
  Boolean existsByIdEqual(UUID id);

  @Join(value = "viewers", type = Join.Type.LEFT_FETCH)
  @Join(value = "hashtags", type = Join.Type.LEFT_FETCH)
  List<Video> findByHashtagsNameEqualOrderByViewCountDesc(String hashtags_name);

  @Override
  @Join(value = "viewers", type = Join.Type.LEFT_FETCH)
  @Join(value = "hashtags", type = Join.Type.LEFT_FETCH)
  Optional<Video> findById(UUID id);

  @Override
  @Join(value = "viewers", type = Join.Type.LEFT_FETCH)
  @Join(value = "hashtags", type = Join.Type.LEFT_FETCH)
  List<Video> findAll();
}
