package com.example.sample1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeUtils {
  public static String currentDateTime() {
    LocalDateTime nowTime = LocalDateTime.now();
    DateTimeFormatter formattingTime = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mmです");
    String formattedTime = formattingTime.format(nowTime);
    return "現在日時は" + formattedTime;
  }
}
