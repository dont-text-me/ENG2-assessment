package com.eng2.assesment.sm.domain;

import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import java.util.Set;

@Entity
@Serdeable
public class Hashtag {
  @Id private String name;

  @ManyToMany private Set<User> subscribers;

  @ManyToMany private Set<Video> taggedVideos;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Set<User> getSubscribers() {
    return subscribers;
  }

  public void setSubscribers(Set<User> subscribers) {
    this.subscribers = subscribers;
  }

  public Set<Video> getTaggedVideos() {
    return taggedVideos;
  }

  public void setTaggedVideos(Set<Video> taggedVideos) {
    this.taggedVideos = taggedVideos;
  }
}
