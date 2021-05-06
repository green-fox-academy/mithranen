package Testing.Fibonacci;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FibonacciTest {

  @Test
  void getFibonacciNum_fromGivenIndex_2() {

    long expected = 1;
    long actual = Fibonacci.getFibonacciByIndex(2);
    assertEquals(expected, actual);
  }

  @Test
  void getFibonacciNum_fromGivenIndex_3() {

    long expected = 2;
    long actual = Fibonacci.getFibonacciByIndex(3);
    assertEquals(expected, actual);
  }
}