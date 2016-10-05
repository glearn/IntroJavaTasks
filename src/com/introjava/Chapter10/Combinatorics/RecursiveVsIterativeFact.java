package com.introjava.Chapter10.Combinatorics;

public class RecursiveVsIterativeFact {
    public static void main(String[] args) {
        int number = 7;
        long start, end;

        start = System.currentTimeMillis();
        System.out.println(recursiveFact(number));
        end = System.currentTimeMillis();

        System.out.println("recursive time: " + (end - start)); // 5

        start = System.currentTimeMillis();
        System.out.println(iterativeFact(number));
        end = System.currentTimeMillis();

        System.out.println("iterative time: " + (end - start)); // 0
    }

    public static int recursiveFact(int n) {
        if (n == 0) {
            return 1;
        }

        return n * recursiveFact(n - 1);
    }

    public static int iterativeFact(int n) {
        int res = 1;

        for (int i = 2; i <= n; i++) {
            res *= i;
        }

        return res;
    }
}
