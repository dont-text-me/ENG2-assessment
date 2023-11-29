package com.eng2.assessment.sm.events;

import static com.eng2.assessment.vm.events.Topics.TOPIC_VIDEO_POSTED;
import static com.eng2.assessment.vm.events.Topics.TOPIC_VIDEO_VIEWED;

import com.eng2.assessment.sm.domain.Hashtag;
import com.eng2.assessment.sm.domain.User;
import com.eng2.assessment.sm.domain.Video;
import com.eng2.assessment.sm.repositories.HashtagRepository;
import com.eng2.assessment.sm.repositories.UserRepository;
import com.eng2.assessment.sm.repositories.VideoRepository;
import com.eng2.assessment.vm.dto.VideoInteractionDetailsDTO;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.Topic;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import java.util.HashSet;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Handles incoming messages from VM and recreates (with minimal information) the links between
 * hashtags, users and videos.
 */
@KafkaListener(groupId = "subscription-microservice")
public class VideoInteractionConsumer {
  private static final Logger logger = LoggerFactory.getLogger(VideoInteractionConsumer.class);

  @Inject private HashtagRepository hashtagRepository;
  @Inject private UserRepository userRepository;
  @Inject private VideoRepository videoRepository;

  @Topic(TOPIC_VIDEO_POSTED)
  @Transactional
  void processPosted(@KafkaKey Long videoId, VideoInteractionDetailsDTO details) {
    createMissingEntities(videoId, details);
  }

  @Topic(TOPIC_VIDEO_VIEWED)
  @Transactional
  void processViewed(@KafkaKey Long videoId, VideoInteractionDetailsDTO details) {
    createMissingEntities(videoId, details);

    Video video = videoRepository.findById(videoId).get();
    User user = userRepository.findByUserNameEqual(details.userName()).get();
    if (!user.hasWatchedVideo(videoId)) {
      logger.info(
          String.format(
              "User %s has watched video %s for the first time. Adding new link to database",
              details.userName(), details.videoTitle()));
      video.addViewer(user);
    }
    video.incrementViewCount();
    videoRepository.update(video);
  }

  /**
   * Process a received message and create any entities that are not in the database. Checks that
   * there are database records for any users, hashtags and videos mentioned in the message and
   * creates new records for missing values.
   *
   * <p>Note: Does not perform any validation as messages are coming from VM, which validates the
   * initial records.
   */
  private void createMissingEntities(Long videoId, VideoInteractionDetailsDTO details) {
    // Check user exists
    if (!userRepository.existsByUserNameEqual(details.userName())) {
      logger.info("Creating user with username " + details.userName());
      User newUser = new User();
      newUser.setUserName(details.userName());
      newUser.setViewedVideos(new HashSet<>());
      userRepository.save(newUser);
    }

    if (!videoRepository.existsByIdEqual(videoId)) {
      // Check if any new hashtags need to be created and create them
      hashtagRepository.saveAll(
          details.hashtagNames().stream()
              .filter(it -> !hashtagRepository.existsByNameEqual(it))
              .map(
                  it -> {
                    Hashtag h = new Hashtag();
                    h.setName(it);
                    logger.info("Creating hashtag with name " + it);
                    return h;
                  })
              .toList());

      logger.info("Creating new video with ID " + videoId);
      Set<Hashtag> allHashtags =
          new HashSet<>(hashtagRepository.findByNameIn(details.hashtagNames()));

      Video video = new Video();
      video.setId(videoId);
      video.setHashtags(allHashtags);
      video.setViewCount(0L);
      video.setViewers(new HashSet<>());
      video.setTitle(details.videoTitle());
      videoRepository.save(video);
    }
  }
}
