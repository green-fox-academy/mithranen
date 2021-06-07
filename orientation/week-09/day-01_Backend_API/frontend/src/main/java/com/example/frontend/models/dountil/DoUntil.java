package com.example.frontend.models.dountil;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DoUntil {
  private Long until;

  public DoUntil() {
  }

  public DoUntil(Long until) {
    this.until = until;
  }
}
