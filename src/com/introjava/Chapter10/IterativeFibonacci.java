package com.introjava.Chapter10;

public class IterativeFibonacci {
    public static void main(String[] args) {
        int n = 10;
        int result = fib(n);
        System.out.printf("F%d = %d", n, result);
    }

    // 0 1 1 2 3 5 8 ...
    private static int fib(int n) {
        int fn = 1;
        int fn_1 = 1;
        int fn_2 = 1;

        for (int i = 2; i < n; i++) {
            fn = fn_1 + fn_2; // 1 + 2 = 3

            fn_1 = fn_2; // 2
            fn_2 = fn;  // 3
            // on the next iteration will have 2+3
        }

        return fn;
    }
}
