package src;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeSet;
import src.problem7.Student;

public class Problem7 {
  private TreeSet<Student> students;

  public TreeSet<Student> getStudents() { return this.students; }

  public Problem7() { this.students = new TreeSet<>(); }

  public void addStudent(int id, String name) {
    this.students.add(new Student(id, name));
  }

  public static void main(String[] args) {
    Problem7 obj = new Problem7();

    obj.addStudent(1, "Debopriyo");
    obj.addStudent(4, "Biswajit");
    obj.addStudent(2, "Anirban");

    TreeSet<Student> students = obj.students;

    // Using fileWriter to write informations on the file

    try {
      FileWriter fl = new FileWriter("some.txt");
      fl.write("Students are:-\n");

      for (Student student : students) {
        fl.write(student.toString() + "\n");
      }
      fl.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
