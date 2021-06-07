package com.example.frontend.models.doubling;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DoubleTheInput {

  //fields
  private Long received;
  private Long result;


  //constructor
  public DoubleTheInput() {
  }

  public DoubleTheInput(Long received) {
    this.received = received;
    this.result = received * 2;
  }

  //getters and setters
}
