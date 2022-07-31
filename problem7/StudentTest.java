package problem7;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StudentTest {
  /* Checks whether compareTo is working as expected  */
  @Test
  public void checkComparison() {
    Student obj1 = new Student(1, "Anirban");
    Student obj2 = new Student(2, "Ronaldo");

    boolean result = obj1.compareTo(obj2) < 0;
    assertTrue(result);
  }
}
