package Loops;

import java.util.Scanner;

public class DrawPyramid {

  // Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Give a number: ");
    int userInput = scanner.nextInt();
    //int userInput = 4;
    for (int i = 1; i <= userInput; i++) {
      for (int j = i; j < userInput; j++) {
        System.out.print(" ");
      }
      for (int k = userInput; k >= userInput - (i * 2 - 2); k--) {
        System.out.print("*");
      }

      System.out.println();
    }
  }
}

