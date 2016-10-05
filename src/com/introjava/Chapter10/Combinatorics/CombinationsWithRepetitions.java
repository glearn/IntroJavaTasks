package com.introjava.Chapter10.Combinatorics;

import java.util.Arrays;

public class CombinationsWithRepetitions {
    static int n = 3;
    static int k = 2;
    static int[] arr = new int[k];

    public static void main(String[] args) {
        comb(0, 1); // all unordered pairs (k = 2) for elements in A = {1,...n}
    }

    private static void comb(int index, int start) {
        if (index >= k) {
            System.out.println(Arrays.toString(arr));
        } else {
            for (int i = start; i <= n; i++) {
                arr[index] = i;
                comb(index + 1, i);
            }
        }
    }
}
