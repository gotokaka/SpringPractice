package com.example.sample1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldSpringController {
  @GetMapping("/greeting")
  public Greeting hello() {
    Greeting greeting = new Greeting();
    String formattedTime = TimeUtils.currentDateTime();
    String greetingMessage = TimeUtils.getGreetingMessage(formattedTime);


    greeting.setGreetingMessage(greetingMessage);
    greeting.setMessage(greeting.getGreetingMessage() + " 現在日時は" + formattedTime);

    return greeting;
  }
}
