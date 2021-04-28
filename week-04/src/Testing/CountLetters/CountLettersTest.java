package Testing.CountLetters;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;
import org.junit.jupiter.api.Test;

//Write a function, that takes a string as an argument and returns a dictionary with all letters
//    in the string as keys, and numbers as values that shows how many occurrences there are.
//    Create a test for that.

class CountLettersTest {

  //fields
  CountLetters dictionary = new CountLetters();

  @Test
  void makeDictionaryWorkCorrectly() {
    String word = "megkelkáposztalanítás";
    Map<Character, Integer> map = dictionary.makeDictionary(word);
    assertEquals(1, map.get('m'));
    assertEquals(2, map.get('l'));
  }
}