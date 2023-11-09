package com.eng2.assessment.client.commands.vm.utils.mockResponses;

import com.eng2.assessment.vm.domain.Hashtag;
import com.eng2.assessment.vm.domain.User;
import com.eng2.assessment.vm.domain.Video;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.*;
import java.util.stream.Collectors;

public class VideoListMockResponse {

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
              u.setId(UUID.randomUUID());

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
              v.setId(UUID.randomUUID());
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
}
