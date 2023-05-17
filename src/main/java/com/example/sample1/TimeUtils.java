package com.example.sample1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeUtils {
  public static String currentDateTime() {
    LocalDateTime nowTime = LocalDateTime.now();
    DateTimeFormatter formattingTime = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mmです");
    String formattedTime = formattingTime.format(nowTime);
    return formattedTime;
  }

  public static String getGreetingMessage(String formattedTime) {
    int hour = Integer.parseInt(formattedTime.substring(11, 13));

    String greetingMessage;
    if (hour >= 6 && hour < 12) {
      greetingMessage = "おはようございます！";
    } else if (hour >= 12 && hour < 17) {
      greetingMessage = "こんにちは！";
    } else if (hour >= 17 && hour < 24) {
      greetingMessage = "こんばんは！";
    } else {
      greetingMessage = "おやすみなさい！";
    }
    return greetingMessage;
  }
}
