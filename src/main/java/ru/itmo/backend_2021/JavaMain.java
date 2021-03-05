package ru.itmo.backend_2021;

import scala.NotImplementedError;

public class JavaMain {
  public static void main(String[] args) {
    System.out.println("Hello Java");
  }

  public static int fib(int n) {
    if (n < 0) {
      throw new NotImplementedError("");
    }
    int prev = 0;
    int next = 1;
    for(int i = 0; i < n; i++){
      int temp = next;
      next = prev + next;
      prev = temp;
    }
    return prev;
  }
}