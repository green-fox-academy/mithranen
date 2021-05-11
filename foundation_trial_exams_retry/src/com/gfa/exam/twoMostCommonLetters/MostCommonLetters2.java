package com.gfa.exam.twoMostCommonLetters;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostCommonLetters2 {

  public static void main(String[] args) {

    try {
      System.out.println(getMostCommonCharacter("src/com/gfa/exam/countchar.txt"));
    } catch (NoSuchFieldException e) {
      e.printStackTrace();
    }

  }

  public static Map<Character, Integer> getMostCommonCharacter(String fileName)
      throws NoSuchFieldException {
    //Read file with exceptions
    List<String> fileContent = readFile(fileName);

    //Character from file
    Map<Character, Integer> lettersOccurrences = getLettersOccurrences(fileContent);

    //Three most common letters
    Map<Character, Integer> twoMostCommonLetters = new HashMap<>();

    //iteration ->> n most common letters
    for (int i = 0; i < 4; i++) {
      Map.Entry<Character, Integer> maxEntry = getMostCommonLetter(lettersOccurrences);
      twoMostCommonLetters.put(maxEntry.getKey(), maxEntry.getValue());
      lettersOccurrences.remove(maxEntry.getKey());
    }

    return twoMostCommonLetters;
  }

  private static Map.Entry<Character, Integer> getMostCommonLetter(
      Map<Character, Integer> lettersOccurrences) {

    Map.Entry<Character, Integer> maxEntry = null;
    for (Map.Entry<Character, Integer> entry : lettersOccurrences.entrySet()) {
      //Comparable interface --> compareTo
      if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
        maxEntry = entry;
      }
    }
    return maxEntry;
  }

  private static Map<Character, Integer> getLettersOccurrences(List<String> fileContent) {
    Map<Character, Integer> lettersOccurrences = new HashMap<>();
    for (String line : fileContent) {
      char[] lettersArr = line.toCharArray();
      for (char letter : lettersArr) {
        if (!lettersOccurrences.containsKey(letter)) {
          lettersOccurrences.put(letter, 1);
        } else {
          lettersOccurrences.put(letter, lettersOccurrences.get(letter) + 1);
        }
      }
    }
    return lettersOccurrences;
  }

  private static List<String> readFile(String fileName) throws NoSuchFieldException {
    Path filePath = Paths.get(fileName);
    List<String> fileContent;
    if (!Files.exists(filePath)) {
      throw new NoSuchFieldException("File does not exist!");
    }
    try {
      fileContent = Files.readAllLines(filePath, StandardCharsets.UTF_8);
    } catch (IOException e) {
      System.err.println("Other file reading problem!");
      return null;
    }

    return fileContent;
  }
}

