package com.eng2.assessment.vm.controllers;

import static org.junit.jupiter.api.Assertions.*;

import com.eng2.assessment.vm.domain.Hashtag;
import com.eng2.assessment.vm.domain.User;
import com.eng2.assessment.vm.domain.Video;
import com.eng2.assessment.vm.dto.VideoDTO;
import com.eng2.assessment.vm.repositories.HashtagRepository;
import com.eng2.assessment.vm.repositories.UsersRepository;
import com.eng2.assessment.vm.repositories.VideosRepository;
import com.eng2.assessment.vm.utils.DbCleanupExtension;
import com.eng2.assessment.vm.utils.VideosClient;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@MicronautTest(transactional = false)
@ExtendWith(DbCleanupExtension.class)
public class VideosControllerTest {
  @Inject private VideosClient client;
  @Inject private VideosRepository videoRepo;
  @Inject private UsersRepository userRepo;
  @Inject private HashtagRepository hashtagRepo;

  @Nested
  @DisplayName("list books tests")
  class ListBooksTest {
    @Test
    public void emptyList() {
      Iterable<Video> iterVideos = client.list();
      assertFalse(iterVideos.iterator().hasNext());
    }

    @Test
    public void returnsList() {
      Video video = new Video();
      video.setTitle("Me at the zoo");
      videoRepo.save(video);

      Video result = client.list().iterator().next();

      assertNotNull(result);
      assertEquals(result.getTitle(), "Me at the zoo");
    }
  }

  @Nested
  @DisplayName("publish video tests")
  class PublishVideoTest {
    @Test
    public void canPublishVideo() {
      User author = new User();
      author.setUsername("ZooLover");
      userRepo.save(author);

      Hashtag hashtag = new Hashtag();
      hashtag.setId("Zoo");
      hashtagRepo.save(hashtag);

      VideoDTO details =
          new VideoDTO("Me at the zoo", author.getUsername(), List.of(hashtag.getId()));

      HttpResponse<String> response = client.publish(details);
      Instant justAfterUpdate = Instant.now();

      assertEquals(response.getStatus(), HttpStatus.CREATED);
      String newId = response.getBody().get().substring(response.body().lastIndexOf(" ") + 1);

      Video createdVideo = videoRepo.findById(UUID.fromString(newId)).get();

      assertNotNull(createdVideo);
      assertEquals(createdVideo.getTitle(), "Me at the zoo");
      assertEquals(createdVideo.getAuthor().getUsername(), "ZooLover");
      assertEquals(
          createdVideo.getHashtags().stream().map(Hashtag::getId).collect(Collectors.toSet()),
          Set.of("Zoo"));
      assertEquals(createdVideo.getLikeCount(), 0);
      assertEquals(createdVideo.getDislikeCount(), 0);
      assertEquals(createdVideo.getViewCount(), 0);
      assert (Duration.between(createdVideo.getPublishedAt().toInstant(), justAfterUpdate)
              .toSeconds()
          <= 1);
    }

    @Test
    public void addsMissingHashtagsToDatabase(){
      User author = new User();
      author.setUsername("ZooLover");
      userRepo.save(author);

      VideoDTO details =
              new VideoDTO("Me at the zoo", author.getUsername(), List.of("Zoo"));

      HttpResponse<String> response = client.publish(details);

      assertEquals(response.getStatus(), HttpStatus.CREATED);
      String newId = response.getBody().get().substring(response.body().lastIndexOf(" ") + 1);
      Video createdVideo = videoRepo.findById(UUID.fromString(newId)).get();

      Hashtag createdHashtag = hashtagRepo.findById("Zoo").orElse(null);

      assertNotNull(createdHashtag);
      assertEquals(createdHashtag.getId(), "Zoo");
      assertEquals(
              createdVideo.getHashtags().stream().map(Hashtag::getId).collect(Collectors.toSet()),
              Set.of("Zoo"));

    }

    @Test
    public void handlesUnknownAuthor(){
      VideoDTO details =
              new VideoDTO("Me at the zoo", "random-user", List.of("Zoo"));

      HttpResponse<String> response = client.publish(details);

      assertEquals(response.getStatus(), HttpStatus.NOT_FOUND);
      assert(response.body().contains("Could not find author"))
;    }
  }

  @Nested
  @DisplayName("like video tests")
  class LikeVideoTest{
    @Test
    public void canLikeVideo(){
      User author = new User();
      author.setUsername("ZooLover");
      userRepo.save(author);

      Video video = new Video();
      video.setTitle("Me at the zoo");
      videoRepo.save(video);

      HttpResponse<String> response = client.likeVideo(video.getId(), author.getUsername());

      assertEquals(response.getStatus(), HttpStatus.OK);

      Video videoAfterLike = videoRepo.findById(video.getId()).get();
      assert(videoAfterLike.getLikeCount() - video.getLikeCount() == 1);
    }

    @Test
    public void handlesUnknownUser(){
      Video video = new Video();
      video.setTitle("Me at the zoo");
      videoRepo.save(video);

      HttpResponse<String> response = client.likeVideo(video.getId(), "Unknown username");

      assertEquals(response.getStatus(), HttpStatus.NOT_FOUND);
      assert(response.getBody().get().contains("Could not find user"));
    }

    @Test
    public void handlesUnknownVideo(){
      User author = new User();
      author.setUsername("ZooLover");
      userRepo.save(author);

      HttpResponse<String> response = client.likeVideo(UUID.randomUUID(), author.getUsername());

      assertEquals(response.getStatus(), HttpStatus.NOT_FOUND);
      assert(response.getBody().get().contains("Could not find video"));
    }
  }

  @Nested
  @DisplayName("dislike video tests")
  class DislikeVideoTest{
    @Test
    public void canDislikeVideo(){
      User author = new User();
      author.setUsername("ZooLover");
      userRepo.save(author);

      Video video = new Video();
      video.setTitle("Me at the zoo");
      videoRepo.save(video);

      HttpResponse<String> response = client.dislikeVideo(video.getId(), author.getUsername());

      assertEquals(response.getStatus(), HttpStatus.OK);

      Video videoAfterDislike = videoRepo.findById(video.getId()).get();
      assert(video.getLikeCount() - videoAfterDislike.getLikeCount()  == 1);
    }

    @Test
    public void handlesUnknownUser(){
      Video video = new Video();
      video.setTitle("Me at the zoo");
      videoRepo.save(video);

      HttpResponse<String> response = client.dislikeVideo(video.getId(), "Unknown username");

      assertEquals(response.getStatus(), HttpStatus.NOT_FOUND);
      assert(response.getBody().get().contains("Could not find user"));
    }

    @Test
    public void handlesUnknownVideo(){
      User author = new User();
      author.setUsername("ZooLover");
      userRepo.save(author);

      HttpResponse<String> response = client.dislikeVideo(UUID.randomUUID(), author.getUsername());

      assertEquals(response.getStatus(), HttpStatus.NOT_FOUND);
      assert(response.getBody().get().contains("Could not find video"));
    }
  }
}
