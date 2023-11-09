package com.eng2.assessment.vm.repositories;

import com.eng2.assessment.vm.domain.User;
import io.micronaut.data.annotation.Join;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import jakarta.annotation.Nonnull;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface UsersRepository extends CrudRepository<User, UUID> {
  @Join(value = "publishedVideos", type = Join.Type.LEFT_FETCH)
  @Join(value = "viewedVideos", type = Join.Type.LEFT_FETCH)
  @Override
  Optional<User> findById(@Nonnull UUID id);

  /** Find by username (exact match) */
  @Join(value = "publishedVideos", type = Join.Type.LEFT_FETCH)
  @Join(value = "viewedVideos", type = Join.Type.LEFT_FETCH)
  Optional<User> findByUsernameEqual(@Nonnull String username);

  Boolean existsByUsernameEqual(String username);
}
