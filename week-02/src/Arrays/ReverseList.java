package Arrays;

import java.util.Arrays;

public class ReverseList {

  public static void main(String[] args) {
    // - Create an array variable named `numbers`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements of `numbers`
// - Print the elements of the reversed `numbers`
    int[] arr = {3, 4, 5, 6, 7};
    int[] tempArr = new int[arr.length];

    for (int i = 0; i < arr.length; i++) {
      tempArr[i] = arr[arr.length - 1 - i];
    }
//    arr=tempArr;
//    System.out.println(Arrays.toString(arr));
    System.out.println(Arrays.toString(tempArr));
  }
}
