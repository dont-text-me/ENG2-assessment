package com.eng2.assessment.vm.utils;

import java.util.Random;

public class Utils {
  public static Long getRandomLong() {
    Random r = new Random();
    return r.nextLong();
  }
}
