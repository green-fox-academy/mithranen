
// Create a function that divides number 10
// by a number that's passed as a parameter and prints the result.
// It should print "fail" if the parameter is 0

import java.util.Scanner;

public class DivideByZero {     //Error handling function
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your divisor: ");
    int divisor = scanner.nextInt();

    try { // Prevents the program breaking when attempting dividing by zero
      int result = 10 / divisor; // If the input value for divisor was 0 it stops the try block
      System.out.println(result); // The program doesn't reach this line if the input was 0
    } catch (ArithmeticException e) {
      System.out.println("Can't divide by zero!"); // This line only runs if the input was 0
    }
  }
}

//ArithmeticException --> math errors

