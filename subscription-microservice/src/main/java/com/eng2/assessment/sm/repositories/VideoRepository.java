package com.eng2.assessment.sm.repositories;

import com.eng2.assessment.sm.domain.Hashtag;
import com.eng2.assessment.sm.domain.User;
import com.eng2.assessment.sm.domain.Video;
import io.micronaut.data.annotation.Query;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface VideoRepository extends CrudRepository<Video, UUID> {
  Boolean existsByIdEqual(UUID id);

  @Query(
      "from Video v join User join Hashtag where :user not in v.viewers and :hashtag in v.hashtags order by v.viewCount desc")
  List<Video> findRecommendations(Hashtag hashtag, User user);

  @Override
  Optional<Video> findById(UUID id);
}
