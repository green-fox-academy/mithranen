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
import java.util.Locale;

public class Swearing2 {

  public static void main(String[] args) {
    ArrayList<String> forbiddenWiords = new ArrayList<>(Arrays
        .asList("fuckstick", "fucker", "bloody", "cock", "shit", "asshole", "dick", "piss",
            "cunt", "fuck"));
    String fileNAme = "src/swearing/content2";
    try {
      int result = removeSwearWords(fileNAme, forbiddenWiords);
      System.out.println(result);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }


  public static int removeSwearWords(String fileName, ArrayList<String> forbiddenWords)
      throws IOException {
    Path path = Paths.get(fileName);
    List<String> lines = Files.readAllLines(path);
    ArrayList<String> cleanRows = new ArrayList<>();

    int counter = 0;
    for (String line : lines) {
      String polishedLine = line.replaceAll("\\.", "").replaceAll(",", "")
          .toLowerCase(Locale.ROOT);
      //regex "." --> minden törlés, "\\." tényleg csak egy pontra gondoltam, "(?i)" casesensitive regex
      //replaceAll --> de menne marad a stick és a cunt
      String[] splittedLine = polishedLine.split(" ");
      for (String word : splittedLine) {
        if (forbiddenWords.contains(word)) {
          line = line.replaceAll("(?i)" + word, "");
          counter++;
        }
      }
      cleanRows.add(line);
    }
    Files.write(path, cleanRows);
    return counter;
  }
}
