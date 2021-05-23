package FileIO;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.List;

// Write a function that copies the contents of a file into another file
// It should take two filenames (string) as parameters:
//  - path and name of the source file
//  - path and name of the target file
// It should return a boolean that shows if the copy was successful
public class Copy {

  public static void main(String[] args) {
    try {
      copyFile("test.txt", "test_copy");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static boolean copyFile(String sourceFileName, String copyFileName) throws IOException {
    Path sourcePath = Paths.get("src/FileIO/data/" + sourceFileName);
    Path targetPath = Paths.get("src/FileIO/data/" + copyFileName);

    try {
      List<String> sourceContent = Files.readAllLines(sourcePath);
      //Files.write(targetPath, sourceContent, StandardCharsets.UTF_8, StandardOpenOption.WRITE);
      Files.copy(sourcePath, targetPath, StandardCopyOption.COPY_ATTRIBUTES);
      return true;
    } catch (IOException e) {
      throw new IOException("File reading or writing problem!");
    }
  }
}
