package com.eng2.assessment.sm.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Entity
@Serdeable
public class Video {
  @Id private UUID id;

  @Column(nullable = false)
  private String title;

  @Column(nullable = false)
  private Long viewCount;

  @ManyToMany private Set<Hashtag> hashtags;

  @ManyToMany @JsonIgnore private Set<User> viewers;

  public Long getViewCount() {
    return viewCount;
  }

  public void incrementViewCount() {
    viewCount++;
  }

  public void setViewCount(Long viewCount) {
    this.viewCount = viewCount;
  }

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

  public void addViewer(User viewer) {
    this.viewers.add(viewer);
  }

  public List<String> hashtagNames() {
    return this.hashtags.stream().map(Hashtag::getName).toList();
  }

  public List<String> viewerUserNames() {
    return this.viewers.stream().map(User::getUserName).toList();
  }

  @Override
  public String toString() {
    return "Video{"
        + "id="
        + id
        + ", title='"
        + title
        + '\''
        + ", viewCount="
        + viewCount
        + ", hashtags="
        + hashtags
        + ", viewers="
        + viewers
        + '}';
  }
}
