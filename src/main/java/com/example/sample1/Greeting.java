package com.example.sample1;

public class Greeting {
  private String message;

  //greetingMessage変数は使わない。
  //private String greetingMessage;

  public String getMessage() {
    return this.message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
  //greetingMessage変数は使わない。
  /*public String getGreetingMessage() {
    return this.greetingMessage;
  }
  public void setGreetingMessage(String greetingMessage) {
    this.greetingMessage = greetingMessage;
  }*/
}
