package com.eng2.assessment.vm.repositories;

import com.eng2.assessment.vm.domain.User;
import io.micronaut.data.annotation.Join;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import jakarta.annotation.Nonnull;
import java.util.Optional;

@Repository
public interface UsersRepository extends CrudRepository<User, Long> {
  @Join(value = "publishedVideos", type = Join.Type.LEFT_FETCH)
  @Join(value = "viewedVideos", type = Join.Type.LEFT_FETCH)
  @Join(value = "likedVideos", type = Join.Type.LEFT_FETCH)
  @Join(value = "dislikedVideos", type = Join.Type.LEFT_FETCH)
  @Override
  Optional<User> findById(@Nonnull Long id);

  /** Find by username (exact match) */
  @Join(value = "publishedVideos", type = Join.Type.LEFT_FETCH)
  @Join(value = "viewedVideos", type = Join.Type.LEFT_FETCH)
  @Join(value = "likedVideos", type = Join.Type.LEFT_FETCH)
  @Join(value = "dislikedVideos", type = Join.Type.LEFT_FETCH)
  Optional<User> findByUsernameEqual(@Nonnull String username);

  Boolean existsByUsernameEqual(String username);
}
