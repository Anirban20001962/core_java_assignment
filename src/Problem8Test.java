package src;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class Problem8Test {

  /* Checks whether addNumbers method  is working properly or not */
  @Test
  public void checkSum() {
    List<Integer> a = new ArrayList<>();
    List<Number> b = new ArrayList<>();

    a.add(4);
    a.add(5);

    b.add(2);
    b.add(3.8);

    double sumA = Problem8.addNumbers(a);
    assertEquals(9, sumA, 0);
    double sumB = Problem8.addNumbers(b);
    assertEquals(5.8, sumB, 0);
  }
}
