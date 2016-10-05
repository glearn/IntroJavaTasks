package com.introjava.Chapter10.Combinatorics;

public class BinomialCoefficients {
    static int[] m = new int[100]; // type may need to be something bigger

    static int i, j;

    public static void main(String[] args) {
        System.out.println(recursiveBinomialCoefficient(7, 2)); // 21 (slower than iterative,same like fibonacci need memoization)

        System.out.println(iterativeBinomialCoefficient(7, 2));
    }

    public static int recursiveBinomialCoefficient(int n, int k) {
        if (k > n) {
            return 0;
        } else if (0 == k || k == n) {
            return 1;
        }
        return recursiveBinomialCoefficient(n - 1, k - 1) + recursiveBinomialCoefficient(n - 1, k);
    }

    // dynamic programming (динамично оптимиране)
    public static int iterativeBinomialCoefficient(int n, int k) {
        for (i = 0; i <= n; i++) {
            m[i] = 1;

            if (i > 1) {
                if (k < i - 1) {
                    j = k;
                } else {
                    j = i - 1;
                }
                for (; j >= 1; j--) {
                    m[j] += m[j - 1];
                }
            }
        }
        return m[k];
    }
}
