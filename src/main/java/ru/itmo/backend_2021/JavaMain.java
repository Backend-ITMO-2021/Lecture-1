package ru.itmo.backend_2021;

import scala.NotImplementedError;

public class JavaMain {
    public static void main(String[] args) { }

    public static long fib(int n) {
        if (n == 0) {
            return 0;
        }
        long fir_element = 0;
        long sec_element = 1;
        long sum = 0;
        for (int i = 1; i < n; i++) {
            sum = fir_element + sec_element;
            fir_element = sec_element;
            sec_element = sum;
        }

        return sec_element;
    }
}
