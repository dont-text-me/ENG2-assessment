package com.eng2.assessment.sm.controllers;

import com.eng2.assessment.sm.utils.DbCleanupExtension;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.extension.ExtendWith;

@MicronautTest(transactional = false)
@ExtendWith(DbCleanupExtension.class)
public class RecommendationsControllerTest {}
