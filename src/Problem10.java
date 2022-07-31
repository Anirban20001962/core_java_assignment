package src;
import src.problem10.Print;

public class Problem10 implements Runnable {
  public Print printer;

  public Problem10(Print print) { this.printer = print; }

  @Override
  public void run() {
    try {
      printer.printData();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    /* Initial Data */
    int[] arr = {1, 3, 4, 5, 6, 8, 10, 9, 2, 1, 2, 11};

    Print p = new Print(arr);

    Problem10 evenRunnable = new Problem10(p);
    Problem10 oddRannable = new Problem10(p);

    Thread t1 = new Thread(evenRunnable, "even");
    Thread t2 = new Thread(oddRannable, "odd");

    /* Starts the thread  */
    t1.start();
    t2.start();
  }
}