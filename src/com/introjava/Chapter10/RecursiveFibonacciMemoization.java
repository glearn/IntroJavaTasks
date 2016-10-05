package com.introjava.Chapter10;

public class RecursiveFibonacciMemoization {
    static long[] numbers;

    public static void main(String[] args) {
        int n = 10;
        numbers = new long[n + 1];
        numbers[1] = 1;
        numbers[2] = 1;

        long result = fib(n);
        System.out.printf("F%d = %d\n", n, result);
    }

    public static long fib(int n) {
        if (numbers[n] == 0) {
            numbers[n] = fib(n - 1) + fib(n - 2);
        }
        return numbers[n];
    }
}
