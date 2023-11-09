package com.eng2.assessment.vm.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.*;
import java.time.Instant;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Entity
@Serdeable
/**
 * Video entity. Videos keep track of users that have viewed them. Even though a user can view a
 * video multiple times (updating the view count), they can only be entered as a viewer once.
 */
public class Video {
  @Id @GeneratedValue private UUID id;

  @Column(nullable = false)
  private String title;

  @Column private Integer likeCount = 0;

  @Column private Integer dislikeCount = 0;

  @Column private Integer viewCount = 0;

  @Column private Instant publishedAt;

  @ManyToOne private User author;

  @JsonIgnore
  @ManyToMany(mappedBy = "viewedVideos")
  private Set<User> viewers;

  @ManyToMany private Set<Hashtag> hashtags;

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Integer getLikeCount() {
    return likeCount;
  }

  public void incrementLikeCount() {
    likeCount++;
  }

  public void decrementLikeCount() {
    likeCount--;
  }

  public void setLikeCount(Integer likeCount) {
    this.likeCount = likeCount;
  }

  public Integer getDislikeCount() {
    return dislikeCount;
  }

  public void setDislikeCount(Integer dislikeCount) {
    this.dislikeCount = dislikeCount;
  }

  public Integer getViewCount() {
    return viewCount;
  }

  public void incrementViewCount() {
    viewCount++;
  }

  public void setViewCount(Integer viewCount) {
    this.viewCount = viewCount;
  }

  public Instant getPublishedAt() {
    return publishedAt;
  }

  public void setPublishedAt(Instant publishedAt) {
    this.publishedAt = publishedAt;
  }

  public User getAuthor() {
    return author;
  }

  public void setAuthor(User author) {
    this.author = author;
  }

  public Set<User> getViewers() {
    return viewers;
  }

  public void setViewers(Set<User> viewers) {
    this.viewers = viewers;
  }

  public Set<Hashtag> getHashtags() {
    return hashtags;
  }

  public void setHashtags(Set<Hashtag> hashtags) {
    this.hashtags = hashtags;
  }

  public List<String> getHashtagIds() {
    return hashtags.stream().map(Hashtag::getId).toList();
  }
}
