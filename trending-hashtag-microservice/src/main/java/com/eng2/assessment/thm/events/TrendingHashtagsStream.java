package com.eng2.assessment.thm.events;

import static com.eng2.assessment.vm.events.Topics.TOPIC_VIDEO_LIKED;

import com.eng2.assessment.thm.events.dto.WindowedHashtagWIthLikeCount;
import com.eng2.assessment.vm.dto.VideoInteractionDetailsDTO;
import io.micronaut.configuration.kafka.serde.CompositeSerdeRegistry;
import io.micronaut.configuration.kafka.streams.ConfiguredStreamBuilder;
import io.micronaut.context.annotation.Factory;
import io.micronaut.context.annotation.Value;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import java.time.Duration;
import java.util.Properties;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KeyValue;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.*;

@Factory
public class TrendingHashtagsStream {
  @Inject private CompositeSerdeRegistry serdeRegistry;

  @Value(value = "${trending-hashtags.window-size: `1h`}")
  private Duration windowSize;

  public static final String TOPIC_HASHTAG_SUMMARY = "trending-hashtags";

  /**
   * A kafka stream that listens to messages about liked videos from VM and reposts per-hashtag
   * statistics.
   *
   * <p>The stream breaks incoming messages down in a way that one liked hashtag is associated with
   * one record, i.e. if a video with 5 hashtags is liked, 5 internal messages are produced for each
   * of the hashtags. Then, the likes for each hashtag are summed over a time window and passed
   * forward once the window closes. Further processing is done in {@link
   * TrendingHashtagSummaryConsumer}, which stores a {@link
   * com.eng2.assessment.thm.domain.TrendingHashtag} for each summarized message i.e. for each
   * hashtag's like count over the time window.
   */
  @Singleton
  KStream<String, WindowedHashtagWIthLikeCount> hashtagSummary(ConfiguredStreamBuilder builder) {
    Properties props = builder.getConfiguration();
    props.put(StreamsConfig.APPLICATION_ID_CONFIG, "trending-hashtags-stream");
    props.put(StreamsConfig.PROCESSING_GUARANTEE_CONFIG, StreamsConfig.EXACTLY_ONCE_V2);
    Serde<VideoInteractionDetailsDTO> valueSerde =
        serdeRegistry.getSerde(VideoInteractionDetailsDTO.class);

    KStream<String, WindowedHashtagWIthLikeCount> stream =
        builder.stream(TOPIC_VIDEO_LIKED, Consumed.with(Serdes.UUID(), valueSerde))
            .flatMapValues(VideoInteractionDetailsDTO::hashtagNames)
            .selectKey((k, v) -> v)
            .groupByKey(Grouped.with(Serdes.String(), Serdes.String()))
            .windowedBy(SlidingWindows.ofTimeDifferenceWithNoGrace(windowSize))
            .count()
            .suppress(Suppressed.untilWindowCloses(Suppressed.BufferConfig.unbounded()))
            .toStream()
            .map(
                (key, value) ->
                    new KeyValue<>(
                        key.key(),
                        new WindowedHashtagWIthLikeCount(
                            key.key(), value, key.window().start(), key.window().end())));

    stream.to(
        TOPIC_HASHTAG_SUMMARY,
        Produced.with(Serdes.String(), serdeRegistry.getSerde(WindowedHashtagWIthLikeCount.class)));

    return stream;
  }
}
