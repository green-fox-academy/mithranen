package com.gfa.reverserofthesith.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OutputYodaDTO {

  private String yoda_text;
  @JsonIgnore
  private static List<String> sithWords = new ArrayList<>(Arrays
      .asList(
          "passion", "lie", "anger", "death", "dark",
          "power", "strength", "victory", "rage",
          "anger", "dark side", "chains", "broken", "unlimited"));
  @JsonIgnore
  private static List<String> contexWords = new ArrayList<>(
      Arrays.asList("there", "this", "do", "does", "is", "are", "gain"));


  public OutputYodaDTO() {
  }

  public String theGreatSithReverserFromYoda(String sithText) {
    List<String[]> splittedSithText = splitSithText(sithText);

    List<String[]> jediTexts = turnSithTextIntoJedi(splittedSithText);

    List<String[]> jediTextByYoda = jediTextPerformedByYoda(jediTexts);

    List<String[]> response = addDotAndSpaceEndOfSentence(jediTextByYoda);

    return cleantextWithRandomYodaPhrase(response);
  }

  //Splitting sith text
  private List<String[]> splitSithText(String inputText) {
    String[] sentenceArr = inputText.split("\\. ");
    List<String[]> wordList = new ArrayList<>();

    for (String word : sentenceArr) {
      wordList.add(word.split(" "));
    }
    return wordList;
  }

  //Turn sith text into jedi text
  private List<String[]> turnSithTextIntoJedi(List<String[]> inputList) {
    for (String[] sentence : inputList) {
      for (int i = 0; i < sentence.length; i++) {
        for (String sithWord : sithWords) {
          if (sentence[i].toLowerCase(Locale.ROOT).contains(sithWord)) {
            sentence[i] = YodaWordEnum.generateRandomWord().getWord();
          }
        }
      }
    }
    return inputList;
  }

  //Reverse input text according to Yoda
  private List<String[]> jediTextPerformedByYoda(List<String[]> inputList) {
    List<String[]> outputList = new ArrayList<>();
    for (String[] sentence : inputList) {
      for (int i = 0; i < sentence.length; i += 2) {
        if (sentence.length % 2 == 0) {
          String tempEven = sentence[i];
          sentence[i] = sentence[i + 1];
          sentence[i + 1] = tempEven;
        }
      }
      for (int i = 0; i < sentence.length - 1; i += 2) {
        if (sentence.length % 2 != 0) {
          String tempEven = sentence[i];
          sentence[i] = sentence[i + 1];
          sentence[i + 1] = tempEven;
        }
      }
      outputList.add(sentence);
    }
    return outputList;
  }

  //Add dot end of the sentence
  private List<String[]> addDotAndSpaceEndOfSentence(List<String[]> inputList) {
    List<String[]> outputList = new ArrayList<>();

    for (String[] strings : inputList) {
      for (int j = 0; j < strings.length; j++) {
        if (!strings[strings.length - 1].contains(".")) {
          strings[strings.length - 1] += ".";
        }
        strings[j] = strings[j].toLowerCase(Locale.ROOT);
        strings[0] = strings[0].substring(0, 1).toUpperCase() + strings[0].substring(1);
      }
      outputList.add(strings);
    }
    return outputList;
  }

  //Stringify the correct Yodatext for ResponseBody //TODO how to use randomize 2!!!!
  private String cleantextWithRandomYodaPhrase(List<String[]> inputList) {
    String yodaPhrase = YodaPhraseEnum.generateRandomPhrase().getEndingPhrase();
    String yodaPhrase2 = YodaPhraseEnum.generateRandomPhrase().getEndingPhrase();

    StringBuilder stringBuilder = new StringBuilder();

    for (int i = 0; i < inputList.size(); i++) {
      if (i == 2) {
        stringBuilder.append(yodaPhrase).append(" ");
      }
      for (int j = 0; j < inputList.get(i).length; j++) {
        stringBuilder.append(inputList.get(i)[j]).append(" ");
      }
    }
    return stringBuilder.append(yodaPhrase2).toString();
  }
}
