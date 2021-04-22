package FileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CountLines {
  // Write a function that takes a filename as string as a parameter
// and returns the number of lines the file contains.
// It should return zero if it can't open the file
// and should not raise any error.

  public static void main(String[] args) throws IOException {
    //int myFile = readMyFile("src/my-file.txt");
    System.out.println(readMyFile("src/my-file.txt"));
  }

  private static int readMyFile(String inputFile) {
    Path inputFilePath = Paths.get(inputFile); ///.get string-t vár, de ugye itt a változó bejövő
    // input név már eleve az
    try {
      List<String> inputFileLines = Files.readAllLines(inputFilePath);
      return inputFileLines.size();
    } catch (IOException e) {
     //System.err.println("Unable to read file: my-file.txt");
      return 0;
    }
  }
}