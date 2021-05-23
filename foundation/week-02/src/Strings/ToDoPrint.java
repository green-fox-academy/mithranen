package Strings;

public class ToDoPrint {

  public static void main(String[] args) {
    //4. Todo print
    String todoText = " - Buy milk\n";
    // Add "My todo:" to the beginning of the todoText
    // Add " - Download games" to the end of the todoText
    // Add " - Diablo" to the end of the todoText applying indention
    // Expected output:
    // My todo:
    //  - Buy milk
    //  - Download games
    //      - Diablo

    String firstPart = ("My todo:\n");
    String secondPart = ("- Download games\n - Diablo\n");
    todoText = firstPart.concat(todoText).concat(secondPart);
    System.out.println(todoText);
  }
}
