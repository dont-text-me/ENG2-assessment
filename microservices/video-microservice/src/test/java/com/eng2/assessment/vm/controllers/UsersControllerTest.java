package com.eng2.assessment.vm.controllers;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import com.eng2.assessment.vm.domain.User;
import com.eng2.assessment.vm.dto.UserDTO;
import com.eng2.assessment.vm.events.UserCreationProducer;
import com.eng2.assessment.vm.repositories.UsersRepository;
import com.eng2.assessment.vm.utils.DbCleanupExtension;
import com.eng2.assessment.vm.utils.UsersClient;
import io.micronaut.context.annotation.Replaces;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import java.util.UUID;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@MicronautTest(transactional = false)
@ExtendWith(DbCleanupExtension.class)
public class UsersControllerTest {
  @Inject private UsersClient client;
  @Inject private UsersRepository userRepo;

  @Singleton
  @Replaces(UserCreationProducer.class)
  UserCreationProducer mockProducer() {
    return mock(UserCreationProducer.class);
  }

  @Inject UserCreationProducer mockProducer;

  @Nested
  @DisplayName("Creating a user tests")
  class RegisterUserTests {
    @Test
    public void canRegisterUser() {
      HttpResponse<String> result = client.registerUser(new UserDTO("FirstUser"));

      assertEquals(result.getStatus(), HttpStatus.CREATED);

      User createdUser = userRepo.findAll().get(0);

      assertThat(createdUser.getUsername()).isEqualTo("FirstUser");
      verify(mockProducer).userRegistered(eq("FirstUser"), any(UUID.class));
    }

    @Test
    public void enforcesUniqueUsernames() {
      User firstUser = new User();
      firstUser.setUsername("FirstUser");
      userRepo.save(firstUser);

      HttpResponse<String> result = client.registerUser(new UserDTO("FirstUser"));
      assertEquals(result.getStatus(), HttpStatus.BAD_REQUEST);
      verifyNoInteractions(mockProducer);
    }
  }
}
