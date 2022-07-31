package problem1;

public class Box {
  public double length, breadth;
  public Box(double l, double b) {
    this.length = l;
    this.breadth = b;
  }
  /* Calculates area of 2d box  */
  public double area() { return this.breadth * this.length; }
}
