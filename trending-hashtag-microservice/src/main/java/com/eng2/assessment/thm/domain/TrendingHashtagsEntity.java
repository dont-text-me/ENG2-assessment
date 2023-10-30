package com.eng2.assessment.thm.domain;

import io.micronaut.serde.annotation.Serdeable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.util.UUID;

@Entity
@Serdeable
// TODO (big) think of a way to store this information.
// Current working idea: Time period (instant start, instant stop),
// Hashtag + like count M2M time period
public class TrendingHashtagsEntity {
  @Id @GeneratedValue UUID id;
}
