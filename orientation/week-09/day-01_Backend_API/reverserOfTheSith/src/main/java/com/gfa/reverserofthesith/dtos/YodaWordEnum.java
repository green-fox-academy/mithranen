package com.gfa.reverserofthesith.dtos;

import java.util.Random;
import lombok.Getter;

@Getter
public enum YodaWordEnum {
  HM("hm..."),
  ARR("arrgh..."),
  PEACE("peace"),
  WHOA("whoa.."),
  KNOWLEDGE("knowledge"),
  SERENITY("serenity"),
  HARMONY("harmony"),
  BALANCE("balance"),
  LIGHT("light"),
  LIGHTSIDE("light side"),
  HUMILITY("humility"),
  LOVE("love"),
  MIDI("midi-chlorian");

  //Fields
  private String word;

  //Constructors
  YodaWordEnum(String word) {
    this.word = word;
  }

  //Methods
  public static YodaWordEnum generateRandomWord() {
    YodaWordEnum[] words = YodaWordEnum.values();
    int randIndex = new Random().nextInt(words.length);
    return words[randIndex];
  }
}
