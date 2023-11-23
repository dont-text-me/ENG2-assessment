package com.eng2.assesment.sm.domain;

import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import java.util.Set;

@Entity
@Serdeable
public class User {
  @Id private String userName;

  @ManyToMany(mappedBy = "subscribers")
  private Set<Hashtag> subscriptions;

  @ManyToMany(mappedBy = "viewers")
  private Set<Video> viewedVideos;
}
