package com.gfa.reverserofthesith.errors;

import lombok.Getter;

@Getter
public class NoInputTextError {

  private String error;

  public NoInputTextError() {
    this.error = "Feed me some text you have to, padawan young you are. Hmmm.";
  }
}
