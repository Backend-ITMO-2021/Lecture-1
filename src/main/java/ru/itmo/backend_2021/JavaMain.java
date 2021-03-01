package ru.itmo.backend_2021;

public class JavaMain {
  public static void main(String[] args) {
    System.out.println("Hello Java");
  }

  public static int fib(int n) {
    if (n == 0) {
      return 0;
    }
    int first = 0;
    int second = 1;
    for (int i = 1; i < n; i++) {
      int temp = second;
      second = second + first;
      first = temp;
    }
    return second;
  }
}
