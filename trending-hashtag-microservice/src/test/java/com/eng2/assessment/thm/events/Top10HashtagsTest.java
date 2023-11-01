package com.eng2.assessment.thm.events;

import static org.assertj.core.api.Assertions.assertThat;

import com.eng2.assessment.thm.events.dto.HashtagWIthLikeCount;
import com.eng2.assessment.thm.events.dto.Top10Hashtags;
import java.util.stream.IntStream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Top10HashtagsTest {
  private Top10Hashtags sut;

  @BeforeEach
  public void setUp() {
    sut = new Top10Hashtags();
  }

  @Test
  public void canAddEntry() {
    HashtagWIthLikeCount entry = new HashtagWIthLikeCount("Zoo", 1L);
    sut.addToLeaderboard(entry);

    assertThat(sut.getLeaderboard()).hasSize(1);
  }

  @Test
  public void maintainsOrder() {
    HashtagWIthLikeCount entry1 = new HashtagWIthLikeCount("Zoo", 2L);
    HashtagWIthLikeCount entry2 = new HashtagWIthLikeCount("Gym", 10L);
    HashtagWIthLikeCount entry3 = new HashtagWIthLikeCount("Newyears", 5L);

    sut.addToLeaderboard(entry1);
    sut.addToLeaderboard(entry2);
    sut.addToLeaderboard(entry3);

    assertThat(sut.getLeaderboard().stream().map(HashtagWIthLikeCount::hashtagName).toList())
        .hasSize(3)
        .containsExactly("Gym", "Newyears", "Zoo");
  }

  @Test
  public void handlesRepeatedId() {
    HashtagWIthLikeCount entry1 = new HashtagWIthLikeCount("Zoo", 2L);
    HashtagWIthLikeCount entry2 = new HashtagWIthLikeCount("Gym", 10L);
    HashtagWIthLikeCount entry3 = new HashtagWIthLikeCount("Newyears", 5L);
    HashtagWIthLikeCount entry4 = new HashtagWIthLikeCount("Zoo", 11L);

    sut.addToLeaderboard(entry1);
    sut.addToLeaderboard(entry2);
    sut.addToLeaderboard(entry3);
    sut.addToLeaderboard(entry4);

    assertThat(sut.getLeaderboard().stream().map(HashtagWIthLikeCount::hashtagName).toList())
        .hasSize(3)
        .containsExactly("Zoo", "Gym", "Newyears");
  }

  @Test
  public void storesTop10() {
    IntStream.range(0, 20)
        .forEach(
            it -> {
              HashtagWIthLikeCount entry = new HashtagWIthLikeCount(String.valueOf(it), (long) it);
              sut.addToLeaderboard(entry);
            });

    assertThat(sut.getLeaderboard()).hasSize(10);
  }
}
