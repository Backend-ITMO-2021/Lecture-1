package ru.itmo.backend_2021;
import java.lang.Math;
import java.math.BigInteger;
import java.math.BigDecimal;

public class JavaMain {
  public static void main(String[] args) {
    System.out.println("Hello Java");
  }

  public static int fib(int n) {
    // 47 число выходит за инт
    final int fibIntLim = 46;
    if (n <= fibIntLim) {
      int[] fibArr = new int[n+1];
      fibArr[0] = 0;
      fibArr[1] = 1;
      for (int index=2; index<=n; index++) {
        fibArr[index] = fibArr[index - 1] + fibArr[index - 2];
      }
      return fibArr[n];
    }
    final double sqrtOfFive = Math.sqrt(5d);
    final double phi = (1d + sqrtOfFive) / 2d;
    // The length of Fibonacci sequence number on the position 1 000 000 is 208 988 digits.
    // Is this ok for bigInteger? no, it's not.
    // Но при этом ведь возвращаемое значение вообще должно быть int
    final BigInteger result = BigDecimal.valueOf(Math.pow(phi, n) / sqrtOfFive).toBigInteger();
    return 1000000;
  }
}
