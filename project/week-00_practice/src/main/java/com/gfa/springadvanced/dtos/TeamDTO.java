package com.gfa.springadvanced.dtos;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TeamDTO {

  @SerializedName("CoNm")
  private String coNm;

  @SerializedName("CoId")
  private String coId;

  @SerializedName("Snm")
  private String snm;

  public TeamDTO() {
  }

  public TeamDTO(String coNm, String coId, String snm) {
    this.coNm = coNm;
    this.coId = coId;
    this.snm = snm;
  }
}
