package ru.itmo.backend_2021;

public class JavaMain {
  public static void main(String[] args) {
    System.out.println("Hello Java");
  }

  public static int fib(int n) {
    int[] lastTwo = {0, 1};

    if (n < 0) { return 0; }
    if (n < 2) { return lastTwo[n]; }

    for (int i = 1; i < n; i++) {
      int sum = lastTwo[0] + lastTwo[1];
      lastTwo[0] = lastTwo[1];
      lastTwo[1] = sum;
    }

    return lastTwo[1];
  }
}
