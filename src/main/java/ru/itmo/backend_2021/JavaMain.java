package ru.itmo.backend_2021;

public class JavaMain {
  public static void main(String[] args) {
    System.out.println("Hello Java");
  }

  public static int fib(int n) {
    // Your code goes here
    if (n == 0) {
      return 0;
    }
    int number = 0;
    int nextNumber = 1;
    for (int i = 1; i < n; i++) {
      int summa = nextNumber;
      nextNumber = nextNumber + number;
      number = summa;
    }
    return nextNumber;
    // And ends there
  }
}
