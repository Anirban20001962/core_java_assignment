package problem1;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BoxTest {

  /* Checks correct area is returned or not  */
  @Test
  public void checkArea() {
    Box box = new Box(4, 5);
    double area = box.area();
    assertEquals(20, area, 0.0);
  }
}
