package com.eng2.assessment.thm.events;

import static com.eng2.assessment.thm.events.TrendingHashtagsStream.TOPIC_HASHTAG_SUMMARY;
import static com.eng2.assessment.vm.events.Topics.TOPIC_VIDEO_LIKED;
import static org.assertj.core.api.Assertions.assertThat;

import com.eng2.assessment.thm.events.dto.WindowedHashtagWIthLikeCount;
import com.eng2.assessment.vm.dto.VideoInteractionDetailsDTO;
import io.micronaut.configuration.kafka.serde.CompositeSerdeRegistry;
import io.micronaut.configuration.kafka.streams.ConfiguredStreamBuilder;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import java.util.List;
import java.util.Properties;
import java.util.UUID;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.UUIDSerializer;
import org.apache.kafka.streams.TestInputTopic;
import org.apache.kafka.streams.TestOutputTopic;
import org.apache.kafka.streams.TopologyTestDriver;
import org.junit.jupiter.api.Test;

@MicronautTest(environments = "no-streams")
public class TrendingHashtagTestDoubleStreamTest {

  @Inject private CompositeSerdeRegistry serdeRegistry;
  @Inject private TrendingHashtagsStream stream;

  @Test
  public void smokeTest() {
    final ConfiguredStreamBuilder builder = new ConfiguredStreamBuilder(new Properties());

    stream.hashtagSummary(builder);

    try (TopologyTestDriver testDriver = new TopologyTestDriver(builder.build())) {
      TestInputTopic<UUID, VideoInteractionDetailsDTO> inputTopic =
          testDriver.createInputTopic(
              TOPIC_VIDEO_LIKED,
              new UUIDSerializer(),
              serdeRegistry.getSerializer(VideoInteractionDetailsDTO.class));
      TestOutputTopic<String, WindowedHashtagWIthLikeCount> outputTopic =
          testDriver.createOutputTopic(
              TOPIC_HASHTAG_SUMMARY,
              new StringDeserializer(),
              serdeRegistry.getDeserializer(WindowedHashtagWIthLikeCount.class));

      inputTopic.pipeInput(
          UUID.randomUUID(), new VideoInteractionDetailsDTO("Animal planet", List.of("Zoo")));

      assertThat(outputTopic.readKeyValuesToList()).isNotEmpty();
    }
  }

  @Test
  public void canHandleVideosWithManyHashtags() {
    List<String> expectedHashtags = List.of("Zoo", "Giraffe", "Funny");
    final ConfiguredStreamBuilder builder = new ConfiguredStreamBuilder(new Properties());

    stream.hashtagSummary(builder);

    try (TopologyTestDriver testDriver = new TopologyTestDriver(builder.build())) {
      TestInputTopic<UUID, VideoInteractionDetailsDTO> inputTopic =
          testDriver.createInputTopic(
              TOPIC_VIDEO_LIKED,
              new UUIDSerializer(),
              serdeRegistry.getSerializer(VideoInteractionDetailsDTO.class));
      TestOutputTopic<String, WindowedHashtagWIthLikeCount> outputTopic =
          testDriver.createOutputTopic(
              TOPIC_HASHTAG_SUMMARY,
              new StringDeserializer(),
              serdeRegistry.getDeserializer(WindowedHashtagWIthLikeCount.class));

      inputTopic.pipeInput(
          UUID.randomUUID(), new VideoInteractionDetailsDTO("Animal planet", expectedHashtags));

      assertThat(outputTopic.readKeyValuesToList().stream().map(it -> it.value.hashtagName()))
          .hasSameElementsAs(expectedHashtags);
    }
  }

  @Test
  public void updatesLikesForHashtags() {
    List<String> animalHashtags = List.of("Zoo", "Giraffe", "Funny");
    List<String> vlogHashtags = List.of("Travel", "Cool", "Funny");
    final ConfiguredStreamBuilder builder = new ConfiguredStreamBuilder(new Properties());

    stream.hashtagSummary(builder);

    try (TopologyTestDriver testDriver = new TopologyTestDriver(builder.build())) {
      TestInputTopic<UUID, VideoInteractionDetailsDTO> inputTopic =
          testDriver.createInputTopic(
              TOPIC_VIDEO_LIKED,
              new UUIDSerializer(),
              serdeRegistry.getSerializer(VideoInteractionDetailsDTO.class));
      TestOutputTopic<String, WindowedHashtagWIthLikeCount> outputTopic =
          testDriver.createOutputTopic(
              TOPIC_HASHTAG_SUMMARY,
              new StringDeserializer(),
              serdeRegistry.getDeserializer(WindowedHashtagWIthLikeCount.class));

      inputTopic.pipeInput(
          UUID.randomUUID(), new VideoInteractionDetailsDTO("AnimalPlanet", animalHashtags));
      assertThat(outputTopic.readKeyValuesToList()).hasSize(3);
      inputTopic.pipeInput(
          UUID.randomUUID(), new VideoInteractionDetailsDTO("TravelVlogs", vlogHashtags));
      assertThat(outputTopic.readKeyValuesToMap().get("Funny").likeCount()).isEqualTo(2);
    }
  }
}
