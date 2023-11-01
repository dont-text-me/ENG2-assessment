package com.eng2.assessment.thm.events.dto;

import io.micronaut.serde.annotation.Serdeable;
import java.util.*;

@Serdeable
public class Top10Hashtags {

  private final UUID id = UUID.randomUUID();
  private final TreeSet<HashtagWIthLikeCount> leaderboard =
      new TreeSet<>(
          Comparator.comparing(HashtagWIthLikeCount::likeCount)
              .reversed()
              .thenComparing(
                  HashtagWIthLikeCount
                      ::hashtagName)); // Sort by likes in descending order. If likes are identical,

  // sort alphabetically by ID

  public Top10Hashtags() {
    System.out.println("Creating new leaderboard");
  }

  public void addToLeaderboard(HashtagWIthLikeCount entry) {
    if (leaderboard.stream().anyMatch(it -> it.hashtagName().equals(entry.hashtagName()))) {
      leaderboard.removeIf(it -> it.hashtagName().equals(entry.hashtagName()));
      leaderboard.add(entry); // update count if receiving multiple messages for the same hashtag
    } else {
      leaderboard.add(entry);
    }

    if (leaderboard.size() > 10) {
      leaderboard
          .pollLast(); // we sort in descending order, so this will remove the hashtag with the
      // lowest like count
    }
  }

  public TreeSet<HashtagWIthLikeCount> getLeaderboard() {
    return leaderboard;
  }

  @Override
  public String toString() {
    return "Top10Hashtags{" + "id=" + id + ", leaderboard=" + leaderboard + '}';
  }
}
