package problem2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class NumberTest {

  /* Checks whether it is an armstrong no. or not */
  @Test
  public void checkArmstrong() {
    Number obj = new Number(8208);
    boolean check = obj.isArmstrong();
    assertTrue(check);
  }

  /* Checks whethers correct factorial is computed or not  */
  @Test
  public void checkFactorial() {
    Number obj = new Number(6);
    double val = obj.getFactorial();
    assertEquals(720, val, 0);
  }

  /* Checks whethers correct sum of digits is computed or not  */
  @Test
  public void checkSumOfDigits() {
    Number obj = new Number(636.8);
    double val = obj.sumDigits();
    assertEquals(15, val, 0);
  }

  /* Checks whethers nos are reversed or not  */
  @Test
  public void checkReverse() {
    Number obj1 = new Number(636.8);
    double val1 = obj1.getReverse();
    assertEquals(8.636, val1, 0);

    Number obj2 = new Number(78);
    double val2 = obj2.getReverse();
    assertEquals(87, val2, 0);
  }
}
