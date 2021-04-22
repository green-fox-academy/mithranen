package Loops;

import java.util.Scanner;

public class DrawDiagonal {

  public static void main(String[] args) {
// Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %%  %
// % % %
// %  %%
// %%%%%
//
// The square should have as many lines as the number was
    Scanner scanner = new Scanner(System.in);
    System.out.println("Give a number:");
    int side = scanner.nextInt();

    for (int i = 0; i < side; i++) {
      for (int j = 0; j < side; j++) {
        if (i == 0 || i==side-1 || j==side-1 || j==0 || j==i) {
          System.out.print("%");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}

/*
        } else if (i == side - 1) {
          System.out.print("%");
        } else if (j == side - 1) {
          System.out.print("%");
        } else if (j == 0) {
          System.out.print("%");
        } else if (j == i) {
          System.out.print("%");*/

