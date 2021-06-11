package com.example.frontend.models.arrayhandler;


import lombok.Getter;

@Getter
public class InputObject {

  private String what;
  private Integer[] numbers;

  public InputObject() {
  }

  public InputObject(String what, Integer[] numbers) {
    this.what = what;
    this.numbers = numbers;
  }

}
