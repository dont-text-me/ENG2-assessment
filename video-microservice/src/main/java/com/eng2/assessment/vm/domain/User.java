package com.eng2.assessment.vm.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity
@Serdeable
public class User {
  @Id @GeneratedValue private UUID id;

  @Column(nullable = false, unique = true)
  private String username;

  @JsonIgnore
  @OneToMany(mappedBy = "author")
  private Set<Video> publishedVideos;

  @JsonIgnore
  @ManyToMany(mappedBy = "viewers")
  private Set<Video> viewedVideos;

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public Set<Video> getPublishedVideos() {
    return publishedVideos;
  }

  public void setPublishedVideos(Set<Video> publishedVideos) {
    this.publishedVideos = publishedVideos;
  }

  public Set<Video> getViewedVideos() {
    return viewedVideos;
  }

  public void setViewedVideos(Set<Video> viewedVideos) {
    this.viewedVideos = viewedVideos;
  }
}
