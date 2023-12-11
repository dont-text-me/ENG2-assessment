package com.eng2.assessment.sm.utils;

import com.eng2.assessment.generated.sm.domain.Hashtag;
import com.eng2.assessment.generated.sm.domain.User;

import java.util.UUID;

public class UserUtils {
  public static boolean isUserSubscribedToHashtag(User user, String hashtagId) {
    return user.getSubscriptions().stream().anyMatch(it -> it.getName().equals(hashtagId));
  }

  public static boolean hasUserWatchedVideo(User user, UUID videoId) {
    return user.getViewedVideos().stream().anyMatch(it -> it.getId().equals(videoId));
  }

  public static void addSubscription(User user, Hashtag hashtag) {
    user.getSubscriptions().add(hashtag);
  }

  public static void removeSubscription(User user, Hashtag hashtag) {
    user.getSubscriptions().removeIf(it -> it.getName().equals(hashtag.getName()));
  }
}
