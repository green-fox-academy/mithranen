package Testing.Sum;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//
//!Create a sum method in your class which has an ArrayList of Integers as parameter
//!    It should return the sum of the elements in the list
//!    Follow these steps:
//!    Add a new test case
//!    Instantiate your class
//!create a list of integers
//!        use the assertEquals to test the result of the created sum method
//!        Run them
//!        Create different tests where you test your method with:
//    an empty list
//!    a list that has one element in it
//!    a list that has multiple elements in it
//    a null
//    Run them
//    Fix your code if needed

class SumTest {

  //fields
  List<Integer> list;
  Sum sum;

  //InstanceBefore //kvázi constructor (de nem az!!!!)
  @BeforeEach
  public void setupList() {
    list = new ArrayList<>();
    sum = new Sum();
  }

  @Test
  void sumListAllElementCorrectly() {
    list.addAll(Arrays.asList(2, 5, 7, 3));
    //    list.add(2);
    //    list.add(5);
    //    list.add(7);
    //    list.add(3);
    //Sum sum = new Sum(); felesleges, kint is lehet pélfányosítani
    assertEquals(17, sum.sum(list));
  }

  //    a list that has one element in it
  @Test
  void sumOnlyOneElementCorrectly() {
    list.addAll(Arrays.asList(2));
    Sum sum = new Sum();
    assertEquals(2, sum.sum(list));
  }

  //    with empty list
  @Test
  void sumZeroElementCorrectly() {
    list.addAll(Arrays.asList());
    Sum sum = new Sum();
    assertEquals(0, sum.sum(list));
  }

  //    with an null list
  @Test
  void sumWithNullList() {
    assertThrows(IllegalArgumentException.class,
        () -> sum.sum(null));
  }
}