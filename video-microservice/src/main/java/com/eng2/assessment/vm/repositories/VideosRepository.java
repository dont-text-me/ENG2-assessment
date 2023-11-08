package com.eng2.assessment.vm.repositories;

import com.eng2.assessment.vm.domain.Video;
import io.micronaut.data.annotation.Join;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import jakarta.annotation.Nonnull;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface VideosRepository extends CrudRepository<Video, UUID> {

  @Join(value = "author", type = Join.Type.LEFT_FETCH)
  @Join(value = "viewers", type = Join.Type.LEFT_FETCH)
  @Join(value = "hashtags", type = Join.Type.LEFT_FETCH)
  @Override
  Optional<Video> findById(@Nonnull UUID id);

  @Join(value = "author", type = Join.Type.LEFT_FETCH)
  @Join(value = "hashtags", type = Join.Type.LEFT_FETCH)
  @Override
  List<Video> findAll();

  @Join(value = "hashtags", type = Join.Type.LEFT_FETCH)
  @Join(value = "author", type = Join.Type.LEFT_FETCH)
  Optional<Video> findByIdAndAuthorUsernameEquals(UUID id, String authorUsername);

  @Join(value = "hashtags", type = Join.Type.LEFT_FETCH)
  @Join(value = "author", type = Join.Type.LEFT_FETCH)
  Optional<Video> findByIdAndHashtagsId(UUID id, String hashtagsId);

  @Join(value = "hashtags", type = Join.Type.LEFT_FETCH)
  @Join(value = "author", type = Join.Type.LEFT_FETCH)
  Optional<Video> findByIdAndAuthorUsernameEqualsAndHashtagsId(
      UUID id, String authorUsername, String hashtagsId);

  @Join(value = "hashtags", type = Join.Type.LEFT_FETCH)
  @Join(value = "author", type = Join.Type.LEFT_FETCH)
  Collection<Video> findAllByAuthorUsernameEquals(String authorUsername);

  @Join(value = "hashtags", type = Join.Type.LEFT_FETCH)
  @Join(value = "author", type = Join.Type.LEFT_FETCH)
  Collection<Video> findAllByHashtagsId(String hashtagsId);

  @Join(value = "hashtags", type = Join.Type.LEFT_FETCH)
  @Join(value = "author", type = Join.Type.LEFT_FETCH)
  Collection<Video> findAllByAuthorUsernameEqualsAndHashtagsId(
      String authorUsername, String hashtagId);
}
