package problem1;

public class Box3d extends Box {
  public double height;
  public Box3d(double l, double b, double h) {
    /* Calling the parent constructor */
    super(l, b);
    this.height = h;
  }

  /* Calcuates the volume of Box3d */
  public double volume() {
    double baseArea = super.area();
    return baseArea * this.height;
  }

  /* Calucates surface area of the Box3d */
  @Override
  public double area() {
    return 2 * (this.length * this.breadth + this.length * this.height +
                this.breadth * this.height);
  }
}