package com.eng2.assessment.client.clients.vm;

import com.eng2.assessment.vm.domain.Video;
import com.eng2.assessment.vm.dto.VideoDTO;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;
import io.micronaut.http.client.annotation.Client;
import jakarta.annotation.Nullable;
import java.util.UUID;

@Client("${client-urls.vm.videos:`http://localhost:8080/videos`}")
public interface VideosClient {
  @Get("/")
  Iterable<Video> list(@Nullable @QueryValue String author, @Nullable @QueryValue String hashtag);

  @Get("/{id}")
  Video getVideo(
      UUID id, @Nullable @QueryValue String author, @Nullable @QueryValue String hashtag);

  @Post("/")
  HttpResponse<String> publish(@Body VideoDTO videoDetails);

  @Put("/{id}/like")
  HttpResponse<String> likeVideo(UUID id, @Body String userName);

  @Put("/{id}/dislike")
  HttpResponse<String> dislikeVideo(UUID id, @Body String userName);

  @Put("/{id}/watch")
  HttpResponse<String> watchVideo(UUID id, @Body String userName);
}
