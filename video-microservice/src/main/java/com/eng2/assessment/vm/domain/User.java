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
  @ManyToMany
  private Set<Video> viewedVideos;

  @JsonIgnore
  @ManyToMany
  @JoinTable(name = "user_video_likes")
  private Set<Video> likedVideos;

  @JsonIgnore
  @ManyToMany
  @JoinTable(name = "user_video_dislikes")
  private Set<Video> dislikedVideos;

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

  public Set<Video> getLikedVideos() {
    return likedVideos;
  }

  public User setLikedVideos(Set<Video> likedVideos) {
    this.likedVideos = likedVideos;
    return this;
  }

  public Set<Video> getDislikedVideos() {
    return dislikedVideos;
  }

  public User setDislikedVideos(Set<Video> dislikedVideos) {
    this.dislikedVideos = dislikedVideos;
    return this;
  }

  public boolean hasWatchedVideo(UUID videoId) {
    return viewedVideos.stream().anyMatch(it -> it.getId().equals(videoId));
  }

  public boolean hasLikedVideo(UUID videoId){
    return likedVideos.stream().anyMatch(it -> it.getId().equals(videoId));
  }

  public boolean hasDislikedVideo(UUID videoId){
    return dislikedVideos.stream().anyMatch(it -> it.getId().equals(videoId));
  }

  public void addViewedVideo(Video viewedVideo) {
    viewedVideos.add(viewedVideo);
  }
  public void addLikedVideo(Video viewedVideo) {
    likedVideos.add(viewedVideo);
  }
  public void addDislikedVideo(Video viewedVideo) {
    dislikedVideos.add(viewedVideo);
  }

  public void setViewedVideos(Set<Video> viewedVideos) {
    this.viewedVideos = viewedVideos;
  }
}
