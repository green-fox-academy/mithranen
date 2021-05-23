package matrix;

import java.util.Arrays;

public class Matrix2 {

  /**
   * Matrix rotate Create a function named rotateMatrix that takes an n×n integer matrix (array of
   * arrays) as parameter and returns a matrix which elements are rotated 90 degrees clockwise.
   * <p>
   * Example Input [ [1, 2, 3], [4, 5, 6], [7, 8, 9]
   * <p>
   * 00 01 02 10 11 12 20 21 22
   * <p>
   * 22 12 02 21 11 01 20 10 00
   * <p>
   * [9, 6, 3] [8, 5, 2] [7, 4, 1]
   * <p>
   * 3 6 9 2 5 8 1 4 7
   * <p>
   * ] Output [ [ 7, 4, 1 ], [ 8, 5, 2 ], [ 9, 6, 3 ] ]
   */
  public static void main(String[] args) {
    int[][] input = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };
    for (int[] array : input) {
      System.out.println(Arrays.toString(array));
    }
    System.out.println();
    int[][] output = viktorMethod(input);

    //test
    for (int[] array : output) {
      System.out.println(Arrays.toString(array));
    }

    System.out.println();
    int[][] output2 = rotator(input);

    //test
    for (
        int[] array : output2) {
      System.out.println(Arrays.toString(array));
    }
  }


  public static int[][] rotator(int[][] input) {
    int[][] output = new int[input[0].length][input.length];

    for (int i = 0; i < input.length; i++) {
      for (int j = 0; j < input[i].length; j++) {
        output[j][input.length - i - 1] = input[i][j];
      }
    }

    return output;
  }

  /**
   * * 00 01 02 * 10 11 12 * 20 21 22 * * 22 12 02 * 21 11 01 * 20 10 00
   */

  //balalsó/jobb felső tengelyre tükrözés
  public static int[][] viktorMethod(int[][] input) {
    checkInput(input);
    int[][] output = new int[input[0].length][input.length];

    for (int i = 0; i < input.length; i++) {
      for (int j = 0; j < input.length; j++) {
        output[input.length - j - 1][input.length - i - 1] = input[i][j];
      }
    }
    return output;
  }

  private static void checkInput(int[][] input) {
    for (int[] row : input) {
      if (input.length != row.length) {
        throw new IllegalArgumentException("are u kidding?");
      }
    }
  }
}
