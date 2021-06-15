package com.gfa.reverserofthesith.dtos;

import java.util.Random;
import lombok.Getter;

@Getter
public enum YodaPhraseEnum {
  HMMM("Hmmm..."),
  ERG("Errgh..."),
  CAREFUL("Careful you must be."),
  CONSUME("Consume you, it will."),
  FEEL("Force, feel it!"),
  MAY("May the Force be with you!"),
  FORCE("Force, there is."),
  TRY("No try, there is.");

  //Fields
  private String endingPhrase;

  //Constructors
  YodaPhraseEnum(String endingPhrase) {
    this.endingPhrase = endingPhrase;
  }

  //Methods
  public static YodaPhraseEnum generateRandomPhrase() {
    YodaPhraseEnum[] phrases = YodaPhraseEnum.values();
    int randIndex = new Random().nextInt(phrases.length);
    return phrases[randIndex];
  }

}
