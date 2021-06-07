package com.example.frontend.models.arrayhandler;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;

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
