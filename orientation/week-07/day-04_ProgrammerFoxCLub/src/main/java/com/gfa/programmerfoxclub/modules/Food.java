package com.gfa.programmerfoxclub.modules;

import lombok.Getter;
import lombok.Setter;

@Getter
public enum Food {
  //Enum's value
  FLESH("everyone's flesh"),
  PIZZA("pizza napoletana"),
  CHICKEN("whole chicken"),
  BUG("tasty bugs"),
  HIKER("lost hiker ");

  //Fields - value-k value-ja
  private String value;

  //Constructors
  Food(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  //Setter
  public void setValue(String value) {
    this.value = value;
  }
}


