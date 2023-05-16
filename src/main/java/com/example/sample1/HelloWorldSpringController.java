package com.example.sample1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldSpringController {
  @GetMapping("/greeting")
  public Greeting hello(@RequestParam(value = "country", defaultValue = "japan") String country) {
    Greeting greeting = new Greeting();
    // 挨拶メッセージの設定
    String greetingMessage = "";
    greeting.setCountry(country);
    switch (country) {
      case "japan" -> greeting.setMessage("こんにちは!");
      case "us" -> greeting.setMessage("Hello!");
      default -> greeting.setMessage("こんにちは!");
    }

    String formattedTime = TimeUtils.nowTime();
    String messageWithTime = greetingMessage + formattedTime;
    greeting.setMessageWithTime(messageWithTime);

    return greeting;
  }
}
