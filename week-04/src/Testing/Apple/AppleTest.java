package Testing.Apple;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
//!Create a class, with one method (eg. public String getApple()) that returns a string (eg. "apple")
//!    Create a test for that.
//!    Create a test class
//!Create a test method
// !       Instantiate an Object from your class in the method
//!    Use the assertEquals()
//!   The expected parameter should be the same string (eg. "apple")
//!    The actual parameter should be the return value of the method (eg. myObject.getApple())
//!    Run the test
//!    Change the expected value to make the test failing
//!    Run the test
//!    Fix the returned value to make the test succeeding again

class AppleTest {


  @Test
  void testGetApple() {
    Apple apple = new Apple();
    String expected = "apple";
    String actual = apple.getApple();
    assertEquals(expected, actual);
  }
}