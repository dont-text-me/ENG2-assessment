package com.eng2.assessment.vm.entities;

import static java.lang.Integer.valueOf;
import static org.assertj.core.api.Assertions.assertThat;

import com.eng2.assessment.vm.domain.Hashtag;
import com.eng2.assessment.vm.domain.Video;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;

public class VideoEntityTest {
  @Test
  public void returnsNamesOfHashtagsUnderVideo() {
    Set<Hashtag> hashtags =
        IntStream.range(0, 10)
            .mapToObj(
                it -> {
                  Hashtag h = new Hashtag();
                  h.setId(valueOf(it).toString());
                  return h;
                })
            .collect(Collectors.toSet());

    Video video = new Video();
    video.setHashtags(hashtags);

    assertThat(video.getHashtagIds())
        .containsExactlyInAnyOrderElementsOf(
            IntStream.range(0, 10).mapToObj(it -> valueOf(it).toString()).toList());
  }
}
