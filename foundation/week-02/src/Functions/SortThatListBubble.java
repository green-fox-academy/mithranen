package Functions;

import java.util.Arrays;
import java.util.Collections;

public class SortThatListBubble {

  public static void main(String[] args) {
    //  Create a function that takes an array of numbers as parameter
    //  and returns an array where the elements are sorted in ascending numerical order
    //  When you are done, add a second boolean parameter to the function
    //  If it is `true` sort the array descending, otherwise ascending

    //  Example:
    //System.out.println(bubble(new int[]{34, 12, 24, 9, 5}));
    //  should print [5, 9, 12, 24, 34]
    //System.out.println(advancedBubble(new int[]{34, 12, 24, 9, 5}, true));
    //  should print [34, 24, 12, 9, 5]

    int[] ex = new int[]{9, 1, 24, 4, 123};

    System.out.println(Arrays.toString(bubble(ex)));

    System.out.println(Arrays.toString(bubbleAdvanced(ex, true)));
  }

  public static int[] bubble(int[] arr) {
    //String arrStr2 = arr.toString(); TODO memory address
    //String arrStr = Arrays.toString(arr); TODO every array must like this to sout
    //System.out.println(arrStr);
    Arrays.sort(arr);
    Arrays.toString(arr);
    return arr;
  }

  public static int[] bubbleAdvanced(int[] arr, boolean sorting) {
    Arrays.sort(arr);
    if (!sorting) {
      return arr;
    }
//    for (int i = 0; i < arr.length; i++) {
//      Arrays.sort(arr, arr[arr.length - 1], arr[0]);
    else {
      Integer[] convertingArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
      Arrays.sort(convertingArr, Collections.reverseOrder());

      int[] reversedArr = Arrays.stream(convertingArr).mapToInt(Integer::intValue).toArray();
      return reversedArr;
    }
  }
}


