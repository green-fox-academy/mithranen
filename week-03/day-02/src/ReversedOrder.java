import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {

  public static void main(String[] args) {
    // Create a method that decrypts reversed-order.txt
    List<String> text = readMyFile("data/reversed-order.txt");
    for (int i = 0; i < text.size(); i++) {
      System.out.println(text.get(text.size() - i - 1));
    }
  }

  public static List<String> readMyFile(String file) {
    try {
      Path filePath = Paths.get(file);
      return Files.readAllLines(filePath, StandardCharsets.UTF_8);
    } catch (IOException e) {
      e.printStackTrace();
      return null;
    }
  }
}

//Gergő megoldásai mainben
/*  List<String> text = readMyFile("data/reversed-order.txt");
    List<String> result = new ArrayList<>();

    for (int i = text.size() - 1; i >= 0; i--) {
      result.add(text.get(i));
    }

    for (String line : result) {
      System.out.println(line);
    }

    Path versePath = Paths.get("data/zen_of_Python.txt");
    try {
      Files.write(versePath, result);
    } catch (IOException e) {
      e.printStackTrace();
    }*/

//    for (int i = 0; i < result.size(); i++) {
//      System.out.println(result.get(i));
//    }
