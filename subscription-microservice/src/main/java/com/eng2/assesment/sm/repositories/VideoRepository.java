package com.eng2.assesment.sm.repositories;

import com.eng2.assesment.sm.domain.Hashtag;
import com.eng2.assesment.sm.domain.Video;
import io.micronaut.data.repository.CrudRepository;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public interface VideoRepository extends CrudRepository<Video, UUID> {
  Boolean existsByIdEqual(UUID id);

  List<Video> findByHashtagsContainsOrderByViewCount(Set<Hashtag> hashtags);
}
