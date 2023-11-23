package com.eng2.assesment.sm.repositories;

import com.eng2.assesment.sm.domain.User;
import io.micronaut.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {
  Boolean existsByUserNameEqual(String userName);
}
