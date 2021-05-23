package FileIO.optional.log;

// !Read all data from 'log.txt'
// !Each line represents a log message from a web server
// !Write a function that returns an array with the unique IP adresses
// !Write a function that returns the GET / POST request ratio

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Log {

  public static void main(String[] args) {
    //  String word1 = "POST";
    //String word2 = "GET";

    System.out.println(
        Arrays.toString(getIpAddresses(getArraysByFileReading("src/FileIO/optional/log/log.txt"))));
    System.out
        .println(
            getRatio(getArraysByFileReading("src/FileIO/optional/log/log.txt"), "POST", "GET"));

  }

  // Read all data from 'log.txt'
// Each line represents a log message from a web server
  public static List<String> getArraysByFileReading(String fileName) {
    Path filePath = Paths.get(fileName);
    List<String> fileContent = null;

    try {
      fileContent = Files.readAllLines(filePath, StandardCharsets.UTF_8);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return fileContent;
  }

  // Write a function that returns an array with the unique IP addresses
  public static String[] getIpAddresses(List<String> list) {
    List<String> ipAddresses = new ArrayList<>();

    for (String line : list) {
      String[] lineAsThreeString = line.split("   "); //-->"   "
      ipAddresses.add(lineAsThreeString[1]);
    }
    //return ipAddresses.toArray(new String[0]);
    return ipAddresses.toArray(new String[]{});
  }

  public static String getRatio(List<String> list, String word1, String word2) {
    int count1 = 0;
    int count2 = 0;
    String ratios = "";

    for (String line : list) {
      String[] lineAsThreeString = line.split("   ");
      //for (int i = 0; i < 1; i++) {
      if (lineAsThreeString[2].contains(word1 + " /")) {
        count1++;
      } else {
        count2++;
      }
      //   }
    }
    ratios =
        word1 + " request: " + count1 + ", " + (double) count1 / list.size() * 100 + "%" + "\n"
            + word2 + " request: " + count2 + ", " + (float) count2 / list.size() * 100 + "%" + "\n"
            + word1 + " : " + word2 + " ratio: " + count1 + ":" + count2;
    return ratios;
  }
}

