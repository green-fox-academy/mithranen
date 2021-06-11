package com.gfa.groot.models.groot;

import lombok.Getter;

@Getter
public class GrootMessageDTO {

  private String received;
  private String translated;

  public GrootMessageDTO(String received, String translated) {
    this.received = received;
    this.translated = translated;
  }
}
