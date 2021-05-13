package FileIO.optional.encodedlines;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EncodedLines {

  public static void main(String[] args) {
    // Create a method that decrypts encoded-lines.txt
  }

  public static List<String> contentEncryptor() {

    List<String> rawContent = readFile("encoded-lines.txt");

    return null;
  }


 /* private static List<Character> stringToCharacterList(List<String> rawContent) {
    List<Character> characterList = new ArrayList<>();
    for (String line : rawContent) {
      Character[] temp = line.charAt();
      for (int i = 0; i < temporary.length; i++) {
        characterList.add(temporary[i]);
      }
    }
    return characterList;
  }*/

  private static List<String> readFile(String fileName) {
    Path sourceFilePath = Paths.get("src/FileIO/optional/encodedlines/" + fileName);
    List<String> fileContent = new ArrayList<>();
    try {
      fileContent = Files.readAllLines(sourceFilePath);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return fileContent;
  }
}
