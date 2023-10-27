package com.eng2.assessment.vm.repositories;

import com.eng2.assessment.vm.domain.Video;
import io.micronaut.data.annotation.Join;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import jakarta.annotation.Nonnull;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface VideosRepository extends CrudRepository<Video, UUID> {

  @Join(value = "author", type = Join.Type.LEFT_FETCH)
  @Join(value = "viewers", type = Join.Type.LEFT_FETCH)
  @Join(value = "hashtags", type = Join.Type.LEFT_FETCH)
  @Override
  Optional<Video> findById(@Nonnull UUID id);
}
