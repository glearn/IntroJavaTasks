package com.introjava.Chapter10.Combinatorics;

import java.util.Arrays;

public class VariationsWithRepetitions {
    static int n = 3;
    static int k = 2;
    static int[] arr = new int[k];

    public static void main(String[] args) {
        variation(0);
    }

    private static void variation(int index) {
        if (index >= k) {
            System.out.println(Arrays.toString(arr));
        } else {
            for (int i = 1; i <= n; i++) {
                arr[index] = i;

                variation(index + 1);
            }
        }
    }
}