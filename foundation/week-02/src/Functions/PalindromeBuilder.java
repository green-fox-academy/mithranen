package Functions;

import java.util.Arrays;

public class PalindromeBuilder {
//  Exercise
//  Create a function named createPalindrome() following your current language's style guide.
//  It should take a string, create a palindrome from it and then return it.
//
//  Examples
//    input	output
//    ""	""
//    "greenfox"	"greenfoxxofneerg"
//    "123"	"123321"

  public static void main(String[] args) {
    String palindrome = "";
    String word = "Géza";
    char[] charsWord = word.toCharArray();
    System.out.println(Arrays.toString(charsWord));

    createPalindrome(word);
    System.out.println(createPalindrome2(word));

    System.out.println("******************");

    System.out.println(createPalindrome(word));
  }

  public static String createPalindrome(String word) {
    char[] charsWord = word.toCharArray();
    char[] temp = word.toCharArray();

    for (int i = 0; i < charsWord.length; i++) {
      temp[i] = charsWord[charsWord.length - 1 - i];
    }

    return word + String.valueOf(temp);
  }

  //Miki megoldása
  public static String palindromeBuilder3(String input) {
    for (int i = input.length() - 1; i > -1; i--) { //i>=0;
      input = input + input.charAt(i);
    }
    return input;
  }

  //Tomi megoldása
  private static String createPalindrome2(String word) {
    char[] ch = new char[word.length()];

    for (int i = 0; i < word.length(); i++) {
      ch[i] = word.charAt(word.length() - 1 - i);
    }

    return word.concat(String.valueOf(ch));
  }
}
