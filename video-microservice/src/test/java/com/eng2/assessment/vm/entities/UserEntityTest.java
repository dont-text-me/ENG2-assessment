package com.eng2.assessment.vm.entities;

import static com.eng2.assessment.vm.utils.Utils.getRandomLong;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import com.eng2.assessment.vm.domain.User;
import com.eng2.assessment.vm.domain.Video;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class UserEntityTest {
  @Test
  public void determinesWhetherUserHasWatchedVideo() {
    Long videoId1 = getRandomLong(), videoId2 = getRandomLong();

    Video video1 = new Video();
    video1.setId(videoId1);

    Video video2 = new Video();
    video2.setId(videoId2);

    User user = new User();
    user.setViewedVideos(Set.of(video1, video2));

    assertThat(user.hasWatchedVideo(videoId1)).isTrue();
    assertThat(user.hasWatchedVideo(videoId2)).isTrue();
    assertThat(user.hasWatchedVideo(getRandomLong())).isFalse();
  }
}
