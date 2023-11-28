package com.eng2.assessment.sm.controllers;

import com.eng2.assessment.sm.domain.Hashtag;
import com.eng2.assessment.sm.domain.User;
import com.eng2.assessment.sm.dto.VideoRecommendationDTO;
import com.eng2.assessment.sm.repositories.HashtagRepository;
import com.eng2.assessment.sm.repositories.UserRepository;
import com.eng2.assessment.sm.repositories.VideoRepository;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.QueryValue;
import jakarta.inject.Inject;
import java.util.Collections;
import java.util.Objects;

@Controller("/recommendations")
public class RecommendationsController {

  @Inject VideoRepository videoRepository;

  @Inject UserRepository userRepository;
  @Inject HashtagRepository hashtagRepository;

  @Get("/{userName}")
  public HttpResponse<VideoRecommendationDTO> getRecommendations(
      String userName, @QueryValue String hashtagName) {
    User user = userRepository.findByUserNameEqual(userName).orElse(null);
    Hashtag hashtag = hashtagRepository.findByNameEqual(hashtagName).orElse(null);

    if (user == null) {
      return HttpResponse.notFound(
          new VideoRecommendationDTO(
              Collections.emptyList(), "Could not find user with name " + hashtagName));
    }

    if (hashtag == null) {
      return HttpResponse.notFound(
          new VideoRecommendationDTO(
              Collections.emptyList(), "Could not find hashtag with name " + hashtagName));
    }

    if (!user.isSubscribedTo(hashtagName)) {
      return HttpResponse.badRequest(
          new VideoRecommendationDTO(
              Collections.emptyList(),
              String.format("User %s is not subscribed to hashtag %s", userName, hashtagName)));
    }

    return HttpResponse.ok(
        new VideoRecommendationDTO(
            Objects.requireNonNullElse(
                videoRepository.findRecs(hashtagName, userName), Collections.emptyList()),
            null));
  }
}
