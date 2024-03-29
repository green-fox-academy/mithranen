package com.gfa.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {

  private long greetCount;
  private String content;

  public Greeting(long greetCount, String content) {
    this.greetCount = greetCount;
    this.content = content;
  }

  public long getGreetCount() {
    return greetCount;
  }

  public String getContent() {
    return content;
  }
}
