package Arrays;

import java.util.Arrays;

public class ChangeElement {

  public static void main(String[] args) {
    //4. Change  element
    // - Create an array variable named `numbers`
    //   with the following content: `[1, 2, 3, 8, 5, 6]`
    // - Change the value of the fourth element (8) to 4
    // - Print the fourth element
    int[] numbers4 = {1, 2, 3, 8, 5, 6};
    numbers4[3] = 4;
    System.out.println(numbers4[3]);
    System.out.println(Arrays.toString(numbers4));
  }
}
