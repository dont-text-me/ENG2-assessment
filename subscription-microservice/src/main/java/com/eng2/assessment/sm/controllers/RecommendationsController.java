package com.eng2.assessment.sm.controllers;

import com.eng2.assessment.sm.domain.Hashtag;
import com.eng2.assessment.sm.domain.User;
import com.eng2.assessment.sm.domain.Video;
import com.eng2.assessment.sm.repositories.HashtagRepository;
import com.eng2.assessment.sm.repositories.UserRepository;
import com.eng2.assessment.sm.repositories.VideoRepository;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.QueryValue;
import jakarta.inject.Inject;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller("/recommendations")
public class RecommendationsController {

  private static final Logger logger = LoggerFactory.getLogger(SubscriptionsController.class);

  @Inject VideoRepository videoRepository;

  @Inject UserRepository userRepository;
  @Inject HashtagRepository hashtagRepository;

  @Get("/{userName}")
  public List<Video> getRecommendations(String userName, @QueryValue String hashtagName) {
    User user = userRepository.findByUserNameEqual(userName).orElse(null);
    Hashtag hashtag = hashtagRepository.findByNameEqual(hashtagName).orElse(null);

    if (user == null) {
      return null;
    }

    if (hashtag == null) {
      return null;
    }

    return videoRepository.findByHashtagsNameEqualOrderByViewCountDesc(hashtagName).stream()
        .filter(it -> !it.viewerUserNames().contains(userName))
        .limit(10)
        .toList();
  }
}
