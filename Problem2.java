import problem2.Number;

public class Problem2 {
  public static void main(String[] args) {
    Number obj = new Number(4.0);
    System.out.println(obj.getFactorial());
    System.out.println(obj.getReverse());
    obj.dispBinary();
  }
}
