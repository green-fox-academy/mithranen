package com.gfa.springadvanced.dtos;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EventDTO {

  @SerializedName("T1")
  private List<TeamDTO> t1;

  @SerializedName("T2")
  private List<TeamDTO> t2;
}
