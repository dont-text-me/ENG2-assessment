package com.eng2.assessment.sm.controllers;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;
import static org.mockito.MockitoAnnotations.openMocks;

import com.eng2.assessment.sm.domain.Hashtag;
import com.eng2.assessment.sm.domain.User;
import com.eng2.assessment.sm.events.SubscriptionProducer;
import com.eng2.assessment.sm.repositories.HashtagRepository;
import com.eng2.assessment.sm.repositories.UserRepository;
import com.eng2.assessment.sm.utils.DbCleanupExtension;
import com.eng2.assessment.sm.utils.SubscriptionsClient;
import io.micronaut.context.annotation.Replaces;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import java.util.Set;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;

@MicronautTest(transactional = false)
@ExtendWith(DbCleanupExtension.class)
public class SubscriptionsControllerTest {
  @Inject SubscriptionsClient client;
  @Inject private UserRepository userRepo;
  @Inject private HashtagRepository hashtagRepo;

  @Singleton
  @Replaces(SubscriptionProducer.class)
  SubscriptionProducer mockProducer() {
    return mock(SubscriptionProducer.class);
  }

  @Inject SubscriptionProducer mockProducer;

  @BeforeEach
  public void setup() {
    openMocks(this);
  }

  @AfterEach
  public void cleanup() {
    reset(mockProducer);
  }

  @Nested
  @DisplayName("Subscribing tests")
  class SubscribeTest {
    @Test
    public void canSubscribe() {
      User user = new User();
      user.setUserName("VlogEnjoyer");
      userRepo.save(user);

      Hashtag hashtag = new Hashtag();
      hashtag.setName("Vlog");
      hashtagRepo.save(hashtag);

      HttpResponse<String> result = client.subscribe("VlogEnjoyer", "Vlog");

      assertThat(result.status().getCode()).isEqualTo(HttpStatus.OK.getCode());
      assertThat(result.body()).contains("User VlogEnjoyer subscribed to hashtag Vlog");
      verify(mockProducer).userSubscribed("VlogEnjoyer", "Vlog");
      User userPostUpdate = userRepo.findByUserNameEqual("VlogEnjoyer").get();
      assertThat(userPostUpdate.getSubscriptions()).hasSize(1);
      assertThat(userPostUpdate.getSubscriptions().iterator().next())
          .matches(it -> it.getName().equals("Vlog"));
    }

    @Test
    public void handlesUserAlreadySubscribed() {
      Hashtag hashtag = new Hashtag();
      hashtag.setName("Vlog");
      hashtagRepo.save(hashtag);

      User user = new User();
      user.setUserName("VlogEnjoyer");
      user.setSubscriptions(Set.of(hashtag));
      userRepo.save(user);

      HttpResponse<String> result = client.subscribe("VlogEnjoyer", "Vlog");

      assertThat(result.status().getCode()).isEqualTo(HttpStatus.BAD_REQUEST.getCode());
      assertThat(result.body()).contains("User VlogEnjoyer is already subscribed to hashtag Vlog");
      verifyNoInteractions(mockProducer);
    }

    @Test
    public void handlesUnknownUser() {
      Hashtag hashtag = new Hashtag();
      hashtag.setName("Vlog");
      hashtagRepo.save(hashtag);

      HttpResponse<String> result = client.subscribe("UnknownUser", "Vlog");

      assertThat(result.status().getCode()).isEqualTo(HttpStatus.BAD_REQUEST.getCode());
      assertThat(result.body()).contains("User with name UnknownUser not found");
      verifyNoInteractions(mockProducer);
    }

    @Test
    public void handlesUnknownHashtag() {
      User user = new User();
      user.setUserName("VlogEnjoyer");
      userRepo.save(user);

      HttpResponse<String> result = client.subscribe("VlogEnjoyer", "UnknownHashtag");

      assertThat(result.status().getCode()).isEqualTo(HttpStatus.BAD_REQUEST.getCode());
      assertThat(result.body()).contains("Hashtag with name UnknownHashtag not found");
      verifyNoInteractions(mockProducer);
    }
  }

  @Nested
  @DisplayName("Unsubscribing tests")
  class UnsubscribeTest {
    @Test
    public void canUnsubscribe() {
      Hashtag hashtag = new Hashtag();
      hashtag.setName("Vlog");
      hashtagRepo.save(hashtag);

      User user = new User();
      user.setUserName("VlogEnjoyer");
      user.setSubscriptions(Set.of(hashtag));
      userRepo.save(user);

      HttpResponse<String> result = client.unsubscribe("VlogEnjoyer", "Vlog");

      // assertThat(result.status().getCode()).isEqualTo(HttpStatus.OK.getCode());
      assertThat(result.body()).contains("User VlogEnjoyer unsubscribed from hashtag Vlog");
      verify(mockProducer).userUnsubscribed("VlogEnjoyer", "Vlog");
      User userPostUpdate = userRepo.findByUserNameEqual("VlogEnjoyer").get();
      assertThat(userPostUpdate.getSubscriptions()).isEmpty();
    }

    @Test
    public void handlesUserAlreadyUnsubscribed() {
      Hashtag hashtag = new Hashtag();
      hashtag.setName("Vlog");
      hashtagRepo.save(hashtag);

      User user = new User();
      user.setUserName("VlogEnjoyer");
      userRepo.save(user);

      HttpResponse<String> result = client.unsubscribe("VlogEnjoyer", "Vlog");

      assertThat(result.status().getCode()).isEqualTo(HttpStatus.BAD_REQUEST.getCode());
      assertThat(result.body()).contains("User VlogEnjoyer is not subscribed to hashtag Vlog");
      verifyNoInteractions(mockProducer);
    }

    @Test
    public void handlesUnknownUser() {
      Hashtag hashtag = new Hashtag();
      hashtag.setName("Vlog");
      hashtagRepo.save(hashtag);

      HttpResponse<String> result = client.unsubscribe("UnknownUser", "Vlog");

      assertThat(result.status().getCode()).isEqualTo(HttpStatus.BAD_REQUEST.getCode());
      assertThat(result.body()).contains("User with name UnknownUser not found");
      verifyNoInteractions(mockProducer);
    }

    @Test
    public void handlesUnknownHashtag() {
      User user = new User();
      user.setUserName("VlogEnjoyer");
      userRepo.save(user);

      HttpResponse<String> result = client.unsubscribe("VlogEnjoyer", "UnknownHashtag");

      assertThat(result.status().getCode()).isEqualTo(HttpStatus.BAD_REQUEST.getCode());
      assertThat(result.body()).contains("Hashtag with name UnknownHashtag not found");
      verifyNoInteractions(mockProducer);
    }
  }
}
