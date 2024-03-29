package FileIO;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class WriteSingleLine {
  public static void main(String[] args) {
    // Write a function that is able to manipulate a file
    // by writing your name into it as a single line.
    // The file should be named "my-file.txt".
    // In case the program is unable to write the file,
    // it should print the following error message: "Unable to write file: my-file.txt".

    Path inputFilePath = Paths.get("src/FileIO/data/my-file.txt"); // ha elcseszed a fáljutat akkor kiírja h nem olvasható be
    List <String> myList = Arrays.asList("Viktor", "Viktor", "Viktor");
    try {
      Files.write(inputFilePath, myList, StandardCharsets.UTF_8, StandardOpenOption.WRITE);
    } catch (IOException e) {
      e.printStackTrace();
      System.err.println("Unable to write file: my-file.txt");
    }
    System.out.println(myList);
  }
}