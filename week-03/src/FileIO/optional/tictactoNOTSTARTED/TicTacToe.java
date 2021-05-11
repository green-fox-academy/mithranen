package FileIO.optional.tictactoNOTSTARTED;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TicTacToe {

  public static void main(String[] args) {
    // !Write a function that takes a filename as a parameter
    // The file contains an ended Tic-Tac-Toe match
    // We have provided you some example files (draw.txt, win-x.txt, win-o.txt)
    // Return "X", "O" or "Draw" based on the input file's content

   // System.out.println(ticTacResult("win-o.txt"));
    // Should print "O"

   // System.out.println(ticTacResult("win-x.txt"));
    // Should print "X"

   // System.out.println(ticTacResult("draw.txt"));
    // Should print "Draw"
  }

  public static void ticTacResult(String fileName)
      throws FileNotFoundException, IllegalAccessException {
    fileReader(fileName);


  }

  public static List<String> fileReader(String fileName)
      throws FileNotFoundException, IllegalAccessException {
    Path filePath = Paths.get(fileName);
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
