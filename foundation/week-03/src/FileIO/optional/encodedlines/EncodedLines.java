package FileIO.optional.encodedlines;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class EncodedLines {

  public static void main(String[] args) {
    // Create a method that decrypts encoded-lines.txt
    System.out.println(contentEncryptorMain("encoded-lines.txt"));


  }

  public static List<String> contentEncryptorMain(String fileName) {

    List<String> rawContent = readFile(fileName);
    List<char[]> contentByCharacters = stringToCharacterList(rawContent);
    List<String> encryptedContent = contentEncryptor(contentByCharacters);

    fileWriting(fileName, encryptedContent);

    return encryptedContent;
  }


  private static List<String> contentEncryptor(List<char[]> contentByCharacters) {
    List<String> encryptedContent = new ArrayList<>();

    for (char[] line : contentByCharacters) {
      List<Character> lineAsCharList = new ArrayList<>();
      for (int i = 0; i < line.length; i++) {
        if (line[i] == ' ') {
          lineAsCharList.add(line[i]);
        } else {
          lineAsCharList.add(line[i] -= 1);
        }
      }
      StringBuilder newLine = new StringBuilder();
      for (Character ch : lineAsCharList) {
        newLine.append(ch);
      }
      encryptedContent.add(newLine.toString());
    }

    /*
    for (Character contentByCharacter : contentByCharacters) {
      charactersAsAscii.add((int) contentByCharacter);
    }
    for (int i = 0; i < charactersAsAscii.size(); i++) {
      operationList.add((char) (contentByCharacters.get(i) - 1));
    }

    for (int i = 0; i < operationList.size(); i++) {
      encryptedContent.add(String.valueOf((operationList.get(i))));
    }
*/
    return encryptedContent;
  }

  private static List<char[]> stringToCharacterList(List<String> rawContent) {
    List<char[]> characterList = new ArrayList<>();
    for (String line : rawContent) {
      characterList.add(line.toCharArray());
    }
    return characterList;
  }

  private static void fileWriting(String fileName, List<String> encryptedContent) {
    Path outputFilePath = Paths.get("src/FileIO/optional/encodedlines/" + fileName + "_encrypted");
    try {
      Files.write(outputFilePath, encryptedContent, StandardCharsets.UTF_8,
          StandardOpenOption.CREATE);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

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
