package com.introjava.Chapter10;

class Task7 {

//    Original: 7. Даден е масив с цели числа и число N. Напишете програма, която
//    намира всички подмножества от числа от масива, които имат сума N.

    // Other:  Даден е масив с цели числа и число N. Напишете рекурсивна програма
    // която намира всички подмножества от числа от масива, които имат сума N.
    // Например ако имаме масива {2, 3, 1, -1} и N=4, можем да получим N=4 като сума по следните два начина: 4=2+3-1; 4=3+1.

    public static boolean isSubsetSum(int[] arr, int n, int sum) {
        boolean[][] subset = new boolean[sum + 1][n + 1];

        for (int i = 0; i <= n; i++) {
            subset[0][i] = true;
        }

        for (int i = 1; i <= sum; i++) {
            subset[i][0] = false;
        }

        for (int i = 1; i <= sum; i++) {
            for (int j = 1; j <= n; j++) {
                subset[i][j] = subset[i][j - 1];
                if (i >= arr[j - 1]) {
                    subset[i][j] = subset[i][j] || subset[i - arr[j - 1]][j - 1];
                }
            }
        }

        return subset[sum][n];
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, -1};

        int sum = 4;

        if (isSubsetSum(arr, arr.length, sum) == true) {
            System.out.println("Found a subset with given sum");
        } else {
            System.out.println("No subset with given sum");
        }
    }
}