package Arrays.homeExercises;

import java.util.Scanner;

public class Arrays_home_function {

  static double myPI = 3.14159; //Class variable

  public static void main(String[] args) {
//accessModifier static returnType void/methodNa me ()
    addThem(1, 2);
    System.out.println("Global" + myPI);

  }

  public static int addThem(int a, int b) {
    double smallPI = 3.140;
    double myPI = 3.0;
    System.out.println("Local" + myPI);
    return 1;
  }
}