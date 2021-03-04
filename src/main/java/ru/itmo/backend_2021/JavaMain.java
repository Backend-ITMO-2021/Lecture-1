package ru.itmo.backend_2021;


public class JavaMain {
  public static void main(String[] args) {
    System.out.println("Hello Java");
  }

  public static int fib(int n) {
    if (n < 0) {
      throw new IllegalArgumentException("`n` CANNOT be a negative integer!");
    }

    if (n == 0) return 0;
    if (n == 1 || n == 2) return 1;

    int f1 = 1;
    int f2 = 1;
    for (int i = 3; i <= n; i++) {
      int f3 = f1 + f2;
      f1 = f2;
      f2 = f3;
    }
    return f2;
  }
}
