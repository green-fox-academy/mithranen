import java.lang.String;
import java.lang.StringBuilder;
import java.lang.System;

public class StringsAll {

  public static void main(String... args) {

    //----------------------------------------------------

    //1. Simple Replace
    // I would like to replace "dishwasher" with "galaxy" in this example variable, but it has a problem
    // Please fix it for me!
    // Expected output: In a galaxy far far away
    String example = "In a dishwasher far far away";
    System.out.println(example.replace("dishwasher", "galaxy"));

    //----------------------------------------------------

    //2. Url fixer
    // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
    // Also, the URL is missing a crucial component, find out what it is and insert it too!
    // Try to solve it more than once using different String functions!

    String url = "https//www.reddit.com/r/nevertellmethebots";
    /*url=url.replace("bots","odds");
    url=url.replace("//", "://");*/
    url = url.replace("bots", "odds").replace("//", "://");
    System.out.println(url);

    //----------------------------------------------------

    //3. Takes longer
    String quote =
        "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

    // When saving this quote a disk error has occurred. Please fix it!
    // Insert the words "always takes longer than" between the words "It" and "you" using the StringBuilder class!
    // Use pieces of the quote variable (instead of just redefining the string)!
    StringBuilder sb = new StringBuilder(quote);
    System.out.println(sb.insert(20, " always takes longer than"));

    //----------------------------------------------------

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

    //----------------------------------------------------

    //5. Reverse
    String toBeReversed =
        ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

    // Create a method that can reverse a String which is passed as parameter
    // Pass the toBeReversed variable to this method to check if it works well
    // Solve this task using charAt() function first
    // Try other solutions when you are done
    System.out.print(reverse(toBeReversed));
  }

  public static String reverse(String input) {
    String result = "";
    for (int i = 0; i < input.length(); i++) {
      int lastIndexOfInput = input.length() - 1; //input stinrg utolsó értékének indexe!!!
      char solutionChar = (input.charAt(lastIndexOfInput - i)); //átfordítva a feladat megoldása,
      result += String.valueOf(solutionChar);
      // helyes string
      //System.out.print(input.charAt(lastIndexOfInput));
      //System.out.print(input.charAt(input.length()-1-i));
      //System.out.println(i);                              //adott iterációja a ciklusnak
      //System.out.println(lastIndexOfInput-i);             //adott ciklusban fordított arányosan
      // az input string karaktere

      //System.out.print(input.charAt(lastIndexOfInput-i));
    }
    return result;

    /* Miki megoldása
    public class Reverse {
  public static void main(String... args) {
    String toBeReversed =
        ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
    // Create a method that can reverse a String which is passed as parameter
    // Pass the toBeReversed variable to this method to check if it works well
    // Solve this task using charAt() function first
    // Try other solutions when you are done
    System.out.println(toBeReversed.length());
    for (int i = toBeReversed.length() - 1; i > -1; i--) {
      System.out.print(toBeReversed.charAt(i));
      Reverser(toBeReversed);
    }
  }
  public static String Reverser(String input) {
    String output ="";
    for (int i = input.length() - 1; i > -1; i--) {
      output += String.valueOf(input.charAt(i));
    }
  return output;}
}
    */

  }
}