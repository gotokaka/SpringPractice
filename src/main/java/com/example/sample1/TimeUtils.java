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

  public static String getMessage(String formattedTime) {
    int hour = Integer.parseInt(formattedTime.substring(11, 13));

    //greetingMessage変数を使用しないのでgreetingMessageからmessageへ変更
    String message;
    if (hour >= 6 && hour < 12) {
      message = "おはようございます！";
    } else if (hour >= 12 && hour < 18) {
      message = "こんにちは！";
    } else if (hour >= 18 && hour < 24) {
      message = "こんばんは！";
    } else {
      message = "おやすみなさい！";
    }
    return message;
  }
}
