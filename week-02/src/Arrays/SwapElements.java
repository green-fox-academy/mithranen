package Arrays;

import java.util.Arrays;

public class SwapElements {

  // - Create an array variable named `orders`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `orders`
  public static void main(String[] args) {
    String[] orders = {"first", "second", "third"};
    String temp = "";

//    String temp2 = orders[0];
//    orders[0] = orders[2];
//    orders[2] = temp2;

    int num1 = 5;
    int num2 = 7;

    num1 = num1 + num2; //12
    num2 = num1 - num2; //5
    num1 = num1 - num2;     //7

//    int temp3 = num1;
//    num1 = num2;
//    num2 = temp3;
    System.out.println(num1 + " " + num2);

//    for (int i = 0; i < orders.length; i++) {
//      if (orders[i] == orders[0]) {
//        temp = orders[orders.length - 1];
//        orders[orders.length - 1] = orders[0];
//
//      }
//      if (orders[i] == orders[orders.length - 1]) {
//        orders[0] = temp;
//      }
//    }
//    System.out.println(Arrays.toString(orders));
  }
}

