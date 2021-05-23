package FileIO.optional.lottery;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lottery {

  public static void main(String[] args) {
    // Create a method that find the 5 most common lottery numbers in lottery.csv
    System.out.println(getFiveMostCommonLotteryNumbersMain("lottery.csv"));
  }

  public static List<String> getFiveMostCommonLotteryNumbersMain(String fileName) {

    List<String> rawContent = readFile(fileName);
    List<String> lotteryNumbersList = getAllLotteryNumbers(rawContent);
    Map<String, Integer> numberOccurrencesMap = numbersByOccurrences(lotteryNumbersList);

    return getFiveMostCommonLotteryNumbers(numberOccurrencesMap);
  }

  public static List<String> getFiveMostCommonLotteryNumbers(Map<String, Integer> occurrencesMap) {
    int maxEntryValue = 0;
    String maxEntryKey = "";

    List<String> fiveMostCommonNumbers = new ArrayList<>();

// Get five most common lottery numbers
    for (int i = 0; i < 5; i++) {
      //Get the most common lottery numbers
      for (Map.Entry<String, Integer> entry : occurrencesMap.entrySet()) {
        if (maxEntryValue < entry.getValue()) {
          maxEntryValue = entry.getValue();
          maxEntryKey = entry.getKey();
        }
      }
      fiveMostCommonNumbers.add(maxEntryKey);
      //Removing most common lottery number
      occurrencesMap.remove(maxEntryKey);
      maxEntryValue = 0;
    }
    return fiveMostCommonNumbers;
  }

  private static Map<String, Integer> numbersByOccurrences(List<String> lotteryNumbersList) {
    Map<String, Integer> numbersOccurrences = new HashMap<>();
    for (String number : lotteryNumbersList) {
      if (!numbersOccurrences.containsKey(number)) {
        numbersOccurrences.put(number, 1);
      } else {
        numbersOccurrences.put(number, numbersOccurrences.get(number) + 1);
      }
    }
    return numbersOccurrences;
  }

  private static List<String> getAllLotteryNumbers(List<String> rawContent) {
    List<String> allNumbersList = new ArrayList<>();
    for (String line : rawContent) {
      String[] temp = line.split("Ft;");
      String[] temporary = temp[4].split(";");
      for (int i = 0; i < temporary.length; i++) {
        allNumbersList.add(temporary[i]);
      }
    }
    return allNumbersList;
  }

  private static List<String> readFile(String fileName) {
    Path sourceFilePath = Paths.get("src/FileIO/optional/lottery/" + fileName);
    List<String> fileContent = new ArrayList<>();
    try {
      fileContent = Files.readAllLines(sourceFilePath);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return fileContent;
  }

}
