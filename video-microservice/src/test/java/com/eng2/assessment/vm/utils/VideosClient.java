package com.eng2.assessment.vm.utils;

import com.eng2.assessment.vm.domain.Video;
import com.eng2.assessment.vm.dto.VideoDTO;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Put;
import io.micronaut.http.client.annotation.Client;
import java.util.UUID;

@Client("${videos.url: `http://localhost:8080/videos`}")
public interface VideosClient {
  @Get("/")
  public Iterable<Video> list();

  @Get("/{id}")
  public Video getVideo(UUID id);

  @Post("/")
  public HttpResponse<String> publish(@Body VideoDTO videoDetails);

  @Put("/{id}/like")
  public HttpResponse<String> likeVideo(UUID id, @Body String userName);

  @Put("/{id}/dislike")
  public HttpResponse<String> dislikeVideo(UUID id, @Body String userName);

  @Put("/{id}/watch")
  public HttpResponse<String> watchVideo(UUID id, @Body String userName);
}
