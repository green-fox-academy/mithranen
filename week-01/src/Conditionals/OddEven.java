package Conditionals;

import java.util.Scanner;
import org.w3c.dom.ls.LSOutput;

public class OddEven {

  public static void main(String[] args) {
    // Write a program that reads a number from the standard input,
    // then prints "Odd" if the number is odd, or "Even" if it is even
    System.out.println("Please, give your number:");
    Scanner userNumberInput = new Scanner(System.in);
    int userNumber = userNumberInput.nextInt();
    if (userNumber % 2 == 0) {
      System.out.println("Your number is even.");
    } else {
      System.out.println("Your number is odd.");
    }
  }
}