import java.util.Arrays;

public class SymmetricMatrix {

  public static void main(String[] args) {
    // matrix with numbers making method true
    int[][] symmetricMatrix = new int[][]{{1, 0, 1}, {0, 2, 2}, {1, 2, 5}};

    System.out.println(isSymmetric(symmetricMatrix));
    System.out.println("-------------------");

    // matrix with numbers making method true
    int[][] matrixNonSymmetric = {{7, 7, 7}, {6, 5, 7}, {1, 2, 1}};

    System.out.println(isSymmetric(matrixNonSymmetric));

  }

  public static boolean isSymmetric(int[][] kiskutya) {
    for (int i = 0; i < kiskutya.length; i++) {
      //if it not nxn matic
      if (kiskutya.length != kiskutya[i].length) {
        throw new IllegalArgumentException("It's not a symmetcil Matrix, values can't be symmetril!"
            + "Give the same number for rows and columns!");
      }
      for (int j = 0; j < kiskutya[i].length; j++) {
        System.out.print(kiskutya[i][j] + " ");
        if (kiskutya[i][j] != kiskutya[j][i]) {
          return false;
        }
      }
      System.out.println();
    }
    return true;
  }
}
// Show how it workjs
//public static boolean isSymmetric(int[][] kiskutya) {
//  boolean isSymmetric = true;
//  for (int i = 0; i < kiskutya.length; i++) {
//    for (int j = 0; j < kiskutya[i].length; j++) {
//      if (kiskutya[i][j] != kiskutya[j][i]) {
//        isSymmetric = false;
//        break;
//      }
//    }
//  }
//  return isSymmetric;
//}

//If you want
//      if (kiskutya.length != kiskutya[i].length) {
//        throw new IllegalArgumentException("It's not a symmetcil Matrix, values can't be symmetril!"
//            + "Give the same number for rows and columns!");

//  --> give a space after each values during same iteration
//          System.out.print(kiskutya[i][j] + " "