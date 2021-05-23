package Loops;

public class CountFromTo {

  public static void main(String[] args) {
    // Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5
    int numA = 1 * 45;
    double numB = 5.24 * 10.82;
    if (numA >= numB) {
      System.out.println("The second number should be bigger");
      System.out.println(numA + "\n" + numB);
    } else {
      int numBTheBigger = (int) numB-numA;
      for (int i = 0; i < numBTheBigger-1; i++) {
        System.out.println(++numA);
      }
      System.out.println(numB);
    }
  }
}
