public class FunctionSumming {

  public static void main(String[] args) {
    // Create the usual class wrapper and main method on your own
    int endNum = 5;
    System.out.println(sum(endNum));
  }

  // Write a function called `sum()` that returns the sum of numbers from zero to the given parameter
  public static int sum(int endNum) {
    int result = 0;
    for (int i = 0; i <= endNum; i++) {
      result += i; //
    }
    return result;
  }
}
