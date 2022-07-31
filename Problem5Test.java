import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import org.junit.Test;
import problem5.Student;

public class Problem5Test {

  /* Checks whether joining is successfull or not  */
  @Test
  public void checkJoin() {
    ArrayList<Student> students1 = new ArrayList<>();
    ArrayList<Student> students2 = new ArrayList<>();

    Student obj11 = new Student("Anirban", "Mukherjee");
    Student obj12 = new Student("Ranjan", "Kumar");

    Student obj21 = new Student("Anirban", "Mukherjee");
    Student obj22 = new Student("Biswajit", "Ghosal");

    students1.add(obj11);
    students1.add(obj12);

    students2.add(obj21);
    students2.add(obj22);

    ArrayList<Student> expected = new ArrayList<>();
    expected.add(obj11);
    expected.add(obj12);
    expected.add(obj22);

    ArrayList<Student> students3 = Problem5.join(students1, students2);
    assertEquals(expected, students3);
  }

  /* Checks whether search is working or not  */
  @Test
  public void checkSearch() {
    ArrayList<Student> students1 = new ArrayList<>();

    Student obj11 = new Student("Anirban", "Mukherjee");
    Student obj12 = new Student("Ranjan", "Kumar");
    Student obj22 = new Student("Biswajit", "Ghosal");

    students1.add(obj11);
    students1.add(obj12);
    students1.add(obj22);

    Student found1 = Problem5.search(students1, "Ranjan", "Kumar");
    assertEquals(obj12, found1);

    Student found2 = Problem5.search(students1, "aaa", "Kumar");
    assertEquals(null, found2);
  }
}
