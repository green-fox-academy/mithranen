package Testing.Fibonacci;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//
//Write a function that computes a member of the fibonacci
//    sequence by a given index
//    Create tests for multiple test cases.
public class Fibonacci {

  public static void main(String[] args) {
    System.out.println(getFibonacciByIndex(4));
  }

  //methods
  public static long getFibonacciByIndex(int givenIndex) {
    if (givenIndex > 101) {
      throw new IllegalArgumentException(
          "This list is not able to show you more than 101 member of fibonacci!");
    }
    //fibonacci

    List<Long> fibonacciList = new ArrayList<>();
    long firstNum = 0;
    fibonacciList.add(firstNum);
    long secondNum = 1;
    fibonacciList.add(secondNum);

    for (int i = 0; i < 100; i++) {             ///h lesz végtelen?
      long thirdNum = firstNum + secondNum;
      fibonacciList.add(thirdNum);
      firstNum = secondNum;
      secondNum = thirdNum;
    }

    for (Long fibonacciNum : fibonacciList) {
      if (fibonacciList.get(givenIndex).equals(fibonacciNum)) {
        return fibonacciNum;
      }
    }
    return 0;
  }
}



  /*public static void main(String[] args) {


    List<Long> fibonacci = makeFibonacci();

    System.out.println(makeFibonacci());

    System.out.println(getFibonacciIndex(fibonacci, 6));

  }

  //methods
  public static List<Long> makeFibonacci() {
    long firstNum = 0L;
    long secondNum = 1L;
    // if Fibonacci number is less than 2,
    // its index will be same as number
    //if (n <= 2) {
    //return n;

    //fibonacci
    List<Long> fibonacciList = new ArrayList<>();
    fibonacciList.add(firstNum);
    fibonacciList.add(secondNum);
    //System.out.print(firstNum + ", " + secondNum);
    for (int i = 0; i < 100; i++) {             ///h lesz végtelen?
      long thirdNum = firstNum + secondNum;
      //System.out.print(", " + thirdNum);
      fibonacciList.add(thirdNum);
      firstNum = secondNum;
      secondNum = thirdNum;
    }
    return fibonacciList;
  }

  public static long getFibonacciIndex(List<Long> list, int givenIndex) {
    for (Long fibonacciNum : list) {
      if (list.get(givenIndex).equals(fibonacciNum)) {
        return fibonacciNum;
      }
    }
    return 0;
  }*/
