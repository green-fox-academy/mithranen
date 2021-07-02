package com.gfa.springadvanced.dtos;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EventDTO {

  private List<TeamDTO> T1;
  private List<TeamDTO> T2;
}
