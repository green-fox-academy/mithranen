package com.example.frontend.models.dountil;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DoUntilResult {

  private Long result;

  public DoUntilResult() {
    result = 0L;
  }

  public DoUntilResult(Long result) {
    this.result = result;
  }
}
