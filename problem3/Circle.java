package problem3;

public class Circle extends Shape {

  @Override
  public void draw() {
    System.out.println("Drawing the circle");
  }

  @Override
  public void erase() {
    System.out.println("Erasing the circle");
  }
}
