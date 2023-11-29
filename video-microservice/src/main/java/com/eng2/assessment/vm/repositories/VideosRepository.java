package com.eng2.assessment.vm.repositories;

import com.eng2.assessment.vm.domain.Video;
import io.micronaut.data.annotation.Join;
import io.micronaut.data.annotation.Query;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import jakarta.annotation.Nonnull;
import java.util.List;
import java.util.Optional;

@Repository
public interface VideosRepository extends CrudRepository<Video, Long> {

  @Join(value = "author", type = Join.Type.LEFT_FETCH)
  @Join(value = "viewers", type = Join.Type.LEFT_FETCH)
  @Join(value = "likers", type = Join.Type.LEFT_FETCH)
  @Join(value = "dislikers", type = Join.Type.LEFT_FETCH)
  @Join(value = "hashtags", type = Join.Type.LEFT_FETCH)
  @Override
  Optional<Video> findById(@Nonnull Long id);

  @Join(value = "author", type = Join.Type.LEFT_FETCH)
  @Join(value = "hashtags", type = Join.Type.LEFT_FETCH)
  @Override
  List<Video> findAll();

  @Join(value = "hashtags", type = Join.Type.LEFT_FETCH)
  @Join(value = "author", type = Join.Type.LEFT_FETCH)
  Optional<Video> findByIdAndAuthorUsernameEquals(Long id, String authorUsername);

  @Join(value = "hashtags", type = Join.Type.LEFT_FETCH)
  @Join(value = "author", type = Join.Type.LEFT_FETCH)
  Optional<Video> findByIdAndHashtagsId(Long id, String hashtagsId);

  @Join(value = "hashtags", type = Join.Type.LEFT_FETCH)
  @Join(value = "author", type = Join.Type.LEFT_FETCH)
  Optional<Video> findByIdAndAuthorUsernameEqualsAndHashtagsId(
      Long id, String authorUsername, String hashtagsId);

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
