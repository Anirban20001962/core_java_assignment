package src.problem10;

public class Print {
  public volatile int index = 0;
  public int[] arr;

  public Print(int[] arr) { this.arr = arr; }

  public synchronized void printData() throws InterruptedException {
    while (this.index < this.arr.length) {
      /* Stores the name of the current thread  */
      String name = Thread.currentThread().getName();
      if ((name == "even" && (arr[this.index] % 2 == 0)) ||
          (name == "odd" && (arr[this.index] % 2 != 0))) {
        System.out.println("Thread " + name + " is printing value:- " +
                           arr[this.index]);
        this.index += 1;
        /* Notifies other thread to executes  */
        this.notify();
      } else {
        /* It blocks the current thread execution  */
        this.wait();
      }
    }
  }
}
