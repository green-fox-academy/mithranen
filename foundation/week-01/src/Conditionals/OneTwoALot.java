package Conditionals;

import java.util.Scanner;

public class OneTwoALot {

  public static void main(String[] args) {
    // Write a program that reads a number form the standard input,
    // If the number is zero or smaller it should print: Not enough
    // If the number is one it should print: One
    // If the number is two it should print: Two
    // If the number is more than two it should print: A lot
    System.out.println("Please, give a number:");
    Scanner userNumberInput = new Scanner(System.in);
    int userNumber = userNumberInput.nextInt();
    if (userNumber <= 0) {
      System.out.println("Not enough.");
    } else if (userNumber == 1) {
      System.out.println("One");
    } else if (userNumber == 2) {
      System.out.println("Two");
    } else {
      System.out.println("A lot");
    }
  }
}
