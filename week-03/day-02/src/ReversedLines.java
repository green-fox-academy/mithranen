import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
//Erik megoldása alapján
public class ReversedLines {

  public static void main(String[] args) {
    String fileName = "data/reversed-lines.txt";
    List<String> lines = readAllLines(fileName);
    for (String line : lines
    ) {
      System.out.println(reverseLine(line));
    }
  }

  public static List<String> readAllLines(String fileName) {
    List<String> lines;
    try {
      //lines = Files.readAllLines(Paths.get("data/reversed-lines.txt"));
      //return lines;
      return Files.readAllLines(Paths.get(fileName));
    } catch (IOException e) {
      System.err.println("File could not be read.");
      return null;
    }
  }

  public static String reverseLine(String line) {
    StringBuilder sb = new StringBuilder(line);
   // sb.append(line); ha lenne más hozzáfűznivaló akkor appendálna
   sb.reverse();
   return sb.toString();
  }
  }
