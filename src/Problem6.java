package src;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import src.problem6.Student;

public class Problem6 {

  private HashMap<Integer, Student> students;

  public HashMap<Integer, Student> getStudents() { return this.students; }

  public Problem6() { students = new HashMap<>(); }

  public void addStudent(int id, String name, String email) {
    this.students.put(id, new Student(id, name, email));
  }

  /* Return student of particular id  */
  public Student getStudentById(int id) { return this.students.get(id); }

  /* Return student using name and email */
  public Student getStudentByNameAndEmail(String name, String email) {
    return this.students.values()
        .stream()
        .filter(s -> (s.getName() == name && s.getEmail() == email))
        .findFirst()
        .orElse(null);
  }
  /* Return list of student sorted according to name feild */
  public List<Student> getSortedStudentsByName() {
    return this.students.values()
        .stream()
        .sorted((a, b) -> a.getName().compareTo(b.getName()))
        .collect(Collectors.toList());
  }
  /* Return list of student sorted according to email feild */

  public List<Student> getSortedStudentsByEmail() {
    return this.students.values()
        .stream()
        .sorted((a, b) -> a.getEmail().compareTo(b.getEmail()))
        .collect(Collectors.toList());
  }
  public static void main(String[] args) {
    Problem6 obj = new Problem6();

    obj.addStudent(1, "Anirban Mukherjee", "anirbandhakuria@gmail.com");
    obj.addStudent(2, "Ranjan Kumar", "ranjan@gmail.com");
    obj.addStudent(3, "Anish Dey", "aaaaa@gmail.com");

    System.out.println(obj.getStudentById(1));

    System.out.println(
        obj.getStudentByNameAndEmail("Anish Dey", "aaaaa@gmail.com"));

    System.out.println(obj.getSortedStudentsByName());
    System.out.println(obj.getSortedStudentsByEmail());
  }
}