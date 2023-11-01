package com.eng2.assessment.thm.events.dto;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public record HashtagWIthLikeCount(String hashtagName, Long likeCount) {}
