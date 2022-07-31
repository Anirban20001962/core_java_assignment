package src;
import static org.junit.Assert.assertEquals;

import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import src.problem6.Student;

public class Problem6Test {
  Problem6 obj = new Problem6();

  @Before
  public void init() {
    obj.addStudent(1, "Anirban Mukherjee", "anirbandhakuria@gmail.com");
    obj.addStudent(2, "Ranjan Kumar", "ranjan@gmail.com");
    obj.addStudent(3, "Anish Dey", "aaaaa@gmail.com");
  }

  @After
  public void clear() {
    obj.getStudents().clear();
  }

  /*Checks whether correct student is returned using an Id*/
  @Test
  public void checkStudent() {
    Student f = obj.getStudentById(1);
    assertEquals("Anirban Mukherjee", f.getName());
  }

  /*Checks whether it returns the correct sorted order*/
  @Test
  public void checkAllSorts() {
    List<Student> studentsByName = obj.getSortedStudentsByName();
    assertEquals("Anirban Mukherjee", studentsByName.get(0).getName());

    List<Student> studentsByEmail = obj.getSortedStudentsByEmail();
    assertEquals("Anish Dey", studentsByEmail.get(0).getName());
  }

  /* Check whether correct student is order using email and name */
  @Test
  public void checkSearch() {
    Student found =
        obj.getStudentByNameAndEmail("Anish Dey", "aaaaa@gmail.com");

    assertEquals("Anish Dey", found.getName());
  }
}
