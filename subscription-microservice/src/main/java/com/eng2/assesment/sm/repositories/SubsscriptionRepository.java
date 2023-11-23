package com.eng2.assesment.sm.repositories;

import com.eng2.assesment.sm.domain.Subscription;
import io.micronaut.data.repository.CrudRepository;
import java.util.UUID;

public interface SubsscriptionRepository extends CrudRepository<Subscription, UUID> {
  Boolean existsByUserIdEqualAndHashtagIdEqual(UUID id, String hashtagId);

  void deleteByUserIdEqualAndHashtagIdEqual(UUID userId, String hashtagId);
}
