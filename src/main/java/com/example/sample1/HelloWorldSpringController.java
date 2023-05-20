package com.example.sample1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class HelloWorldSpringController {
  @GetMapping("/greeting")
  public Greeting hello() {
    //Greetingクラスのインスタンス生成
    Greeting greeting = new Greeting();
    //現在日時を取得するnowTime変数
    LocalDateTime nowTime = LocalDateTime.now();
    //getTimeMessageの引数にnowTimeを入れる
    String formattedTime = TimeUtils.getTimeMessage(nowTime);
    String message = TimeUtils.getGreeting(nowTime);

    //greetingクラスのsetMessageメソッドを使う
    greeting.setMessage(message + " 現在日時(日本)は" + formattedTime);

    return greeting;
  }
}
