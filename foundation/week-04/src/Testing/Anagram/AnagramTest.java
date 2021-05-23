package Testing.Anagram;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

//Write a function, that takes two strings and returns a boolean value
// based on if the two strings are Anagramms or not.
//    Create a test for that.

class AnagramTest {

  //fields
  Anagram anagram = new Anagram();

  @Test
  void isAnagramCorrect() {
    String word1 = "étel";
    String word2 = "élet";
    String word3 = "dráma";
    String word4 = "madár";
    assertTrue(anagram.isAnagram(word1, word2));
    assertTrue(anagram.isAnagram(word4, word3));
  }

  @Test
  void isAnagramFalse() {
    String word2 = "élet";
    String word3 = "dráma";
    assertFalse(anagram.isAnagram(word2, word3)); /*not true --> itt says*/
  }
}