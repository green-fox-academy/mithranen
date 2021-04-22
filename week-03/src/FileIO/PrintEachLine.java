package FileIO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class PrintEachLine {

  public static void main(String[] args) {
    Path inputFilePath = Paths.get("inputFile");
    try {
      List<String> inputFileLines = Files.readAllLines(inputFilePath);
    } catch (IOException e) {
      System.err.println("Unable to read file: my-file.txt");
    }
  }
}

/* with return function
  public static void main(String[] args) throws IOException {
    // Write a program that opens a file called "my-file.txt" and prints each
    // line from the file.
    // If the program is unable to read the file (for example the file does not exist),
    // it should print the following error message: "Unable to read file: my-file.txt".
    List<String> myFile = readMyFile("src/my-file.txt");
    System.out.println(myFile);
  }

  private static List<String> readMyFile(String inputFile) throws IOException {
    Path inputFilePath = Paths.get("inputFile");
    try {
      List<String> inputFileLines = Files.readAllLines(inputFilePath);
      return inputFileLines;
    } catch (IOException e) {
      System.err.println("Unable to read file: my-file.txt");
      return new ArrayList<>();
    }
  }
*/
