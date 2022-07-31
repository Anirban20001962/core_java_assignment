package problem6;

public class Student {
  private int id;
  private String name;
  private String email;

  public int getId() { return this.id; }

  public void setId(int id) { this.id = id; }

  public String getName() { return this.name; }

  public void setName(String name) { this.name = name; }

  public String getEmail() { return this.email; }

  public void setEmail(String email) { this.email = email; }

  public Student(int id, String name, String email) {
    this.id = id;
    this.name = name;
    this.email = email;
  }

  public String toString() {
    return this.id + " " + this.name + " " + this.email;
  }
}
