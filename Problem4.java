public class Problem4 {
  public int[] a;
  public Problem4(int[] arr) { this.a = arr; }

  /* Returns the maximum element in an array  */
  public int maximumElement(int n) {
    /* Base case  */
    if (n == 1)
      return a[0];
    return Math.max(maximumElement(n - 1), a[n - 1]);
  }

  /* Returns fibonacci no. of n'th term */
  public static int fibonacci(int n) {
    /* Base case  */
    if (n == 0 || n == 1)
      return 1;

    return fibonacci(n - 1) + fibonacci(n - 2);
  }

  public static void main(String[] args) {
    int[] arr = {4, 7, 0, 1, 2};
    Problem4 obj = new Problem4(arr);
    System.out.println(obj.maximumElement(arr.length));
    System.out.println(Problem4.fibonacci(4));
  }
}
