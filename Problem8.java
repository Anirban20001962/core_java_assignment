import java.util.Arrays;
import java.util.List;

public class Problem8 {
  /* Upper bound example  */
  public static double addNumbers(List<? extends Number> arr) {
    double sum = 0;

    for (Number num : arr) {
      /*  unboxing */
      sum += num.doubleValue();
    }
    return sum;
  }
  /* Lower bound example  */
  public static void dispNumbers(List<? super Integer> arr) {
    for (Object num : arr) {
      System.out.print(num + ",");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    List<Integer> a = Arrays.asList(1, 2, 3);
    List<Double> b = Arrays.asList(1.0, 4.0, 7.9);

    List<Number> c = Arrays.asList(5.6, 1.2, 1.2);

    System.out.println(Problem8.addNumbers(a));
    System.out.println(Problem8.addNumbers(b));

    Problem8.dispNumbers(a);
    Problem8.dispNumbers(c);
  }
}