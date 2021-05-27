package com.gfa.programmerfoxclub.modules;

import lombok.Getter;

@Getter
public enum Drink {
  //Enums
  WATER("clear water"),
  BLOOD("someone's blood"),
  SCOTCH("whiskey from a good old smoked  oak barrel");

  //Fields
  private String value;

  //Constructors
  Drink (String value) {
    this.value = value;
  }


}


