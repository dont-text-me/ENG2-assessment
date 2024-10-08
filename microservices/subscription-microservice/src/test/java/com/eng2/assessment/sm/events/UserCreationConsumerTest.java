package com.eng2.assessment.sm.events;

import static org.assertj.core.api.Assertions.assertThat;

import com.eng2.assessment.generated.sm.domain.User;
import com.eng2.assessment.generated.vm.dto.UserRegisteredMessageValueDTO;
import com.eng2.assessment.shared.testUtils.DbCleanupExtension;
import com.eng2.assessment.sm.repositories.UserRepository;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@MicronautTest(transactional = false)
@ExtendWith(DbCleanupExtension.class)
@DisplayName("Receiving a 'user-registered' message")
public class UserCreationConsumerTest {
  @Inject UserCreationConsumer sut;
  @Inject UserRepository userRepo;

  @Test
  public void handlesNewUser() {
    sut.consumeUserRegisteredMessage(
        "NewUser", new UserRegisteredMessageValueDTO(UUID.randomUUID()));

    User result = userRepo.findByUserNameEqual("NewUser").orElse(null);

    assertThat(result).isNotNull();
    assertThat(result.getUserName()).isEqualTo("NewUser");
    assertThat(result.getSubscriptions()).isEmpty();
    assertThat(result.getViewedVideos()).isEmpty();
  }

  @Test
  @DisplayName(
      "Handles case when a user already exist. This can happen e.g. when a video-viewed message arrives before a user-registered message")
  public void handlesExistingUser() {
    User user = new User();
    user.setUserName("ExistingUser");
    user.setSubscriptions(Collections.emptySet());
    user.setViewedVideos(Collections.emptySet());
    userRepo.save(user);

    sut.consumeUserRegisteredMessage(
        "ExistingUser", new UserRegisteredMessageValueDTO(UUID.randomUUID()));

    List<User> result = userRepo.findAll();

    assertThat(result).isNotNull().hasSize(1);
    assertThat(result.get(0).getUserName()).isEqualTo("ExistingUser");
  }
}
