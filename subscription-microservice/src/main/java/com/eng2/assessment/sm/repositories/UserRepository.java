package com.eng2.assessment.sm.repositories;

import com.eng2.assessment.sm.domain.User;
import io.micronaut.data.annotation.Join;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, String> {
  Boolean existsByUserNameEqual(String userName);

  @Join(value = "subscriptions", type = Join.Type.LEFT_FETCH)
  Optional<User> findByUserNameEqual(String userName);
}
