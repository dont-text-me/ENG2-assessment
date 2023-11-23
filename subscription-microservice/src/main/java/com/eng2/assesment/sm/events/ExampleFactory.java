package com.eng2.assesment.sm.events;

import io.micronaut.configuration.kafka.streams.ConfiguredStreamBuilder;
import io.micronaut.context.annotation.Factory;
import jakarta.inject.Named;
import jakarta.inject.Singleton;
import org.apache.kafka.streams.kstream.KStream;

@Factory
public class ExampleFactory {

  @Singleton
  @Named("example")
  KStream<String, String> exampleStream(ConfiguredStreamBuilder builder) {
    return builder.stream("streams-plaintext-input");
  }
}
