package Testing.Sum;

import java.util.List;

//
//!Create a sum method in your class which has an ArrayList of Integers as parameter
//!    It should return the sum of the elements in the list
//!    Follow these steps:
//    Add a new test case
//    Instantiate your class
//create a list of integers
//        use the assertEquals to test the result of the created sum method
//        Run them
//        Create different tests where you test your method with:
//    an empty list
//    a list that has one element in it
//    a list that has multiple elements in it
//    a null
//    Run them
//    Fix your code if needed
public class Sum {

  public int sum(List<Integer> list) {
    //int sum = list.stream().mapToInt(Integer::intValue).sum(); //ez mi tényleg jó?
    if (list == null) {
      throw new IllegalArgumentException();
    }

    int sum = 0;
    for (int kiskutya : list) {
      sum += kiskutya;
    }
    return sum;
  }
}
