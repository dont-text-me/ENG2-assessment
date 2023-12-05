package com.eng2.assessment.vm.repositories;

import io.micronaut.data.annotation.Join;
import io.micronaut.data.annotation.Query;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import jakarta.annotation.Nonnull;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import vm.domain.Video;

@Repository
public interface VideosRepository extends CrudRepository<Video, UUID> {

  @Join(value = "author", type = Join.Type.LEFT_FETCH)
  @Join(value = "viewers", type = Join.Type.LEFT_FETCH)
  @Join(value = "likers", type = Join.Type.LEFT_FETCH)
  @Join(value = "dislikers", type = Join.Type.LEFT_FETCH)
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
  List<Video> findAllByAuthorUsernameEquals(String authorUsername);

  @Query(
      "select v from Video v "
          + "left join fetch v.hashtags "
          + "left join fetch v.author "
          + "where exists(select 1 from v.hashtags hs where hs.id = :hashtagId)")
  List<Video> filterByHashtag(String hashtagId);

  @Query(
      "select v from Video v "
          + "left join fetch v.hashtags "
          + "left join fetch v.author "
          + "where exists(select 1 from v.hashtags hs where hs.id = :hashtagId) and v.author.username = :authorUsername")
  List<Video> filterByAuthorAndHashtag(String authorUsername, String hashtagId);
}
