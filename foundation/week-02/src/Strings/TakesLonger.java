package Strings;

public class TakesLonger {

  public static void main(String[] args) {
    //3. Takes longer
    String quote =
        "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

    // When saving this quote a disk error has occurred. Please fix it!
    // Insert the words "always takes longer than" between the words "It" and "you" using the StringBuilder class!
    // Use pieces of the quote variable (instead of just redefining the string)!
    StringBuilder sb = new StringBuilder(quote);
    System.out.println(sb.insert(20, " always takes longer than"));

  }
}
