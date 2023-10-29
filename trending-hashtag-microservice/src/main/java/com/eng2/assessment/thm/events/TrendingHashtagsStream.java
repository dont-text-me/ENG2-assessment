package com.eng2.assessment.thm.events;

import static com.eng2.assessment.vm.events.Topics.TOPIC_VIDEO_LIKED;

import com.eng2.assessment.vm.dto.VideoInteractionDetailsDTO;
import io.micronaut.configuration.kafka.serde.CompositeSerdeRegistry;
import io.micronaut.configuration.kafka.streams.ConfiguredStreamBuilder;
import io.micronaut.context.annotation.Factory;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import java.util.Properties;

import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.KStream;

@Factory
public class TrendingHashtagsStream {
  @Inject
  private CompositeSerdeRegistry serdeRegistry;
  @Singleton
  KStream<String, String> hashtagSummary(ConfiguredStreamBuilder builder) {
    Properties props = builder.getConfiguration();
    props.put(StreamsConfig.APPLICATION_ID_CONFIG, "trending-hashtags-stream");
    props.put(StreamsConfig.PROCESSING_GUARANTEE_CONFIG, StreamsConfig.EXACTLY_ONCE_V2);
    Serde<VideoInteractionDetailsDTO> valueSerde = serdeRegistry.getSerde(VideoInteractionDetailsDTO.class);

    return builder.stream(TOPIC_VIDEO_LIKED);
  }
}
