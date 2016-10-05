package com.introjava.Chapter10.Combinatorics;

import java.util.Arrays;

public class CombinationsWithoutRepetitions {
    static int n = 5;
    static int k = 3;
    static int[] arr = new int[k];

    public static void main(String[] args) {
        comb(0, 1);
    }

    private static void comb(int index, int start) {
        if (index >= k) {
            System.out.println(Arrays.toString(arr));
        } else {
            for (int i = start; i <= n; i++) {
                arr[index] = i;
                comb(index + 1, i + 1);
            }
        }
    }
}
