package Arrays;

public class CompareLength {

  public static void main(String[] args) {
    //2. Compare length
    // - Create an array variable named `firstArrayOfNumbers`
    //   with the following content: `[1, 2, 3]`
    // - Create an array variable named `secondArrayOfNumbers`
    //   with the following content: `[4, 5]`
    int[] firstArrayOfNumbers = new int[]{1, 2, 3};
    int[] secondArrayOfNumbers = new int[]{4, 5};
    // - Print "secondArrayOfNumbers is longer" if `secondArrayOfNumbers` has more
    //   elements than `firstArrayOfNumbers`
    // - Otherwise print: "firstArrayOfNumbers is the longer one"
    if (firstArrayOfNumbers.length < secondArrayOfNumbers.length) {
      System.out.println("secondArrayOfNumbers is longer");
    } else {
      System.out.println("firstArrayOfNumbers is the longer one");
    }
  }
}
