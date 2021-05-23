package Strings;

public class Reverse {

  public static void main(String[] args) {
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
