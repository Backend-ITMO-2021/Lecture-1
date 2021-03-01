package ru.itmo.backend_2021;

public class JavaMain {

    public static int fib(int n) {

        int one = 0;
        int two = 1;
        while (n > 0) {
            int sum =one+two;
            one = two;
            two = sum;
            n--;
        }
        return one;
    }

    public static void main(String[] args) {
        System.out.println(fib(0));
    }

}
