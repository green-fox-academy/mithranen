package FileIO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

// Create a method that decrypts the duplicated-chars.txt.
// Decryption is the process reversing an encryption, i.e. the process
// which converts encrypted data into its original form.
public class Doubled {

  public static void main(String[] args) throws IOException {
    Path filePath = Paths.get("src/FileIO/data/doubled");
    String fileNameStr = "src/FileIO/data/doubled";

    System.out.println(fileDecryptor(fileNameStr));
  }

  public static List<String> fileDecryptor(String pathStr)
      throws NoSuchElementException, IOException {
    Path filePath = Paths.get(pathStr);
    List<String> inputFile = new ArrayList<>();

    //Exception handling
    if (!Files.exists(filePath)) {
      throw new FileNotFoundException("File does not exist!");
    }
    if (!Files.isReadable(filePath)) {
      throw new UnsupportedOperationException("File not readable!");
      //TODO READONLY excp?
    }

    try {
      inputFile = Files.readAllLines(filePath, StandardCharsets.UTF_8);
    } catch (IOException e) {
      e.printStackTrace();
      //System.err.println("Other file reading problem!"); not necessary
    }

    //File convert to String
    StringBuilder output = new StringBuilder();

    for (String line : inputFile) {
      for (int i = 0; i < line.length(); i += 2) {
        output.append(line.charAt(i));
      }
      output.append("\n");
    }

    //String text into String list
    //List <String> textWriteInto = Collections.singletonList(output.toString());
    List<String> textWriteInto = new ArrayList<>();
    textWriteInto = Arrays.asList(output.toString());

    //Converted text write into new file
    Path outPutPath = Paths.get(pathStr + "_encrypted");

    Files.write(outPutPath, textWriteInto, StandardCharsets.UTF_8, StandardOpenOption.CREATE);

    //TODO miért nem működik ezzel?
    //Files.write(outPutPath, textWriteInto, StandardCharsets.UTF_8, StandardOpenOption.WRITE);

    return textWriteInto;
  }
}
