package com.example.sample1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class HelloWorldSpringController {
  @GetMapping("/greeting")
  public Greeting hello() {
    Greeting greeting = new Greeting();
    String formattedTime = TimeUtils.currentDateTime();
    String message = TimeUtils.getMessage(formattedTime);
    LocalDateTime nowTime = LocalDateTime.now();

    greeting.setMessage(message + " 現在日時(日本)は" + formattedTime);

    return greeting;
  }
}
