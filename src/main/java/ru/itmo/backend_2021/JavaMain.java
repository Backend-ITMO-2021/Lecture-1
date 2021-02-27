package ru.itmo.backend_2021;

import scala.NotImplementedError;

public class JavaMain {
  public static void main(String[] args) {
    System.out.println("Hello Java");
  }

  public static int fib(int n) {
    // Your code goes here
    if (n == 0) return 0;
    int a = 0, b = 1;
    for (int i = 2; i <= n; ++i) {
      int c = a + b;
      a = b;
      b = c;
    }
    return b;
    // And ends there
  }
}
