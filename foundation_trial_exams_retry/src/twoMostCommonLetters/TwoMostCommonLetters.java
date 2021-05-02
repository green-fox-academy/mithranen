package twoMostCommonLetters;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TwoMostCommonLetters {

  public static void main(String[] args) {
    getTwoMostCommonLetters("countchar.txt");
  }

  public static void getTwoMostCommonLetters(String inputFileName) {
    Path inputFilePath = Paths.get("src/twoMostCommonLetters/countchar.txt");
    List<String> inputFileLines = new ArrayList<>();

    try {
      inputFileLines = Files.readAllLines(inputFilePath);
    } catch (IOException e) {
      System.err.println("File does not exist!");
      return;
    }

    Map<Character, Integer> inputFileMap = new HashMap<>();
    for (String line : inputFileLines) {
      System.out.println(line.toCharArray());
    }

//    return inputFileLines;
  }
}
