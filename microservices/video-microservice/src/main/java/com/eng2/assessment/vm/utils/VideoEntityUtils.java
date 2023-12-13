package com.eng2.assessment.vm.utils;

import com.eng2.assessment.generated.vm.domain.Hashtag;
import com.eng2.assessment.generated.vm.domain.Video;
import com.eng2.assessment.generated.vm.dto.VideoResponseDTO;
import com.eng2.assessment.generated.vm.dto.VideoResultsDTO;
import java.util.List;

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

  public static VideoResultsDTO convertEntityList(List<Video> videos) {
    return new VideoResultsDTO(
        videos.stream()
            .map(
                it ->
                    new VideoResponseDTO(
                        it.getTitle(),
                        it.getId(),
                        it.getPublishedAt(),
                        it.getAuthor().getUsername(),
                        it.getLikeCount(),
                        it.getDislikeCount(),
                        it.getHashtags().stream().map(Hashtag::getId).toList(),
                        it.getViewCount()))
            .toList());
  }

  public static VideoResponseDTO convertEntity(Video it) {
    return new VideoResponseDTO(
        it.getTitle(),
        it.getId(),
        it.getPublishedAt(),
        it.getAuthor().getUsername(),
        it.getLikeCount(),
        it.getDislikeCount(),
        it.getHashtags().stream().map(Hashtag::getId).toList(),
        it.getViewCount());
  }
}
