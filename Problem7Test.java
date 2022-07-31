import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import problem7.Student;

public class Problem7Test {
  Problem7 obj = new Problem7();

  @Before
  public void init() {
    this.obj.addStudent(1, "Debopriyo");
    this.obj.addStudent(4, "Biswajit");
    this.obj.addStudent(2, "Anirban");
  }

  @After
  public void clear() {
    this.obj.getStudents().clear();
  }

  /* It checks wheteher treeSet return the data in correct order or not */
  @Test
  public void checkSortedOrder() {
    List<String> results = new ArrayList<>();
    TreeSet<Student> students = this.obj.getStudents();

    String[] names = {"Anirban", "Biswajit", "Debopriyo"};

    for (Student s : students) {
      results.add(s.getName());
    }
    assertArrayEquals(names, results.stream().toArray(String[] ::new));
  }
}
