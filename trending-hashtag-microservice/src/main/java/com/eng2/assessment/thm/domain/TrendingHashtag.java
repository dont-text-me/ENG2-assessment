package com.eng2.assessment.thm.domain;

import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.Instant;
import java.time.ZoneOffset;
import java.util.UUID;

@Entity
@Serdeable
public class TrendingHashtag {
  @Id @GeneratedValue UUID id;

  @Column(nullable = false)
  private String hashtagName;

  @Column(nullable = false)
  private Long likeCount;

  @Column(nullable = false)
  private Long windowStart;

  @Column(nullable = false)
  private Long windowEnd;

  @Override
  public String toString() {
    return "TrendingHashtagsEntity{"
        + "id="
        + id
        + ", hashtagName='"
        + hashtagName
        + '\''
        + ", likeCount="
        + likeCount
        + ", windowStart="
        + windowStart
        + ", windowEnd="
        + windowEnd
        + '}';
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getHashtagName() {
    return hashtagName;
  }

  public void setHashtagName(String hashtagName) {
    this.hashtagName = hashtagName;
  }

  public Long getLikeCount() {
    return likeCount;
  }

  public void setLikeCount(Long likeCount) {
    this.likeCount = likeCount;
  }

  public Long getWindowStart() {
    return windowStart;
  }

  public void setWindowStart(Long windowStart) {
    this.windowStart = windowStart;
  }

  public Long getWindowEnd() {
    return windowEnd;
  }

  public void setWindowEnd(Long windowEnd) {
    this.windowEnd = windowEnd;
  }
}
