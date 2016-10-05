package com.introjava.Chapter10.Combinatorics;

import java.util.Arrays;

public class PermutationsWithoutRepetitions {
    static int[] arr = {1, 2, 3};

    public static void main(String[] args) {
        generatePermutations(arr, 0);
    }

    private static void generatePermutations(int[] arr, int k) {
        if (k >= arr.length) {
            System.out.println(Arrays.toString(arr));
        } else {
            generatePermutations(arr, k + 1);

            for (int i = k + 1; i < arr.length; i++) {
                swap(k, i);
                generatePermutations(arr, k + 1);
                swap(k, i);
            }
        }
    }

    private static void swap(int first, int second) {
        int tmp = arr[first];
        arr[first] = arr[second];
        arr[second] = tmp;
    }
}
