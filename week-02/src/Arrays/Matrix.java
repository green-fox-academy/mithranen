package Arrays;

public class Matrix {

  public static void main(String[] args) {
    //8. Matrix
    // - Create a two dimensional array dynamically with the following content.
    //   Note that a two dimensional array is often called matrix if every
    //   internal array has the same length.
    //   Use a loop!
    //
    //   1 0 0 0
    //   0 1 0 0
    //   0 0 1 0
    //   0 0 0 1
    //
    //   Its length should depend on a variable
    //
    // - Print this two dimensional array to the output
    int[][] matrix = new int[4][4];
    int fill = 1;

    System.out.println();
    for (int i = 0; i < matrix.length; i++) {

      for (int j = 0; j < matrix.length; j++) {
        if (i == j) {
          System.out.print(fill);
        } else {
          System.out.print("0");
        }
      }
      System.out.println();
    }

    System.out.println("------------------------");//Second solution

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        if (i == j) {
          System.out.print(fill);
        } else {
          System.out.print("0");
        }
      }
      System.out.println();
    }
  }
}
