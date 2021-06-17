package com.gfa.winnieandthepooh.models;

import lombok.Getter;

@Getter
public enum Gender {
/*  MALE,
  FEMALE;*/

  MALE("MALE"),
  FEMALE("FEMALE");

  private String gender;

   Gender(String gender) {
    this.gender = gender;
  }
}
