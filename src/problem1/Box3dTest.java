package src.problem1;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Box3dTest {
  /* Checks correct area is calculated or not */
  @Test
  public void checkArea() {
    Box3d box3d = new Box3d(4, 5, 6);
    double area = box3d.area();
    assertEquals(148, area, 0.0);
  }

  /* Checks correct volume is calculated or not  */
  @Test
  public void checkVolume() {
    Box3d box3d = new Box3d(4, 5, 6);
    double volume = box3d.volume();
    assertEquals(120, volume, 0.0);
  }
}
