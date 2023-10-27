package com.eng2.assessment.vm.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.*;
import java.sql.Timestamp;
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

  @Column private Timestamp publishedAt;

  @JsonIgnore @ManyToOne private User author;

  @JsonIgnore @ManyToMany private Set<User> viewers;

  @JsonIgnore @ManyToMany private Set<Hashtag> hashtags;

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

  public void setViewCount(Integer viewCount) {
    this.viewCount = viewCount;
  }

  public Timestamp getPublishedAt() {
    return publishedAt;
  }

  public void setPublishedAt(Timestamp publishedAt) {
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
}
