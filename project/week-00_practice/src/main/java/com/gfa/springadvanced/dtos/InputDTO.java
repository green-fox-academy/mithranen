package com.gfa.springadvanced.dtos;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InputDTO {

  @SerializedName("Stages")
  private List<StageDTO> stages;
}
