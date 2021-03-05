package ru.itmo.backend_2021;

import scala.NotImplementedError;

public class JavaMain {
  public static void main(String[] args) {
    System.out.println(fib(10));
  }

  public static int fib(int n) {
    int prev = 0;
    int curr = 1;
    for (int i=0; i<n; i++){
      int next = prev + curr;
      prev = curr;
      curr = next;
    }
    return prev;
  }
}