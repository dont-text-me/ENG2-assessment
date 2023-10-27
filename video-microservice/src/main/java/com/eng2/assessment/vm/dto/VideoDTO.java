package com.eng2.assessment.vm.dto;

import io.micronaut.serde.annotation.Serdeable;
import java.util.List;

@Serdeable
public record VideoDTO(String title, String authorUsername, List<String> hashtagNames) {}
