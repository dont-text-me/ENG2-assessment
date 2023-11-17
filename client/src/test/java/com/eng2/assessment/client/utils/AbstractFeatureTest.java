package com.eng2.assessment.client.utils;

import static com.eng2.assessment.client.utils.TestContainerServicesInfo.VM_NAME;
import static com.eng2.assessment.client.utils.TestContainerServicesInfo.VM_PORT;

import java.io.File;
import java.time.Duration;
import org.testcontainers.containers.ComposeContainer;

/**
 * The base class for any feature test suites. Starts a single container running the Compose file in
 * the `resources` folder. This running container is shared between all test suites that inherit
 * this class. Approach taken from TestContainers docs (see section on Singleton containers)
 *
 * @link <a href =
 *     "https://java.testcontainers.org/test_framework_integration/manual_lifecycle_control/#singleton-containers">TestContainers
 *     Docs</a>
 */
public abstract class AbstractFeatureTest {
  static final ComposeContainer ENV;

  static {
    ENV =
        new ComposeContainer(new File("src/test/resources/compose-feature-tests.yml"))
            .withStartupTimeout(Duration.ofMinutes(10))
            .withExposedService(VM_NAME, VM_PORT)
            .withLocalCompose(true);
    ENV.start();
  }
}
