package com.gfa.springadvanced.dtos;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StageDTO {

  @SerializedName("Snm")
  private String snm;

  @SerializedName("Events")
  private List<EventDTO> events;

}
