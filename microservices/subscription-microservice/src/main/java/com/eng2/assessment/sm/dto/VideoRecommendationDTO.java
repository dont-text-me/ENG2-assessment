package com.eng2.assessment.sm.dto;

import com.eng2.assessment.sm.domain.Video;
import io.micronaut.serde.annotation.Serdeable;
import jakarta.annotation.Nullable;
import java.util.List;

@Serdeable
public record VideoRecommendationDTO(List<Video> result, @Nullable String errorMessage) {}
