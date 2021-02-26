package ru.itmo.backend_2021;

import scala.NotImplementedError;

public class JavaMain {
  public static void main(String[] args) {
    System.out.println("Hello Java");
  }

  public static int fib(int n) {
    // Your code goes here
    if (n <= 1) return n;
    int result = 1;
    int previous = 0;
    for (int i = 1; i < n; i++) {
      result = previous + result;
      previous = result - previous;
    }
//    System.out.println(n);
//    System.out.println(result);
    return result;
    // And ends there

  }
}
