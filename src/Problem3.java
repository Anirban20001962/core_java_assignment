package src;
import src.problem3.Circle;
import src.problem3.Shape;
import src.problem3.Square;
import src.problem3.Triangle;

public class Problem3 {
  public static void main(String[] args) {

    Shape shape = new Shape();
    Square square = new Square();
    Circle circle = new Circle();
    Triangle triangle = new Triangle();

    shape.draw();
    shape.erase();

    /* Method Overidding */

    square.draw();
    square.erase();

    circle.draw();
    circle.erase();

    triangle.draw();
    triangle.erase();
  }
}
