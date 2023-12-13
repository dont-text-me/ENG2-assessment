package com.eng2.assessment.sm.events;

import static com.eng2.assessment.generated.shared.Topics.TOPIC_USER_REGISTERED;

import com.eng2.assessment.generated.sm.domain.User;
import com.eng2.assessment.generated.sm.events.IUserCreationConsumer;
import com.eng2.assessment.generated.vm.dto.UserRegisteredMessageValueDTO;
import com.eng2.assessment.sm.repositories.UserRepository;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.Topic;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import java.util.HashSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@KafkaListener(groupId = "subscription-microservice")
public class UserCreationConsumer implements IUserCreationConsumer {
  private static final Logger logger = LoggerFactory.getLogger(UserCreationConsumer.class);
  @Inject private UserRepository userRepository;

  @Topic(TOPIC_USER_REGISTERED)
  @Transactional
  public void consumeUserRegisteredMessage(
      @KafkaKey String userName,
      UserRegisteredMessageValueDTO
          value) { // Note: the value is not used here, it is a workaround of messages not
    // being allowed to not have a body
    if (!userRepository.existsByUserNameEqual(userName)) {
      logger.info("Creating new user with username " + userName);
      User newUser = new User();
      newUser.setUserName(userName);
      newUser.setViewedVideos(new HashSet<>());
      userRepository.save(newUser);
    }
  }
}
