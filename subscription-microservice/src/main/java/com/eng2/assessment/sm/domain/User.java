package com.eng2.assessment.sm.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import java.util.Set;

@Entity
@Serdeable
public class User {
  @Id private String userName;

  @ManyToMany private Set<Hashtag> subscriptions;

  @ManyToMany(mappedBy = "viewers")
  @JsonIgnore
  private Set<Video> viewedVideos;

  public boolean hasWatchedVideo(Long videoId) {
    return this.viewedVideos.stream().anyMatch(it -> it.getId().equals(videoId));
  }

  public String getUserName() {
    return userName;
  }

  public boolean isSubscribedTo(String hashtagName) {
    return this.subscriptions.stream().anyMatch(it -> it.getName().equals(hashtagName));
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public void addSubscription(Hashtag newHashtag) {
    this.subscriptions.add(newHashtag);
  }

  public void addViewedVideo(Video video) {
    this.viewedVideos.add(video);
  }

  public void removeSubscription(Hashtag hashtag) {
    this.subscriptions.removeIf(it -> it.getName().equals(hashtag.getName()));
  }

  public Set<Hashtag> getSubscriptions() {
    return subscriptions;
  }

  public void setSubscriptions(Set<Hashtag> subscriptions) {
    this.subscriptions = subscriptions;
  }

  public Set<Video> getViewedVideos() {
    return viewedVideos;
  }

  public void setViewedVideos(Set<Video> viewedVideos) {
    this.viewedVideos = viewedVideos;
  }

  @Override
  public String toString() {
    return "User{" + "userName='" + userName + '\'' + '}';
  }
}
