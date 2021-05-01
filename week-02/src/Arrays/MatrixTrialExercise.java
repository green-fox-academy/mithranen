package Arrays;

public class MatrixTrialExercise {

  public static void main(String[] args) {
    // matrix with numbers making method true
    int[][] symmetricMatrix = new int[][]
        {
            {1, 0, 1},
            {0, 2, 2},
            {1, 2, 5}
        };

    //matrix first and last values!!!
    System.out.println(symmetricMatrix[0][0]);
    System.out.println(symmetricMatrix[2][2]);

    System.out.println("-------------------");
    System.out.println("Symmetric matrix:");
    matrix(symmetricMatrix);
    System.out.println("-------------------");

    // matrix with numbers making method true
    int[][] matrixNonSymmetric = {{7, 7, 7}, {6, 5, 7}, {1, 2, 1}};
    System.out.println("Non symmetric matrix:");
    matrix(matrixNonSymmetric);

  }

  public static void matrix (int[][] kiskutya) {
    for (int i = 0; i < kiskutya.length; i++) {
      for (int j = 0; j < kiskutya[i].length; j++) {
        //  --> give a space after each values during same iteration
        System.out.print(kiskutya[i][j] + " ");
      }
      System.out.println();
    }

  }  public static boolean isSymmetric (int[][] kiskutya) {
    for (int i = 0; i < kiskutya.length; i++) {
      for (int j = 0; j < kiskutya[i].length; j++) {
        //  --> give a space after each values during same iteration
        System.out.print(kiskutya[i][j] + " ");
      }
      System.out.println();
    }
    return true;
  }
}
