package com.introjava.Chapter10.Combinatorics;

import java.util.Arrays;

public class VariationsWithoutRepetitions {
    static int n = 4;
    static int k = 2;

    static int[] arr = new int[k];
    static boolean[] used = new boolean[n];

    public static void main(String[] args) {
        variation(0);
    }

    private static void variation(int index) {
        if (index >= k) {
            System.out.println(Arrays.toString(arr));
        } else {
            for (int i = 0; i < n; i++) {
                if (!used[i]) {
                    used[i] = true;

                    arr[index] = i;

                    variation(index + 1);

                    used[i] = false;
                }
            }
        }
    }
}