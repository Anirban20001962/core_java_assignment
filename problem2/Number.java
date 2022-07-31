package problem2;

import java.util.ArrayList;
import java.util.List;

public class Number {
  private double number;

  public Number(double n) { this.number = n; }

  public boolean isZero() { return this.number == 0; }

  public boolean isPositive() { return this.number > 0; }

  public boolean isNegative() { return this.number < 0; }

  public boolean isOdd() { return this.number % 2 != 0; }

  public boolean isEven() { return this.number % 2 == 0; }

  /* Check it is a prime or not  */
  public boolean isPrime() {
    /* 1 and negative nos are not prime nos. */
    if (this.number == 1 || this.isNegative())
      return false;
    for (double i = 2; i <= this.getSqrt(); i++) {
      if (this.number % i == 0)
        return false;
    }
    return true;
  }

  /* Checks it is a prime no or not  */
  public boolean isArmstrong() {
    int digits = Integer.toString((int)this.number).length();
    double sum = 0, copy = this.number;

    while (copy > 0) {
      sum += Math.pow(copy % 10, digits);
      copy = (int)copy / 10;
    }
    return sum == this.number;
  }

  /* Returns the factorial */
  public double getFactorial() {

    if (this.isNegative())
      return -1;

    double fac = 1;
    for (int i = 2; i <= this.number; i++) {
      fac *= i;
    }
    return fac;
  }

  public double getSqrt() { return Math.sqrt(this.number); }

  public double getSqr() { return this.number * this.number; }

  /* Returns the sum of digits */
  public double sumDigits() {
    int num = Math.abs((int)this.number);
    double sum = 0;

    while (num > 0) {
      sum += num % 10;
      num = num / 10;
    }

    return sum;
  }
  /* Returns the reversed no.  */
  public double getReverse() {
    String[] val = Double.toString(this.number).split("\\.");
    String result1 = "";
    String result2 = "";

    int part = Integer.parseInt(val[0]);
    int frac = Integer.parseInt(val[1]);

    while (part > 0) {
      result1 += Integer.toString(part % 10);
      part = part / 10;
    }

    while (frac > 0) {
      result2 += Integer.toString(frac % 10);
      frac = frac / 10;
    }

    if (result2.length() > 0)
      return Double.parseDouble(result2 + "." + result1);

    return Double.parseDouble(result1);
  }

  /* Displays list of factorials */
  public void listFactor() {
    List<Integer> numbers = new ArrayList<>();
    for (int i = 1; i <= this.number; i++) {
      if (this.number % i == 0)
        numbers.add(i);
    }
    System.out.println(numbers);
  }

  /* Displays binary reprsentation   */
  public void dispBinary() {
    int n = (int)this.number;

    String result = Integer.toBinaryString(n);
    double frac = this.number - n;

    if (frac > 0) {
      result += ".";
      int prec = 5, i = 0, temp;
      while (frac > 0 && i < prec) {
        frac *= 2;
        temp = (int)frac;
        result += Integer.toString(temp);
        frac = frac - temp;
        i += 1;
      }
    }

    System.out.println(result);
  }
}
