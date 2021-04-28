package Testing.Anagram;

import java.util.Arrays;

//!Write a function, that takes two strings and returns a boolean value
// based on if the two strings are Anagramms or not.
//    Create a test for that.
public class Anagram {

  public boolean isAnagram(String firstString, String secondString) {
    if (firstString == null || secondString == null) {
      throw new IllegalArgumentException();
    }
    if (firstString.length() != secondString.length()) {
      return false;
    }

    char[] firstsCharArray = firstString.toLowerCase().toCharArray();
    char[] secondCharArray = secondString.toLowerCase().toCharArray();
    Arrays.sort(firstsCharArray);
    Arrays.sort(secondCharArray);
    for (int i = 0; i < firstsCharArray.length; i++) {
      if (firstsCharArray[i] != secondCharArray[i]) {
        return false;
      }
    }
    return true;
  }
}
