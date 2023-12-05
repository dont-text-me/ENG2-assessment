package com.eng2.assessment.client.utils.mockResponses;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import jakarta.annotation.Nullable;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.*;
import java.util.stream.Collectors;
import sm.dto.VideoDTO;
import sm.dto.VideoRecommendationDTO;
import thm.dto.TrendingHashtagResponseDTO;
import thm.dto.WindowedHashtagWithLikeCount;
import vm.dto.VideoResponseDTO;
import vm.dto.VideoResultsDTO;

public class MockResponses {

  public static String getVideoList(MinifiedVideoDetails... args) {
    Random r = new Random();
    Gson gson =
        new GsonBuilder()
            .registerTypeAdapter(
                Instant.class,
                new TypeAdapter<Instant>() {
                  @Override
                  public void write(JsonWriter out, Instant value) throws IOException {
                    out.value(value.toString());
                  }

                  @Override
                  public Instant read(JsonReader in) throws IOException {
                    return Instant.ofEpochMilli(in.nextLong());
                  }
                })
            .create();

    VideoResultsDTO videos = new VideoResultsDTO(
            Arrays.stream(args).map(
                    it -> new VideoResponseDTO(
                            it.title(),
                            UUID.randomUUID(),
                            Instant.now().minus(Duration.ofMinutes(r.nextLong(60))),
                            it.authorUsername(),
                            it.likeCount(),
                            it.dislikeCount(),
                            it.hashtagIds(),
                            r.nextInt(1000)
                    )
            ).toList()
    );
    return gson.toJson(videos, new TypeToken<VideoResultsDTO>() {}.getType());
  }

  public static String getTrendingHashtagsList(MinifiedTrendingHashtagDetails... hashtags) {
    Gson gson = new GsonBuilder().create();
    TrendingHashtagResponseDTO trendingHashtags =
        new TrendingHashtagResponseDTO(
            Arrays.stream(hashtags)
                .map(
                    it ->
                        new WindowedHashtagWithLikeCount(
                            it.hashtagName(),
                            it.likeCount(),
                            Instant.now().minus(Duration.ofMinutes(60)).toEpochMilli(),
                            Instant.now().toEpochMilli()))
                .toList());
    return gson.toJson(trendingHashtags, new TypeToken<TrendingHashtagResponseDTO>() {}.getType());
  }

  public static String getRecommendationsList(
      @Nullable String error, MinifiedVideoRecommendationDetails... details) {
    Gson gson = new GsonBuilder().create();
    List<VideoDTO> recs =
        Arrays.stream(details)
            .map(
                it ->
                    new VideoDTO(
                        UUID.randomUUID(), it.title(), (long) it.viewCount(), it.hashtagIds()))
            .toList();

    VideoRecommendationDTO result = new VideoRecommendationDTO(error, recs);

    return gson.toJson(result, new TypeToken<VideoRecommendationDTO>() {}.getType());
  }
}
