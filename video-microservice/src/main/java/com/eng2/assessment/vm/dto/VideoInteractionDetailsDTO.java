package com.eng2.assessment.vm.dto;

import io.micronaut.serde.annotation.Serdeable;
import java.util.List;

/**
 * Stores the details of a user interaction with a video.
 *
 * @param userName the username of a user making the interaction
 * @param hashtagNames the hashtags of the video being interacted with. Used by THM to report
 *     trending hashtags.
 * @param videoTitle the title of the video (Note: cannot be used as message key as titles are not
 *     required to be unique)
 */
@Serdeable
public record VideoInteractionDetailsDTO(
    String userName, List<String> hashtagNames, String videoTitle) {}
