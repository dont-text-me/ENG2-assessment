package com.eng2.assessment.client.commands.vm.utils.mockResponses;

import java.util.List;

public record MinifiedVideoDetails(
    String title,
    String authorUsername,
    Integer likeCount,
    Integer dislikeCount,
    List<String> hashtagIds) {}
