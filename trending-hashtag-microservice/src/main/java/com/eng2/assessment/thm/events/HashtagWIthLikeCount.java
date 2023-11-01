package com.eng2.assessment.thm.events;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public record HashtagWIthLikeCount(String hashtagName, Long likeCount) {}
