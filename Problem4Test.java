import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Problem4Test {
  /* Checks whether it returns maxmimum element or not */
  @Test
  public void checkMaximumElement() {
    int[] arr = {4, 7, 0, 1, 2};

    Problem4 obj = new Problem4(arr);
    int max = obj.maximumElement(arr.length);

    assertEquals(7, max, 0);
  }

  /* Checks whether it returns correct fibonacci no or not */
  @Test
  public void checkFibonacciTerm() {
    int n = Problem4.fibonacci(5);
    assertEquals(8, n, 0);
  }
}
