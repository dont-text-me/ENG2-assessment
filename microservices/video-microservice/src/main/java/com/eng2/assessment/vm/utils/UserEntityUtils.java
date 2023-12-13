package com.eng2.assessment.vm.utils;

import com.eng2.assessment.generated.vm.domain.User;
import com.eng2.assessment.generated.vm.domain.Video;
import java.util.UUID;

public class UserEntityUtils {
  public static boolean hasUserWatchedVideo(User user, UUID videoId) {
    return user.getViewedVideos().stream().anyMatch(it -> it.getId().equals(videoId));
  }
  ;

  public static boolean hasUserLikedVideo(User user, UUID videoId) {
    return user.getLikedVideos().stream().anyMatch(it -> it.getId().equals(videoId));
  }
  ;

  public static boolean hasUserDislikedVideo(User user, UUID videoId) {
    return user.getDislikedVideos().stream().anyMatch(it -> it.getId().equals(videoId));
  }
  ;

  public static void addViewedVideo(User user, Video video) {
    user.getViewedVideos().add(video);
  }

  public static void addLikedVideo(User user, Video video) {
    user.getLikedVideos().add(video);
  }

  public static void addDislikedVideo(User user, Video video) {
    user.getDislikedVideos().add(video);
  }
}
