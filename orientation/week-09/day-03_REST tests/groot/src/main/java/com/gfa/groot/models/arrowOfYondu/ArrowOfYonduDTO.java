package com.gfa.groot.models.arrowOfYondu;

import lombok.Getter;

@Getter
public class ArrowOfYonduDTO {

  private Double distance;
  private Double time;
  private Double speed;

  public ArrowOfYonduDTO(Double distance, Double time) {
    this.distance = distance;
    this.time = time;
    speed = distance / time;
  }
}
