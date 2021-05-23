package Functions;

public class FunctionFactorial {

  //  Create the usual class wrapper and main method on your own
// - Create a function called `calculateFactorial()`
//   that returns the factorial of its input
  public static void main(String[] args) {
    System.out.println(calculateFactorial(4));
  }

  public static int calculateFactorial(int num) {
    int factorial = 1;
    for (int i = 1; i <= num; i++) {
      factorial *= i;
    }
    return factorial;
  }
}
