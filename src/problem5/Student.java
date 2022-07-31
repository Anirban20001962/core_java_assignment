package src.problem5;

public class Student {
  public String firstName;
  public String lastName;

  public Student(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public boolean equals(Student obj) {
    if (obj == null)
      return false;
    if (obj == this)
      return true;
    return this.firstName == obj.firstName && this.lastName == obj.lastName;
  }

  public String toString() { return this.firstName + " " + this.lastName; }
}
