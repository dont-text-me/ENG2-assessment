package com.eng2.assesment.sm.repositories;

import com.eng2.assesment.sm.domain.Video;
import io.micronaut.data.repository.CrudRepository;
import java.util.UUID;

public interface VideoRepository extends CrudRepository<Video, UUID> {}
