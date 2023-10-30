package com.eng2.assessment.thm.events;

import static com.eng2.assessment.thm.events.Topics.TOPIC_HASHTAG_SUMMARY;
import static com.eng2.assessment.vm.events.Topics.TOPIC_VIDEO_LIKED;

import com.eng2.assessment.vm.dto.VideoInteractionDetailsDTO;
import io.micronaut.configuration.kafka.serde.CompositeSerdeRegistry;
import io.micronaut.configuration.kafka.streams.ConfiguredStreamBuilder;
import io.micronaut.context.annotation.Factory;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import java.time.Duration;
import java.util.Properties;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.*;

@Factory
public class TrendingHashtagsStream {
  @Inject private CompositeSerdeRegistry serdeRegistry;

  @Singleton
  KStream<Windowed<String>, Long> hashtagSummary(ConfiguredStreamBuilder builder) {
    Properties props = builder.getConfiguration();
    props.put(StreamsConfig.APPLICATION_ID_CONFIG, "trending-hashtags-stream");
    props.put(StreamsConfig.PROCESSING_GUARANTEE_CONFIG, StreamsConfig.EXACTLY_ONCE_V2);
    Serde<VideoInteractionDetailsDTO> valueSerde =
        serdeRegistry.getSerde(VideoInteractionDetailsDTO.class);

    KStream<Windowed<String>, Long> stream =
        builder.stream(TOPIC_VIDEO_LIKED, Consumed.with(Serdes.UUID(), valueSerde))
            .flatMapValues(VideoInteractionDetailsDTO::hashtagNames)
            .selectKey((k, v) -> v)
            .groupByKey()
            .windowedBy(
                TimeWindows.ofSizeAndGrace(Duration.ofHours(1), Duration.ofMinutes(5))
                    .advanceBy(Duration.ofMinutes(10)))
            .count()
            .suppress(Suppressed.untilWindowCloses(Suppressed.BufferConfig.unbounded()))
            .toStream();

    stream.to(
        TOPIC_HASHTAG_SUMMARY,
        Produced.with(
            new Serdes.WrapperSerde<>(
                new TimeWindowedSerializer<>(), new TimeWindowedDeserializer<>()),
            Serdes.Long()));

    return stream;
  }
}
