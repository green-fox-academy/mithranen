package swearing;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.AccessDeniedException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Swearing {

  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("I love you motherfucker");
    System.out.println(sb.indexOf("love"));
    System.out.println(sb.indexOf("I"));
    //
    System.out.println(sb.replace(2, "love".length() + 3, ""));
    System.out.println(sb.replace(0, 1, "*"));

    Path inputfilePath = Paths.get("src/swearing/content");
    String inputFileName = "src/swearing/content";

    try {
      swearingCleaner(inputFileName);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (AccessDeniedException e) {
      e.printStackTrace();
    }
  }


  public static int swearingCleaner(String fileName)
      throws FileNotFoundException, AccessDeniedException {
    //Creating fields!
    Path filePath = Paths.get(fileName);
    List<String> inputFile = new ArrayList<>();
    List<String> swearWords = new ArrayList<>(Arrays
        .asList("bloody", "cock", "shit", "fucker", "fuckstick", "asshole", "dick", "piss",
            "cunt", "fuck", "Bloody", "Cock", "Shit", "Fucker", "Fuckstick", "Asshole", "Dick",
            "Piss", "Cunt", "Fuck"));
    int counter = 0;

    //Reading from path into input file and exceptions handling
    if (!Files.exists(filePath)) {
      throw new FileNotFoundException("File does not exist!");
    }
    if (!Files.isReadable(filePath)) {
      throw new AccessDeniedException("File not readable!");
    }

    try {
      inputFile = Files.readAllLines(filePath, StandardCharsets.UTF_8);
    } catch (IOException e) {
      e.printStackTrace();
    }

    //Making Stringbuilder from input file, and adding lines step by step
    StringBuilder outputFile = new StringBuilder();
    for (String line : inputFile) {
      outputFile.append(line + "\n");
    }

    //Replace and counting swear words
    for (String badWord : swearWords) {
      while (outputFile.indexOf(badWord) > -1) {
        outputFile.replace(outputFile.indexOf(badWord),
            badWord.length() + outputFile.indexOf(badWord) + 1, "");
        counter += 1;
      }
    }

    //Counter sout
    System.out.println(counter);

    //Write Stringbuilder into output file
    Path outPutPath = Paths.get(filePath + "_without_swearing");

    try {
      Files.write(outPutPath, Arrays.asList(outputFile), StandardCharsets.UTF_8,
          StandardOpenOption.CREATE);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return counter;
  }
}

//for (String badWords : outputFile.indexOf()) {

/*        String input = "....";
        for (word:
        badWords) {*/

//input = input.replace(word, ""); // which can be improved to return a
// number of `*` matching that length of
// the bad word it replaces.
