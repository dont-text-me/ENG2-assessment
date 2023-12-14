package com.eng2.assessment.vm.entityUtilsTest;

import static com.eng2.assessment.vm.utils.UserEntityUtils.*;
import static org.assertj.core.api.Assertions.assertThat;

import com.eng2.assessment.generated.vm.domain.User;
import com.eng2.assessment.generated.vm.domain.Video;
import java.util.Collections;
import java.util.Set;
import java.util.UUID;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class UserEntityUtilsTest {
  @Nested
  class HasUserLikedVideoTest {
    @Test
    public void handlesUserLiking() {
      UUID videoId = UUID.randomUUID(), otherVideoId = UUID.randomUUID();
      User user = new User();
      Video video = new Video();
      video.setId(videoId);
      Video otherVideo = new Video();
      otherVideo.setId(otherVideoId);

      user.setLikedVideos(Set.of(video));

      assertThat(hasUserLikedVideo(user, videoId)).isTrue();
      assertThat(hasUserLikedVideo(user, otherVideoId)).isFalse();
    }

    @Test
    public void handlesUnknownVideo() {
      User user = new User();

      user.setLikedVideos(Collections.emptySet());

      assertThat(hasUserLikedVideo(user, UUID.randomUUID())).isFalse();
    }
  }

  @Nested
  class HasUserDislikedVideoTest {
    @Test
    public void handlesUserDisliking() {
      UUID videoId = UUID.randomUUID(), otherVideoId = UUID.randomUUID();
      User user = new User();
      Video video = new Video();
      video.setId(videoId);
      Video otherVideo = new Video();
      otherVideo.setId(otherVideoId);

      user.setDislikedVideos(Set.of(video));

      assertThat(hasUserDislikedVideo(user, videoId)).isTrue();
      assertThat(hasUserDislikedVideo(user, otherVideoId)).isFalse();
    }

    @Test
    public void handlesUnknownVideo() {
      User user = new User();

      user.setDislikedVideos(Collections.emptySet());

      assertThat(hasUserDislikedVideo(user, UUID.randomUUID())).isFalse();
    }
  }

  @Nested
  class HasUserWatchedVideoTest {
    @Test
    public void handlesUserViewing() {
      UUID videoId = UUID.randomUUID(), otherVideoId = UUID.randomUUID();
      User user = new User();
      Video video = new Video();
      video.setId(videoId);
      Video otherVideo = new Video();
      otherVideo.setId(otherVideoId);

      user.setViewedVideos(Set.of(video));

      assertThat(hasUserWatchedVideo(user, videoId)).isTrue();
      assertThat(hasUserWatchedVideo(user, otherVideoId)).isFalse();
    }

    @Test
    public void handlesUnknownVideo() {
      User user = new User();

      user.setViewedVideos(Collections.emptySet());

      assertThat(hasUserWatchedVideo(user, UUID.randomUUID())).isFalse();
    }
  }
}
