package ru.itmo.backend_2021;

import scala.NotImplementedError;

public class JavaMain {
  public static void main(String[] args) {
    System.out.println("Hello Java");
  }

  public static long fib(int n) {
    // Your code goes here

    if (n < 0) {
      throw new IndexOutOfBoundsException("Index number must be positive");
    }

    // +2 to process n == 0
    long[] f = new long[n + 2];
    f[0] = 0;
    f[1] = 1;

    for (int i = 2; i <= n; i++) {
      f[i] = f[i - 1] + f[i - 2];
    }

    return f[n];

    // And ends there
  }
}
