package ru.itmo.backend_2021;

public class JavaMain {
    public static void main(String[] args) {
        System.out.println("Hello Java");
    }

    public static int fib(int n) {
        if (n <= 1) return n;
        int n1 = 0;
        int n2 = 1;
        for (int i = 1; i < n; i++) {
            n2 = n1 + n2;
            n1 = n2 - n1;
        }
        return n2;
    }
}
