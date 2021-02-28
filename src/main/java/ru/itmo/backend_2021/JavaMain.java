package ru.itmo.backend_2021;

public class JavaMain {
  public static void main(String[] args) {
    System.out.println("Hello Java");
  }

  public static int fib(int n) {
    int a = 0;
    int b = 1;
    for(int f = 1; f <= n; f++){
      int c = a + b;
      a = b;
      b = c;
    }
    return a;
  }
}
