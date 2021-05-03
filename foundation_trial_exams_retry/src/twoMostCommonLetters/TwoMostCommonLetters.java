package twoMostCommonLetters;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TwoMostCommonLetters {

  public static void main(String[] args) {

    Path inputFilePath = Paths.get("src/twoMostCommonLetters/countchar.txt");
    List<String> strList = new ArrayList<>();

    try {
      strList = Files.readAllLines(inputFilePath);
    } catch (IOException e) {
      System.err.println("File does not exist!");
    }

    System.out.println(strList);

    Map<Character, Integer> inputeFileLettersMap = convertListToStringToCharArrayToMap(strList);
    System.out.println(inputeFileLettersMap);

    Map<Character, Integer> mostTwoCommonLettersMap = getTwoMostCommonCharacter(
        inputeFileLettersMap);
    System.out.println(mostTwoCommonLettersMap);

/*    //TODO File read aLL lines
    List<String> strList = new ArrayList<>();
    strList.add("szeretem az őszt");
    strList.add("szeretem az télt");
    System.out.println(strList);

    Map<Character, Integer> map = convertListToStringToCharArrayToMap(strList);
    System.out.println(getTwoMostCommonCharacter(map));*/

  }

  //Methods
  //Two Most Common Character method

  public static Map<Character, Integer> convertListToStringToCharArrayToMap(List<String> strList) {
    //TODO Making String list to One Single String
    StringBuilder strBuilder = new StringBuilder();
    //strBuilder.append(strList.get(0));
    //strBuilder.append(strList.get(1));
    //strBuilder.append(strList.get(2));
    for (int i = 0; i < strList.size(); i++) {
      strBuilder.append(strList.get(i));
    }

    String str = strBuilder.toString(); //TODO stringBuilder mindig toStringesíteni kell!!!
    System.out.println(str);

    //TODO Making from the One String a CharArray
    char[] charsArray = str.toCharArray();
    System.out.println(Arrays.toString(charsArray)); //bármilyen tömböt gy írhatsz Ki!!!

    Map<Character, Integer> characterAmountMap = new HashMap<>();
    for (int i = 0; i < charsArray.length; i++) {
      if (!characterAmountMap.containsKey(charsArray[i])) {
        characterAmountMap.put(charsArray[i], 1);
      } else {
        characterAmountMap.put(charsArray[i], characterAmountMap.get(charsArray[i]) + 1);
      }
    }
    return characterAmountMap;
  }

  public static Map<Character, Integer> getTwoMostCommonCharacter(
      Map<Character, Integer> characterIntegerMap) {
    int biggestValue = 0;
    char mostCommonChar = ' ';

    int secondBiggestValue = 0;
    char secondMostCommonChar = ' ';

    for (Character key : characterIntegerMap.keySet()) {
      if (characterIntegerMap.get(key) > biggestValue) {
        mostCommonChar = key;
        biggestValue = characterIntegerMap.get(key);
      } else if (
          characterIntegerMap.get(key) > secondBiggestValue) {
        secondMostCommonChar = key;
        secondBiggestValue = characterIntegerMap.get(key);
      }
    }

    Map<Character, Integer> result = new HashMap<>();
    result.put(mostCommonChar, biggestValue);
    result.put(secondMostCommonChar, secondBiggestValue);

    return result;
  }

/*  public static void getTwoMostCommonLetters(String inputFileName) {
    Path inputFilePath = Paths.get("src/twoMostCommonLetters/countchar.txt");
    List<String> inputFileLines = new ArrayList<>();

    try {
      inputFileLines = Files.readAllLines(inputFilePath);
    } catch (IOException e) {
      System.err.println("File does not exist!");
      return;
    }

    for (String line : inputFileLines) {
      System.out.println(line.toCharArray());
    } }*/
}

