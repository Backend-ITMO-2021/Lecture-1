package ru.itmo.backend_2021;

import scala.NotImplementedError;

import java.util.stream.Stream;

public class JavaMain {
  public static void main(String[] args) {
    System.out.println("Hello Java");
  }

  public static int fib(int n) {
    // Your code goes here
    return n == 0? 0 : Stream.iterate(new int[] {0, 1 }, p -> new int[] { p[1], p[0] + p[1] })
            .limit(n)
            .skip(n - 1)
            .findFirst()
            .get()[1];
    // And ends there
  }
}
