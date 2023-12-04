package com.eng2.assessment.vm.dto;

import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public record UserDTO(String username) {}
