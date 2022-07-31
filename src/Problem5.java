package src;
import java.util.ArrayList;
import src.problem5.Student;

public class Problem5 {

  public static ArrayList<Student> join(ArrayList<Student> students1,
                                        ArrayList<Student> students2) {
    ArrayList<Student> tempStudents = new ArrayList<>();
    tempStudents.addAll(students1);

    for (Student student : students2) {
      if (!tempStudents.stream().anyMatch(s -> s.equals(student))) {
        tempStudents.add(student);
      }
    }

    return tempStudents;
  }

  public static Student search(ArrayList<Student> students, String firstName,
                               String lastName) {
    return students.stream()
        .filter(s -> (s.firstName == firstName && s.lastName == lastName))
        .findFirst()
        .orElse(null);
  }

  public static void main(String[] args) {
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

    ArrayList<Student> students3 = Problem5.join(students1, students2);
    System.out.println(students3);

    Student found = Problem5.search(students3, "Anirban", "Mukherjee");
    System.out.println(found);
  }
}
