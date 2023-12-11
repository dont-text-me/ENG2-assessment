package com.eng2.assessment.sm.utils;

import java.util.List;
import com.eng2.assessment.generated.sm.domain.Hashtag;
import com.eng2.assessment.generated.sm.domain.User;
import com.eng2.assessment.generated.sm.domain.Video;
import com.eng2.assessment.generated.sm.dto.VideoDTO;

public class VideoUtils {
  public static List<VideoDTO> convertEntityList(List<Video> videos) {
    return videos.stream()
        .map(
            it ->
                new VideoDTO(
                    it.getId(),
                    it.getTitle(),
                    it.getViewCount(),
                    it.getHashtags().stream().map(Hashtag::getName).toList()))
        .toList();
  }

  public static void addViewer(Video video, User user) {
    video.getViewers().add(user);
  }

  public static void incrementViewCount(Video video) {
    video.setViewCount(video.getViewCount() + 1);
  }
}
