package com.eng2.assesment.sm.repositories;

import com.eng2.assesment.sm.domain.Hashtag;
import io.micronaut.data.repository.CrudRepository;
import java.util.UUID;

public interface HashtagRepository extends CrudRepository<Hashtag, UUID> {}
