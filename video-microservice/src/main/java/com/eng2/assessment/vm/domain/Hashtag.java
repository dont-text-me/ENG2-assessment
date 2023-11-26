package com.eng2.assessment.vm.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.*;
import java.util.Set;

/**
 * Hashtag entity. Hashtag names have to be unique to be able to correctly identify videos,
 * therefore its name is its identifier in the database.
 */
@Entity
@Serdeable
public class Hashtag {
  @Id private String id;

  @JsonIgnore
  @ManyToMany(mappedBy = "hashtags")
  private Set<Video> taggedVideos;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Set<Video> getTaggedVideos() {
    return taggedVideos;
  }

  public void setTaggedVideos(Set<Video> taggedVideos) {
    this.taggedVideos = taggedVideos;
  }

  @Override
  public String toString() {
    return "Hashtag{" + "id='" + id + '\'' + '}';
  }
}
