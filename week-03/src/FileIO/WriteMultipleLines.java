package FileIO;

// !Create a function that takes 3 parameters: a path, a word and a number
// and is able to write into a file.
// - The path parameter should be a string that describes the location (path & name)
//    of the file you wish to modify.
// - The word parameter should also be a string that will be written to the file as
// individual lines.
// - The number parameter should describe how many lines the file should have.

// If the word is 'apple' and the number is 5, it should write 5 lines
// into the file and each line should read 'apple'.
// The function should not raise any errors if it could not write the file.

import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class WriteMultipleLines {

  public static void main(String[] args) {
writeMultipleLines("src/FileIO/data/test.txt", "Jim", 2);
    //todo return with write into files
  }

  public static void writeMultipleLines(String pathName, String word, int num) {
    Path path = Paths.get(pathName);
    List<String> linesToWriteInto = new ArrayList<>();
    for (int i = 0; i < num; i++) {
      linesToWriteInto.add(word);
    }

    try {
      Files.write(path, linesToWriteInto, StandardCharsets.UTF_8, StandardOpenOption.APPEND);
    } catch (InterruptedIOException e) {
      System.err.println("Can not write into the file!");
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

}
