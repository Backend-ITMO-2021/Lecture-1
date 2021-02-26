package ru.itmo.backend_2021;

public class JavaMain {
  public static void main(String[] args) {
    System.out.println("Hello Java");
  }

  public static int fib(int n) {
    int a = 0;
    int b = 1;
    for (int i = 1; i <= n; i++){
      a = b + a;
      b = a - b;
    }
    return a;
  }
}
