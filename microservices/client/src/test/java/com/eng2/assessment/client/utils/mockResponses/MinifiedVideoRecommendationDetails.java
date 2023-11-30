package com.eng2.assessment.client.utils.mockResponses;

import java.util.List;

public record MinifiedVideoRecommendationDetails(
    String title, Integer viewCount, List<String> hashtagIds) {}
