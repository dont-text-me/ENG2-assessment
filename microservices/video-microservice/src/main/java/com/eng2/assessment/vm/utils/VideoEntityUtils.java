package com.eng2.assessment.vm.utils;

import java.util.List;
import vm.domain.Hashtag;
import vm.domain.Video;

public class VideoEntityUtils {

  public static List<String> getHashtagIds(Video video) {
    return video.getHashtags().stream().map(Hashtag::getId).toList();
  }

  public static void incrementViewCount(Video video) {
    video.setViewCount(video.getViewCount() + 1);
  }

  public static void incrementLikeCount(Video video) {
    video.setLikeCount(video.getLikeCount() + 1);
  }

  public static void incrementDislikeCount(Video video) {
    video.setDislikeCount(video.getDislikeCount() + 1);
  }
}
