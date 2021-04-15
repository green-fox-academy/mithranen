public class FunctionAppendA {

  //  Create the usual class wrapper and main method on your own
  public static void main(String[] args) {
// - Create a string variable named `typo` and assign the value `Chinchill` to it
    String typo = "Chinchill";
// - Write a function called `appendA()` that gets a string as an input,
//   appends an 'a' character to its end and returns the modified string
    System.out.println(appendA(typo));
// - Print the result of `appendA(typo)`
  }

  public static String appendA(String input) {String result= input + "a";
    return result;
  }
}

