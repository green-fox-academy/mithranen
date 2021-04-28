package Testing.CountLetters;

//Write a function, that takes a string as an argument and returns a dictionary with all letters
//    in the string as keys, and numbers as values that shows how many occurrences there are.
//    Create a test for that.

import java.util.HashMap;
import java.util.Map;

public class CountLetters {

  public Map<Character, Integer> makeDictionary(String word) {
    Map<Character, Integer> letters = new HashMap<>();
    for (char letter : word.toCharArray()) {
      if (letters.containsKey(letter)) {
        letters.put(letter, letters.get(letter) + 1);
      } else {
        letters.put(letter, 1);
      }
    }
    return letters;
  }
}
