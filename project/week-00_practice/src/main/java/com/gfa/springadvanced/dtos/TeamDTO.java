package com.gfa.springadvanced.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TeamDTO {

  private String CoNm;
  private String CoId;
  private String Scd;

  public TeamDTO() {
  }

  public TeamDTO(String coNm, String coId, String scd) {
    CoNm = coNm;
    CoId = coId;
    Scd = scd;
  }
}
