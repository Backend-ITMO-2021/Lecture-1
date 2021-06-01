package ru.itmo.backend_2021;

import scala.NotImplementedError;

public class JavaMain {
  public static void main(String[] args) {
    System.out.println(fib(80));

  }

  public static long fib(int n) {
    // Your code goes here
    if (n==0)
    {
      return 0;
    }
    long current = 1;
    long prev = 0;
    for (int i = 1; i < n; i++)
    {
      current = prev + current;
      prev = current - prev;


      // And ends there
    }
    return current;
  }
}
