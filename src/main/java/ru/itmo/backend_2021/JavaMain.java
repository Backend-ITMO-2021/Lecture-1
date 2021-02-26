package ru.itmo.backend_2021;

import scala.NotImplementedError;

public class JavaMain {
  public static void main(String[] args) {
    System.out.println("Hello Java");
  }

  public static int fib(int n) {
    // Your code goes here
    int first = 0;
    int second = 1;

    for (int i = 0; i < n; i++) {
      int sum = first + second;
      first = second;
      second = sum;
    }
    return first;
    // And ends there
  }
}
