package com.example.frontend.models.error;

import lombok.Getter;

public class Error {

  @Getter
  private String error;

  public Error(String error) {
    this.error=error;
  }

/*  public Error(String error) {
    this.error = "Please provide a " + error + "!";
  }

  public Error(String error1, String error2) {
    this.error = "Please provide a " + error1 + " and a " + error2 + "!";
  }*/
}
