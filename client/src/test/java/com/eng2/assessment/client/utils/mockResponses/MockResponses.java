package com.eng2.assessment.client.utils.mockResponses;

import com.eng2.assessment.sm.dto.VideoRecommendationDTO;
import com.eng2.assessment.thm.domain.TrendingHashtag;
import com.eng2.assessment.vm.domain.Hashtag;
import com.eng2.assessment.vm.domain.User;
import com.eng2.assessment.vm.domain.Video;
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

    ArrayList<Video> videos = new ArrayList<>();
    Arrays.stream(args)
        .forEach(
            it -> {
              User u = new User();
              u.setUsername(it.authorUsername());
              u.setId(r.nextLong());

              Set<Hashtag> hashtags =
                  it.hashtagIds().stream()
                      .map(
                          hName -> {
                            Hashtag h = new Hashtag();
                            h.setId(hName);
                            return h;
                          })
                      .collect(Collectors.toSet());

              Video v = new Video();
              v.setId(r.nextLong());
              v.setTitle(it.title());
              v.setLikeCount(it.likeCount());
              v.setDislikeCount(it.dislikeCount());
              v.setAuthor(u);
              v.setHashtags(hashtags);
              v.setPublishedAt(Instant.now().minus(Duration.ofMinutes(r.nextLong(60))));

              videos.add(v);
            });
    return gson.toJson(videos, new TypeToken<List<Video>>() {}.getType());
  }

  public static String getUserList(String... userNames) {
    Random r = new Random();
    Gson gson = new GsonBuilder().create();
    List<User> users =
        Arrays.stream(userNames)
            .map(
                it -> {
                  User u = new User();
                  u.setId(r.nextLong());
                  u.setUsername(it);
                  return u;
                })
            .toList();
    return gson.toJson(users, new TypeToken<List<User>>() {}.getType());
  }

  public static String getTrendingHashtagsList(MinifiedTrendingHashtagDetails... hashtags) {
    Gson gson = new GsonBuilder().create();
    List<TrendingHashtag> trendingHashtags =
        Arrays.stream(hashtags)
            .map(
                it -> {
                  TrendingHashtag t = new TrendingHashtag();
                  t.setHashtagName(it.hashtagName());
                  t.setLikeCount(it.likeCount());
                  t.setWindowStart(Instant.now().minus(Duration.ofMinutes(60)).toEpochMilli());
                  t.setWindowEnd(Instant.now().toEpochMilli());
                  return t;
                })
            .toList();
    return gson.toJson(trendingHashtags, new TypeToken<List<TrendingHashtag>>() {}.getType());
  }

  public static String getRecommendationsList(
      @Nullable String error, MinifiedVideoRecommendationDetails... details) {
    Random r = new Random();
    Gson gson = new GsonBuilder().create();
    List<com.eng2.assessment.sm.domain.Video> recs =
        Arrays.stream(details)
            .map(
                it -> {
                  com.eng2.assessment.sm.domain.Video v = new com.eng2.assessment.sm.domain.Video();
                  v.setId(r.nextLong());
                  v.setTitle(it.title());
                  v.setViewCount(Long.valueOf(it.viewCount()));

                  Set<com.eng2.assessment.sm.domain.Hashtag> hashtags =
                      it.hashtagIds().stream()
                          .map(
                              name -> {
                                com.eng2.assessment.sm.domain.Hashtag h =
                                    new com.eng2.assessment.sm.domain.Hashtag();
                                h.setName(name);
                                return h;
                              })
                          .collect(Collectors.toSet());

                  v.setHashtags(hashtags);
                  return v;
                })
            .toList();

    VideoRecommendationDTO result = new VideoRecommendationDTO(recs, error);

    return gson.toJson(result, new TypeToken<VideoRecommendationDTO>() {}.getType());
  }
}
