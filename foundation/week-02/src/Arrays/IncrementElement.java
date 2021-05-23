package Arrays;

import java.util.Arrays;

public class IncrementElement {

  //5. Increment element
  // Create an array variable named `numbers`
  //  with the following content: `[1, 2, 3, 4, 5]`
  //  Increment the third element
  //  Print the third element
  public static void main(String[] args) {
    int[] numbers5 = {1, 2, 3, 4, 5};
    numbers5[2] += 5;
    System.out.println(numbers5[2]);
    System.out.println(Arrays.toString(numbers5));
  }

}
