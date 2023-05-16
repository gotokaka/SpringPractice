package com.example.sample1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
public class HelloWorldSpringController {
  @GetMapping("/greeting")
  public Greeting hello(@RequestParam(value = "country", defaultValue = "japan") String country) {
    Greeting greeting = new Greeting();
    String greetingMessage = "";
    greeting.setCountry(country);
    if (Objects.equals(country, "japan")) {
      greeting.setMessage("こんにちは!");
    } else if (Objects.equals(country, "us")) {
      greeting.setMessage("Hello!");
    } else if (Objects.equals(country, "korea")) {
      greeting.setMessage("アニョハセヨ");
    } else {
      greeting.setMessage("Hello world");
    }

    String formattedTime = TimeUtils.nowTime();
    String messageWithTime = greetingMessage + formattedTime;
    greeting.setMessageWithTime(messageWithTime);

    return greeting;
  }
}
