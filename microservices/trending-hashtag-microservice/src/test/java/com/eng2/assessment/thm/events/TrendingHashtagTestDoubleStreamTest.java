package com.eng2.assessment.thm.events;

import static org.assertj.core.api.Assertions.assertThat;
import static shared.Topics.TOPIC_TRENDING_HASHTAGS;
import static shared.Topics.TOPIC_VIDEO_LIKED;

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
import thm.dto.WindowedHashtagWithLikeCount;
import vm.dto.VideoInteractionDetailsDTO;

@MicronautTest(environments = "no-streams")
public class TrendingHashtagTestDoubleStreamTest {

  @Inject private CompositeSerdeRegistry serdeRegistry;
  @Inject private TrendingHashtagsStream stream;

  @Test
  public void smokeTest() {
    final ConfiguredStreamBuilder builder = new ConfiguredStreamBuilder(new Properties());

    stream.streamVideoLikedMessages(builder);

    try (TopologyTestDriver testDriver = new TopologyTestDriver(builder.build())) {
      TestInputTopic<UUID, VideoInteractionDetailsDTO> inputTopic =
          testDriver.createInputTopic(
              TOPIC_VIDEO_LIKED,
              new UUIDSerializer(),
              serdeRegistry.getSerializer(VideoInteractionDetailsDTO.class));
      TestOutputTopic<String, WindowedHashtagWithLikeCount> outputTopic =
          testDriver.createOutputTopic(
              TOPIC_TRENDING_HASHTAGS,
              new StringDeserializer(),
              serdeRegistry.getDeserializer(WindowedHashtagWithLikeCount.class));

      inputTopic.pipeInput(
          UUID.randomUUID(),
          new VideoInteractionDetailsDTO("Animal planet", List.of("Zoo"), "Me at the zoo"));

      assertThat(outputTopic.readKeyValuesToList()).isNotEmpty();
    }
  }

  @Test
  public void canHandleVideosWithManyHashtags() {
    List<String> expectedHashtags = List.of("Zoo", "Giraffe", "Funny");
    final ConfiguredStreamBuilder builder = new ConfiguredStreamBuilder(new Properties());

    stream.streamVideoLikedMessages(builder);

    try (TopologyTestDriver testDriver = new TopologyTestDriver(builder.build())) {
      TestInputTopic<UUID, VideoInteractionDetailsDTO> inputTopic =
          testDriver.createInputTopic(
              TOPIC_VIDEO_LIKED,
              new UUIDSerializer(),
              serdeRegistry.getSerializer(VideoInteractionDetailsDTO.class));
      TestOutputTopic<String, WindowedHashtagWithLikeCount> outputTopic =
          testDriver.createOutputTopic(
              TOPIC_TRENDING_HASHTAGS,
              new StringDeserializer(),
              serdeRegistry.getDeserializer(WindowedHashtagWithLikeCount.class));

      inputTopic.pipeInput(
          UUID.randomUUID(),
          new VideoInteractionDetailsDTO("Animal planet", expectedHashtags, "Me at the zoo"));

      assertThat(outputTopic.readKeyValuesToList().stream().map(it -> it.value.hashtagName()))
          .hasSameElementsAs(expectedHashtags);
    }
  }

  @Test
  public void updatesLikesForHashtags() {
    List<String> animalHashtags = List.of("Zoo", "Giraffe", "Funny");
    List<String> vlogHashtags = List.of("Travel", "Cool", "Funny");
    final ConfiguredStreamBuilder builder = new ConfiguredStreamBuilder(new Properties());

    stream.streamVideoLikedMessages(builder);

    try (TopologyTestDriver testDriver = new TopologyTestDriver(builder.build())) {
      TestInputTopic<UUID, VideoInteractionDetailsDTO> inputTopic =
          testDriver.createInputTopic(
              TOPIC_VIDEO_LIKED,
              new UUIDSerializer(),
              serdeRegistry.getSerializer(VideoInteractionDetailsDTO.class));
      TestOutputTopic<String, WindowedHashtagWithLikeCount> outputTopic =
          testDriver.createOutputTopic(
              TOPIC_TRENDING_HASHTAGS,
              new StringDeserializer(),
              serdeRegistry.getDeserializer(WindowedHashtagWithLikeCount.class));

      inputTopic.pipeInput(
          UUID.randomUUID(),
          new VideoInteractionDetailsDTO("AnimalPlanet", animalHashtags, "Me at the zoo"));
      assertThat(outputTopic.readKeyValuesToList()).hasSize(3);
      inputTopic.pipeInput(
          UUID.randomUUID(),
          new VideoInteractionDetailsDTO("TravelVlogs", vlogHashtags, "A day in italy"));
      assertThat(outputTopic.readKeyValuesToMap().get("Funny").likeCount()).isEqualTo(2);
    }
  }
}
