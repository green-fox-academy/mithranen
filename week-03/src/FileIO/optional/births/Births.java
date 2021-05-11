package FileIO.optional.births;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// !Create a function that
// !- takes the name of a CSV file as a parameter,
//  ! - every row is in the following format: <person name>;<birthdate in YYYY-MM-DD format>;<city name>
// !- and returns the year when the most births happened.
// !  - if there were multiple years with the same number of births then return any of them

// You can find such a CSV file in this directory named births.csv
// If you pass "births.csv" to your function, the result should be either 2006 or 2016
public class Births {

  public static void main(String[] args) {

    System.out.println("\033[35m" + getMostBirthYear("births.csv") + "\033[0m");

  }

  public static List<String> getMostBirthYear(String fileName) {

    //Content reading and saving into a list
    List<String> content = new ArrayList<>();

    try {
      content = fileReader(fileName);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    }

    //Splitting lines and putting years into Map
    Map<String, Integer> yearOccurrences = new HashMap<>();

    for (String line : content) {
      String[] separatedLine = line.split(";");
      String year = separatedLine[1].substring(0, 4);
      if (!yearOccurrences.containsKey(year)) {
        yearOccurrences.put(year, 1);
      } else {
        //key overwriting with put
        yearOccurrences.put(year, yearOccurrences.get(year) + 1);
      }
    }

    System.out.println(yearOccurrences.entrySet());

    int maxEntryValue = 0;

    for (Map.Entry<String, Integer> entry : yearOccurrences.entrySet()) {
      if (entry.getValue() > maxEntryValue) {
        maxEntryValue = entry.getValue();
      }
    }

    List<String> resultYear = new ArrayList<>();
    for (Map.Entry<String, Integer> entry : yearOccurrences.entrySet()) {
      if (entry.getValue().equals(maxEntryValue)) {
        resultYear.add(entry.getKey());
      }
    }

    return resultYear;
  }

  public static List<String> fileReader(String fileName)
      throws FileNotFoundException, IllegalAccessException {
    Path filePath = Paths.get("src/FileIO/optional/births/" + fileName);
    List<String> fileContent = null;

    if (!Files.exists(filePath)) {
      throw new FileNotFoundException("File does not exist!");
    }
    if (!Files.isReadable(filePath)) {
      throw new IllegalAccessException("File does not readable");
    }
    try {
      fileContent = Files.readAllLines(filePath, StandardCharsets.UTF_8);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return fileContent;
  }
}
