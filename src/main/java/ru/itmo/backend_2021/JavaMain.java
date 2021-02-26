package ru.itmo.backend_2021;

public class JavaMain {
  public static void main(String[] args) {
  }

  public static int fib(int n) {
    if (n == 0)
      return 0;
    int prevPrev = 0;
    int prev = 0;
    int current = 1;
    for (int i = 1; i < n; i++) {
      prevPrev = prev;
      prev = current;
      current = prev + prevPrev;
    }
    return current;
  }
}
