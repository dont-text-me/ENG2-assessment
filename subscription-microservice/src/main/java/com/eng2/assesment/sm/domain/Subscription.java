package com.eng2.assesment.sm.domain;

import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.util.UUID;

@Entity
@Serdeable
public class Subscription {
  @Id @GeneratedValue private UUID id;

  private UUID userId;
  private String hashtagId;

  public UUID getId() {
    return id;
  }

  public Subscription setId(UUID id) {
    this.id = id;
    return this;
  }

  public UUID getUserId() {
    return userId;
  }

  public Subscription setUserId(UUID userId) {
    this.userId = userId;
    return this;
  }

  public String getHashtagId() {
    return hashtagId;
  }

  public Subscription setHashtagId(String hashtagId) {
    this.hashtagId = hashtagId;
    return this;
  }
}
