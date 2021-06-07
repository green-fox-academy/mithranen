package com.example.frontend.models.appendA;

import lombok.Getter;

@Getter
public class AppendA {
  private String appended;

  public AppendA(String appended) {
    this.appended = String.valueOf(new StringBuilder().append(appended).append("a"));
    //this.appended = appended.concat("a");
  }
}
