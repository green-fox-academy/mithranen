package Testing.Fibonacci;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

//
//Write a function that computes a member of the fibonacci
//    sequence by a given index
//    Create tests for multiple test cases.
public class Fibonacci {

  public static void main(String[] args) {

    long firstNum = 0;
    long secondNum = 1;
    List<Long> fibonacci = makeFibonacci(firstNum, secondNum);

    System.out.println(makeFibonacci(firstNum, secondNum));

    System.out.println(getFibonacciIndex(fibonacci, 10));

  }

  //methods
  public static List<Long> makeFibonacci(long firstNum, long secondNum) {
    // if Fibonacci number is less than 2,
    // its index will be same as number
    //if (n <= 2) {
    //return n;

    //fibonacci
    List<Long> fibonacciList = new ArrayList<>();
    fibonacciList.add(firstNum);
    fibonacciList.add(secondNum);
    //System.out.print(firstNum + ", " + secondNum);
    for (int i = 0; i < fibonacciList.size(); i++) {             ///h lesz végtelen?
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
      if (list.get(givenIndex) == fibonacciNum) {
        return fibonacciNum;
      }
    }
    return 0;
  }
}

