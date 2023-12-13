package com.eng2.assessment.sm.entityUtilsTests;

import static com.eng2.assessment.sm.utils.UserUtils.hasUserWatchedVideo;
import static com.eng2.assessment.sm.utils.UserUtils.isUserSubscribedToHashtag;
import static org.assertj.core.api.Assertions.assertThat;

import com.eng2.assessment.generated.sm.domain.Hashtag;
import com.eng2.assessment.generated.sm.domain.User;
import com.eng2.assessment.generated.sm.domain.Video;
import java.util.Collections;
import java.util.Set;
import java.util.UUID;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class UserUtilsTest {
  @Nested
  class IsUserSubscribedToHashtagTest {

    @Test
    public void handlesUserSubscribingToHashtag() {
      User user = new User();
      Hashtag hashtag = new Hashtag();
      hashtag.setName("Hashtag");
      Hashtag otherHashtag = new Hashtag();
      otherHashtag.setName("OtherHashtag");
      user.setSubscriptions(Set.of(hashtag));

      assertThat(isUserSubscribedToHashtag(user, "Hashtag")).isTrue();
      assertThat(isUserSubscribedToHashtag(user, "OtherHashtag")).isFalse();
    }

    @Test
    public void handlesUnknownHashtag() {
      User user = new User();
      user.setSubscriptions(Collections.emptySet());
      assertThat(isUserSubscribedToHashtag(user, "UnknownHashtag")).isFalse();
    }
  }

  @Nested
  class HasUserWatchedVideoTest {
    @Test
    public void handlesUserViewingVideo() {
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
