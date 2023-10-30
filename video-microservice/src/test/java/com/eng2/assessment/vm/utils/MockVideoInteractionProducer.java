package com.eng2.assessment.vm.utils;

import com.eng2.assessment.vm.dto.VideoInteractionDetailsDTO;
import com.eng2.assessment.vm.events.VideoInteractionProducer;
import java.util.UUID;

public class MockVideoInteractionProducer implements VideoInteractionProducer {
  @Override
  public void dislikeVideo(UUID videoId, VideoInteractionDetailsDTO details) {}

  @Override
  public void likeVideo(UUID videoId, VideoInteractionDetailsDTO details) {}

  @Override
  public void viewVideo(UUID videoId, VideoInteractionDetailsDTO details) {}
}
