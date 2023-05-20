package com.example.sample1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeUtils {
  //getTimeMessageの引数にLocalDateTime nowTimeを入れる
  public static String getTimeMessage(LocalDateTime nowTime) {
    DateTimeFormatter formattingTime = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mmです");
    String formattedTime = formattingTime.format(nowTime);
    return formattedTime;
  }

  public static String getGreeting(LocalDateTime nowTime) {
    //取得した日時より時間のみ取得する。
    int hour = nowTime.getHour();
    //条件分岐
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
