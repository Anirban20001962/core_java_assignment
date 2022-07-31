package problem7;

public class Student implements Comparable<Student> {
  private int id;
  private String name;

  public int getId() { return this.id; }

  public void setId(int id) { this.id = id; }

  public String getName() { return this.name; }

  public void setName(String name) { this.name = name; }

  public Student(int id, String name) {
    this.id = id;
    this.name = name;
  }

  /* Overriding the compareTo method for correct order  */
  @Override
  public int compareTo(Student o) {
    return this.name.compareTo(o.getName());
  }

  @Override
  public String toString() {
    return this.id + " " + this.name;
  }
}
