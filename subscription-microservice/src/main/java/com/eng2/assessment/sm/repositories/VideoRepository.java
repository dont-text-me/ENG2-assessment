package com.eng2.assessment.sm.repositories;

import com.eng2.assessment.sm.domain.Video;
import io.micronaut.data.annotation.Join;
import io.micronaut.data.annotation.Query;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface VideoRepository extends CrudRepository<Video, UUID> {
  Boolean existsByIdEqual(UUID id);

  @Override
  @Join(value = "viewers", type = Join.Type.LEFT_FETCH)
  @Join(value = "hashtags", type = Join.Type.LEFT_FETCH)
  Optional<Video> findById(UUID id);

  @Override
  @Join(value = "viewers", type = Join.Type.LEFT_FETCH)
  @Join(value = "hashtags", type = Join.Type.LEFT_FETCH)
  List<Video> findAll();

  @Query(
      "select v from Video v left join fetch v.viewers as vs "
          + "left join fetch v.hashtags as hs "
          + "where exists(select 1 from v.hashtags h where h.id = :hashtagName) "
          + "and not exists(select 1 from v.viewers u where u.id = :userName) "
          + "order by v.viewCount desc, v.title limit 10")
  List<Video> findRecs(String hashtagName, String userName);
}
