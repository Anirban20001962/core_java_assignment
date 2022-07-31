package src.problem5;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StudentTest {
  @Test
  public void checkStringFormat() {
    Student student = new Student("Anirban", "Mukherjee");

    String strFromat = student.toString();
    assertEquals("Anirban Mukherjee", strFromat);
  }

  @Test
  public void checksEquality() {
    Student s = new Student("Anirban", "Mukherjee");
    Student p = new Student("Anirban", "Mukherjee");
    Student c = new Student("Ranjan", "Kumar");

    Boolean status1 = s.equals(p);
    Boolean status2 = s.equals(c);

    assertEquals(true, status1);
    assertEquals(false, status2);
  }
}
