package com.introjava.Chapter10.Combinatorics;

import java.util.Arrays;

public class PermutationsWithRepetitions {
    static int[] arr = {3, 5, 1, 5, 5};

    public static void main(String[] args) {
        Arrays.sort(arr);
        generatePermutations(arr, 0, arr.length);
    }

    private static void generatePermutations(int[] arr, int start, int n) {
        System.out.println(Arrays.toString(arr));

        for (int left = n - 2; left >= start; left--) {
            for (int right = left + 1; right < n; right++) {
                if (arr[left] != arr[right]) {
                    swap(left, right);
                    generatePermutations(arr, left + 1, n);
                }
            }

            // undo all modifications done by the previous recursive calls and swaps

            int firstEl = arr[left];
            for (int i = left; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[n - 1] = firstEl;
        }
    }

    private static void swap(int first, int second) {
        int tmp = arr[first];
        arr[first] = arr[second];
        arr[second] = tmp;
    }
}
