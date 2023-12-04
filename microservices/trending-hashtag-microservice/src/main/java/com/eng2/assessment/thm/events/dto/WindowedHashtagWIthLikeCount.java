package com.eng2.assessment.thm.events.dto;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public record WindowedHashtagWIthLikeCount(
    String hashtagName, Long likeCount, Long windowStart, Long windowEnd) {}
