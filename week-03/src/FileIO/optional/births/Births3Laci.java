package FileIO.optional.births;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Births3Laci {

  public static void main(String[] args) {
    // write your code here
    System.out.println(birth("births.csv"));
  }

  public static String birth(String fileName) {
    List<String> content = readFile(fileName);
    List<String> birthYearList = splitLines(content);
    Map<String, Integer> occurrences = listToMap(birthYearList);
    // String mostCommonBirthYear = getMostCommonBirtYear(occurrences);

    return getMostCommonBirtYear(occurrences);
  }

  private static String getMostCommonBirtYear(Map<String, Integer> occurrences) {
    int maxValue = 0;
    String mostCommonYear = "";
    for (String key : occurrences.keySet()) {
      if (occurrences.get(key) > maxValue) {
        maxValue = occurrences.get(key);
        mostCommonYear = key;
      }
    }
    return mostCommonYear;
  }

  private static Map<String, Integer> listToMap(List<String> birthYearList) {
    Map<String, Integer> occurrences = new HashMap<>();
    for (String year : birthYearList) {
      if (!occurrences.containsKey(year)) {
        occurrences.put(year, 1);
      } else {
        occurrences.put(year, occurrences.get(year) + 1);
      }
    }

    return occurrences;
  }

  private static List<String> splitLines(List<String> content) {
    List<String> splitedLines = new ArrayList<>();
    for (String line : content) {
      String[] temp = line.split(";");
      String temporary = temp[1].substring(0, 4);
      splitedLines.add(temporary);
    }
    return splitedLines;
  }

  private static List<String> readFile(String fileName) {
    Path sourceFilePath = Paths.get("src/FileIO/optional/births/" + fileName);
    List<String> fileContent = new ArrayList<>();
    try {
      fileContent = Files.readAllLines(sourceFilePath);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return fileContent;
  }
}