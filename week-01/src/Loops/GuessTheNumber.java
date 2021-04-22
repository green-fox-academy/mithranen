package Loops;

import java.util.Scanner;

public class GuessTheNumber {

  // Write a program that stores a number and the user has to figure it out
// The user can input guesses
// After each guess the program would tell one of the following:
//
// The stored number is higher
// The stored number is lower
// You found the number: 8

  public static void main(String[] args) {
    int storedNumber = 8;
    Scanner sc = new Scanner(System.in);
    System.out.println("Guess the number! Give your tip: ");
    int userInput = sc.nextInt();
    while (userInput != storedNumber) {
      if (userInput > storedNumber) {
        System.out.println("The stored number is lower. Try again: ");
        //userInput = sc.nextInt(); felesleges, kiemelhető while végére
      }
      if (userInput < storedNumber) {
        System.out.println("The stored number is higher. Try again: ");
        //userInput = sc.nextInt();
      }
      userInput = sc.nextInt();
    }
    System.out.println("Congrats, eat your shirt!");
  }
}
