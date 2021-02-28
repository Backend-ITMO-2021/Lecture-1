package ru.itmo.backend_2021;

import scala.NotImplementedError;

public class JavaMain {
  public static void main(String[] args) {
    System.out.println("Hello Java");
  }

  public static int fib(int n) {
    // Your code goes here
    
  	/*
    if (n <= 1) return n;
    return fib(n-1) + fib(n-2);
    */

    if (n <= 1) return n;
    int prev = 0;
    int next = 1;
    int s = 0;

    for (int i=2; i<=n; i++) {
    	s = prev+next;
    	prev = next;
    	next = s;
    }
    return s;

    // throw new NotImplementedError("");
    // And ends there
  }
}
