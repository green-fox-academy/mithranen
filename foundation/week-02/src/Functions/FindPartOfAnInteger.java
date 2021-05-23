package Functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindPartOfAnInteger {

  public static void main(String[] args) {
    //!  Create a function that takes a number and an array of integers as parameters
    //!  It returns the indices of the integers of the array which contain the given number
    //  or returns an empty array (if the number is not part of any of the integers in the array)

    //  Examples:
    System.out.println(Arrays.toString(subInt(1, new int[]{1, 11, 34, 52, 61})));
    //  should print: `[0, 1, 4]`
    System.out.println(Arrays.toString(subInt(9, new int[]{1, 11, 34, 52, 61})));
    //  should print: '[]'

    // Note: We are using Arrays.toString() function to print the array returned
    // You could just as well iterate over the array and print its items one by one

    subInt(2, new int[]{23, 42, 19, 82});
  }

  public static Object[] subInt(int num, int[] intArr) {

    List<Integer> indexes = new ArrayList<>();
    for (int i = 0; i < intArr.length; i++) {
      while (intArr[i] > 0) {
        if (intArr[i] % 10 == num) {
          indexes.add(i);
          break;
        }
        intArr[i] = intArr[i] / 10;
      }
    }
    return indexes.toArray();
  }
}

//      strAsChar = intArrAsStr.charAt(i);
//intArrAsStr.contains();

//return indices;

