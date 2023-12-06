package com.eng2.assessment.sm.controllers;

import static com.eng2.assessment.sm.utils.UserUtils.isUserSubscribedToHashtag;
import static com.eng2.assessment.sm.utils.VideoUtils.convertEntityList;

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
import sm.api.IRecommendationsClient;
import sm.domain.Hashtag;
import sm.domain.User;
import sm.dto.VideoRecommendationDTO;

@Controller("/recommendations")
public class RecommendationsController implements IRecommendationsClient {

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
              "Could not find user with name " + hashtagName, Collections.emptyList()));
    }

    if (hashtag == null) {
      return HttpResponse.notFound(
          new VideoRecommendationDTO(
              "Could not find hashtag with name " + hashtagName, Collections.emptyList()));
    }

    if (!isUserSubscribedToHashtag(user, hashtagName)) {
      return HttpResponse.badRequest(
          new VideoRecommendationDTO(
              String.format("User %s is not subscribed to hashtag %s", userName, hashtagName),
              Collections.emptyList()));
    }

    return HttpResponse.ok(
        new VideoRecommendationDTO(
            null,
            Objects.requireNonNullElse(
                convertEntityList(videoRepository.findRecs(hashtagName, userName)),
                Collections.emptyList())));
  }
}
