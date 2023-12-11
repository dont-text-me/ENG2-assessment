package com.eng2.assessment.sm.repositories;

import com.eng2.assessment.generated.sm.domain.User;
import io.micronaut.data.annotation.Join;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, String> {
  Boolean existsByUserNameEqual(String userName);

  @Join(value = "subscriptions", type = Join.Type.LEFT_FETCH)
  @Join(value = "viewedVideos", type = Join.Type.LEFT_FETCH)
  Optional<User> findByUserNameEqual(String userName);

  @Override
  @Join(value = "subscriptions", type = Join.Type.LEFT_FETCH)
  @Join(value = "viewedVideos", type = Join.Type.LEFT_FETCH)
  List<User> findAll();
}
