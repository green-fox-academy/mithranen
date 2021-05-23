package Loops;

public class DrawChessTable {

  // Crate a program that draws a chess table like this
//
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
//
  public static void main(String[] args) {
    String[][] chessTable = new String[8][8];
    for (int j = 0; j < 8; j++) {
      for (int i = 0; i < 8; i++) {
        if (i % 2 == 0 && j % 2 == 0) {
          System.out.print("%");
        } else if (i % 2 != 0 && j % 2 == 0) {
          System.out.print(" ");
        }
        if (i % 2 != 0 && j % 2 != 0) {
          System.out.print("%");
        } else if (i % 2 == 0 && j % 2 != 0){
          System.out.print(" ");
        }
      }
      System.out.println();
    }

    //cigány módon
//    for (int j = 0; j < 8; j++) {
//      if (j % 2 != 0) {
//        System.out.print(" ");
//      }
//      for (int i = 0; i < 8; i++) {
//        if (i % 2 == 0) {
//          System.out.print("%");
//        } else {
//          System.out.print(" ");
//        }
//      }
//      System.out.println();
//    }
  }
}
