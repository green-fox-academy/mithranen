package com.gfa.programmerfoxclub.modules;

import lombok.Getter;
import lombok.Setter;

@Getter
public enum Trick {
  //Enums
  JAVA("coding in Java"),
  HTML("write HTML"),
  EATING("eating flesh"),
  DRINKING("drinking blood"),
  SNIFFING("sniffing living things around itself"),
  TRACKING("following tracks"),
  CAMOUFLAGE("hide itself in its environment"),
  AMBUSH("lurking around you to bite your neck!!");

  //Fields
  private String value;

  //Constructors
  Trick(String value) {
    this.value = value;
  }

  //Setter

}


