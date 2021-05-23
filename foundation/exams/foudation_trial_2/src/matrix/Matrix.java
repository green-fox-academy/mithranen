package matrix;

import java.util.Arrays;

//### Matrix rotate
//
//    Create a function named `rotateMatrix` that takes an n×n integer matrix (array of arrays) as parameter
//    and returns a matrix which elements are rotated 90 degrees clockwise.
//
//    #### Example
//
//    Input
//    ```
//    [
//    [1, 2, 3],
//    [4, 5, 6],
//    [7, 8, 9]
//    ]
//    ```
//
//    Output
//    ```
//    [ [ 7, 4, 1 ],
//    [ 8, 5, 2 ],
//    [ 9, 6, 3 ]
//    ]
//    ```
public class Matrix {

  public static void main(String[] args) {

    int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    int[][] outputMatrix = rotateMatrix(matrix);
    for (int[] arr : outputMatrix) {
      System.out.println(Arrays.toString(arr));
    }

  }


  public static int[][] rotateMatrix(int[][] matrix) {
    int[][] output = new int[matrix[0].length][matrix.length];

    for (int i = 0; i < matrix.length; i++) {
      if (matrix.length != matrix[i].length) {
        throw new IllegalArgumentException(
            "Not a symmetric (n×n) matrix, rows and columns not equals!");
      }
      //Gergő szerint nem kó
      //for (int j = matrix[i].length - 1; j >= 0; j--) {
      for (int j = 0; j < matrix[i].length; j++) {
        output[j][matrix[i].length - i - 1] = matrix[i][j];
      }
    }
    return output;
  }


}


