package src;
import src.problem1.Box;
import src.problem1.Box3d;

public class Problem1 {
  public static void main(String[] args) {
    Box box2d = new Box(4, 5);
    System.out.println("Area of 2d box is " + box2d.area());

    Box3d box3d = new Box3d(4, 5, 7);
    System.out.println("Volume of 3d box is " + box3d.volume());
    /* Method overiding  */
    System.out.println("Surface area of 2d box is " + box3d.area());
  }
}