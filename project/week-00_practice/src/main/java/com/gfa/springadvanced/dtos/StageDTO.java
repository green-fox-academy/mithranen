package com.gfa.springadvanced.dtos;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StageDTO {

  private String Scd;
  private List<EventDTO> Events;

}
