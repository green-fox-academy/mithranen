package com.gfa.reverserofthesith.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OutputYodaDTO {

  private String yoda_text;

  public OutputYodaDTO() {
  }

  public OutputYodaDTO(String yoda_text) {
    this.yoda_text = yoda_text;
  }
}
