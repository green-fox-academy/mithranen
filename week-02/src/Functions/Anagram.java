package Functions;

//Exercise
//    !Create a function named isAnagram() following your current language's style guide.
//    !It should take two strings and return a boolean value depending on
//    whether it's an anagram or not.

//    Examples
//    input 1	input 2	output
//    "dog"	"god"	true
//    "green"	"fox"	false

import java.util.Arrays;

public class Anagram {

  public static void main(String[] args) {
    System.out.println(isAnagram("dog", "gof"));
    System.out.println(isAnagram("asdf", "sfda"));
    System.out.println(isAnagram("Géza kék az ég", "Géza kék az ég"));
  }

  public static boolean isAnagram(String str1, String str2) {
    char[] charArr = str1.replaceAll(" ", "").toLowerCase().toCharArray();
    char[] charArr2 = str2.replaceAll(" ", "").toLowerCase().toCharArray();
    Arrays.sort(charArr);
    Arrays.sort(charArr2);

    System.out.println("***************");

    System.out.println(str1);
    System.out.println(charArr);
    System.out.println(Arrays.toString(charArr));

    System.out.println("***************");
    if (str1.length() != str2.length()) {
      return false;
    }
    for (int i = 0; i < charArr.length; i++) {
      if (charArr[i] != charArr2[i]) { //TODO [i] nélkül miért nem műküdik?
//      if (charArr.equals(charArr2)) { //TODO [i] nélkül miért nem műküdik?

        return false;
      }
    }
    return true;
  }
}

//TODO == memory address are same? (if two variables show to the same),
// for primitive tpye are the same?
//TODO equals complex variables, Object, arrays, List/Map, OWN objects (if content equals)
