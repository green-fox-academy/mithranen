package com.gfa.winnieandthepooh.dtos;

import com.gfa.winnieandthepooh.models.Gender;
import lombok.Getter;

@Getter
public class InputCreatorAnimalDTO {
  private Integer newAge;
  private Gender gender;
}
