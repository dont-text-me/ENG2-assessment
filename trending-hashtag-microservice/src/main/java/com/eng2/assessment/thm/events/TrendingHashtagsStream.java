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
import org.apache.kafka.common.utils.Bytes;
import org.apache.kafka.streams.KeyValue;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.*;
import org.apache.kafka.streams.state.KeyValueStore;

@Factory
public class TrendingHashtagsStream {
  @Inject private CompositeSerdeRegistry serdeRegistry;

  public static String TOP_TEN_STORE_NAME = "top-ten-videos";

  @Singleton
  KStream<Long, Top10Hashtags> hashtagSummary(ConfiguredStreamBuilder builder) {
    Properties props = builder.getConfiguration();
    props.put(StreamsConfig.APPLICATION_ID_CONFIG, "trending-hashtags-stream");
    props.put(StreamsConfig.PROCESSING_GUARANTEE_CONFIG, StreamsConfig.EXACTLY_ONCE_V2);
    Serde<VideoInteractionDetailsDTO> valueSerde =
        serdeRegistry.getSerde(VideoInteractionDetailsDTO.class);

    KStream<Windowed<String>, Long> windowedIndividualHashtagCount =
        builder.stream(TOPIC_VIDEO_LIKED, Consumed.with(Serdes.UUID(), valueSerde))
            .flatMapValues(VideoInteractionDetailsDTO::hashtagNames)
            .selectKey((k, v) -> v)
            .groupByKey(Grouped.with(Serdes.String(), Serdes.String()))
            .windowedBy(SlidingWindows.ofTimeDifferenceWithNoGrace(Duration.ofMinutes(2)))
            .count()
            .suppress(Suppressed.untilWindowCloses(Suppressed.BufferConfig.unbounded()))
            .toStream();

    KStream<Long, Top10Hashtags> windowStatistics =
        windowedIndividualHashtagCount
            .map((key, value) -> new KeyValue<>(key, new HashtagWIthLikeCount(key.key(), value)))
            .selectKey((key, value) -> key.window().start())
            .groupByKey(
                Grouped.with(Serdes.Long(), serdeRegistry.getSerde(HashtagWIthLikeCount.class)))
            .aggregate(
                Top10Hashtags::new,
                (key, value, agg) -> {
                  agg.addToLeaderboard(value);
                  System.out.println("Current leaderboard: " + agg);
                  return agg;
                },
                Materialized.<Long, Top10Hashtags, KeyValueStore<Bytes, byte[]>>as(
                        TOP_TEN_STORE_NAME)
                    .withKeySerde(Serdes.Long())
                    .withValueSerde(serdeRegistry.getSerde(Top10Hashtags.class)))
            .toStream();

    windowStatistics.print(Printed.toSysOut());

    windowStatistics.to(
        TOPIC_HASHTAG_SUMMARY,
        Produced.with(Serdes.Long(), serdeRegistry.getSerde(Top10Hashtags.class)));

    return windowStatistics;
  }
}
