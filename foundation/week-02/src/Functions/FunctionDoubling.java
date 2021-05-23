package Functions;

public class FunctionDoubling {

  public static void main(String[] args) {
// - Create an integer variable named `baseNumber` and assign the value `123` to it
    int baseNumber = 123;
    //doubleNumber(baseNumber); szükségtelen
// - Create a function called `doubleNumber()` that doubles its integer input parameter
//   and returns the doubled value
// - Print the result of `doubleNumber(baseNumber)`

    baseNumber=doubleNumber(baseNumber);
    System.out.println(baseNumber);

}

  public static int doubleNumber(int receivedNumber) {
    int result = receivedNumber * 2;
    return result;
  }
}