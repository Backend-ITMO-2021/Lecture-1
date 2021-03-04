package ru.itmo.backend_2021;

import scala.NotImplementedError;

public class JavaMain {
  public static void main(String[] args) {
    System.out.println("Hello Java");
  }

  public static int fib(int n) {
    int a = 0;
    int b = 1;
    while (n > 0) {
      int c = a+b;
      a = b;
      b = c;
      n--;
    }
    return a;
  }
}
