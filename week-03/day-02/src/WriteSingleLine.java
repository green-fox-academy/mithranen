import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

public class WriteSingleLine {
  public static void main(String[] args) {
    // Write a function that is able to manipulate a file
    // by writing your name into it as a single line.
    // The file should be named "my-file.txt".
    // In case the program is unable to write the file,
    // it should print the following error message: "Unable to write file: my-file.txt".

    Path inputFilePath = Paths.get("data/my-file.txt");
    List <String> myList = Arrays.asList("Viktor", "Viktor", "Viktor");
    try {
      Files.write(inputFilePath, myList);
    } catch (IOException e) {
      e.printStackTrace();
      System.out.println("Unable to write file: my-file.txt");
    }
    System.out.println(myList);
  }
}