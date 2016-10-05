package com.introjava.Chapter7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        task1();

//        task2();

//        task3();

//        task4();

//        task5();

//        task6();

        // task 7: selection sort

//        task8();

//        task9_v1();

//        task9_v2();

//        task10_a();

//        task10_b();

//        task10_c();

//        task11();

//        task12();

        // task 13: bin search
        // task 14: merge sort
        // task 15: quick sort

        task16();
    }

    private static void task1() {
        // 1. Да се напише програма, която създава масив с 20 елемента от
        // целочислен тип и инициализира всеки от елементите със стойност равна на индекса на елемента умножен по 5.
        // Елементите на масива да се изведат на конзолата.

        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = i * 5;
        }

        System.out.println(Arrays.toString(array));
    }

    private static void task2() {
        // 2. Да се напише програма, която чете два масива от конзолата и проверява дали са еднакви.

        Integer[] first = {5, 4, 7, 8, 9, 6};
        Integer[] second = {5, 4, 7, 8, 9, 7};

//        System.out.println(Arrays.deepEquals(first, second));

        boolean identical = true;

        for (int i = 0; i < first.length; i++) {
            Integer el1 = first[i];
            Integer el2 = second[i];

            if (el1 != el2) {
                identical = false;
                break;
            }
        }

        System.out.println("are identical: " + identical);
    }

    private static void task3() {
        // 3. Да се напише програма, която сравнява два масива от тип char
        // лексикографски (буква по буква) и проверява кой от двата е по-рано в лексикографската подредба.

        char[] first = {'a', 'd', 'f'};
        char[] second = {'a', 'd', 'e'};

        // one way is to write char by char comparison which could be a little bit longer
        // the other way is to use built-in methods in String - shorter and already implemented

        String a = new String(first);
        String b = new String(second);

        // Compares two strings lexicographically. The comparison is based on the Unicode value of each character in the strings.
        // 0 - equal, < 0 if string 'a' is lexicographically less than the string argument, > 0 if string 'b' is lexicographically less
        // e.g. 0,-1, 1

        int res = a.compareTo(b); // 1
        System.out.println(res);
    }

    private static void task4() {
        // 4. Напишете програма, която намира максималната редица от еднакви елементи в масив.

        int[] arr = {2, 1, 1, 2, 3, 3, 2, 2, 2, 1, 5, 5, 5, 5};

        int frequency = 1;
        int bestNumber = arr[0];
        int bestFrequency = 0;

        for (int n = 1; n < arr.length; n++) { // linear complexity
            if (arr[n] != arr[n - 1]) {
                if (frequency > bestFrequency) {
                    bestNumber = arr[n - 1];
                    bestFrequency = frequency;
                }
                frequency = 1;
            } else {
                frequency++;
            }
        }

        if (frequency > bestFrequency) {
            bestNumber = arr[arr.length - 1];
            bestFrequency = frequency;
        }

        System.out.println(bestNumber);
        System.out.println(bestFrequency);
    }

    private static void task5() {
        // 5. Напишете програма, която намира максималната редица от нарастващи елементи в масив.

        //  O(N^2)

        int[] array = {3, 2, 3, 4, 2, 2, 4};

        int[] LIS = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int max = -1;
            for (int j = 0; j < i; j++) {
                // check if previous elements > current element
                if (array[i] > array[j]) {
                    // update the max from the previous entries
                    if (max == -1 || max < LIS[j] + 1) {
                        max = 1 + LIS[j];
                    }
                }
            }
            if (max == -1) {
                // means none of the previous element has smaller than arrA[i]
                max = 1;
            }
            LIS[i] = max;
        }
        // find the max in the LIS[]
        int result = -1;
        int index = -1;
        for (int i = 0; i < LIS.length; i++) {
            if (result < LIS[i]) {
                result = LIS[i];
                index = i;
            }
        }
        // Print the result
        // Start moving backwards from the end and
        String path = array[index] + " ";
        int res = result - 1;
        for (int i = index - 1; i >= 0; i--) {
            if (LIS[i] == res) {
                path = array[i] + " " + path;
                res--;
            }
        }
        System.out.println("Longest Increasing subsequence: " + result);
        System.out.println("Actual Elements: " + path);
    }

    private static void task6() {
        // 6. Да се напише програма, която чете от конзолата две цели числа N и K, и масив от N елемента.
        // Да се намерят тези K елемента, които имат максимална сума.

        int[] array = {5, 8, 4, 9, 14, 3, 6, 10, 2, 15};
        int k = 6;

        Arrays.sort(array);

        int sum = 0;
        for (int i = array.length - 1; i >= (array.length - k); i--) {
            int number = array[i];

            System.out.printf("%d ", number);

            sum += number;
        }

        System.out.printf("\nmax sum: %d ", sum);
    }

    private static void task8() {
        // 8. Напишете програма, която намира най-често срещания елемент в масив.

        // 1. Counting Sort

        int[] array = {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3};

        int[] elements = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int index = array[i];
            elements[index]++;
        }

//        0    1    2    3    4    5    6    7    8    9    10   11    12
//       [0]  [3]  [2]  [2]  [5]  [0]  [0]  [0]  [0]  [1]  [0]   [0]   [0]

        // 2. Find max element and get its index as most common number in the array

        int maxElement = elements[0];
        int elIndex = 0;

        for (int i = 1; i < elements.length; i++) {
            if (maxElement < elements[i]) {
                maxElement = elements[i];
                elIndex = i;
            }
        }

        System.out.printf("most common element: %d\n", elIndex);
        System.out.printf("counted: %d times", maxElement);
    }

    private static void task9_v1() {
        // 9. Да се напише програма, която намира последователност от числа в
        // масив, които имат сума равна на число, въведено от конзолата (ако има такава).

        // Method 1 (Simple)
        // A simple solution is to consider all subarrays one by one and check the sum of every subarray.
        // Following program implements the simple solution.
        // We run two loops: the outer loop picks a starting point i and the inner loop tries all subarrays starting from i.

        // Time Complexity: O(n^2) in worst case.

        Integer[] array = {4, 3, 1, 4, 2, 5, 8};
        int sum = 12;
        System.out.printf("sum = %d\n", sum);

        int curr_sum, i, j;

        // Pick a starting point
        for (i = 0; i < array.length; i++) {
            curr_sum = array[i];

            // try all subarrays starting with 'i'
            for (j = i + 1; j <= array.length; j++) {
                if (curr_sum == sum) {
                    int p = j - 1;
                    System.out.println(Arrays.deepToString(Arrays.copyOfRange(array, i, p + 1)));
                    break;
                }
                if (curr_sum > sum || j == array.length)
                    break;
                curr_sum = curr_sum + array[j];
            }
        }
    }

    private static void task9_v2() {
        // Method 2 (Efficient)
        // Initialize a variable curr_sum as first element. curr_sum indicates the sum of current subarray.
        // Start from the second element and add all elements one by one to the curr_sum.
        // If curr_sum becomes equal to sum, then print the solution.
        // If curr_sum exceeds the sum, then remove trailing elemnents while curr_sum is greater than sum.
        // Following is the implementation of the above approach.

        Integer[] array = {4, 3, 1, 4, 2, 5, 8};
        int sum = 12;
        System.out.printf("sum = %d\n", sum);

        int curr_sum = array[0], start = 0, i;

        // Pick a starting point
        for (i = 1; i <= array.length; i++) {
            // If curr_sum exceeds the sum, then remove the starting elements
            while (curr_sum > sum && start < i - 1) {
                curr_sum = curr_sum - array[start];
                start++;
            }

            // If curr_sum becomes equal to sum, then return true
            if (curr_sum == sum) {
                int p = i - 1;
                System.out.println(Arrays.deepToString(Arrays.copyOfRange(array, start, p + 1)));
//                break;
            }

            // Add this element to curr_sum
            if (i < array.length) {
                curr_sum = curr_sum + array[i];
            }
        }
    }

    private static void task10_a() {
        int size = 4;
        int[][] matrix = new int[size][size];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (row == 0 & col == 0) {
                    matrix[row][col] = 1;
                    continue;
                }

                if (row != 0 && col == 0) {
                    matrix[row][col] = row + 1;
                    continue;
                }

                matrix[row][col] = matrix[row][col - 1] + size;
            }
        }

        printMatrix(matrix);
    }

    private static void task10_b() {
        int size = 6;
        int c = 1;
        boolean direction = true;
        int[][] matrix = new int[size][size];
        for (int y = 0; y <= size - 1; y++) {
            if (direction) {
                for (int x = 0; x <= size - 1; x++) {
                    matrix[x][y] = c;
                    c++;
                }
                direction = false;
            } else {
                for (int x = size - 1; x >= 0; x--) {
                    matrix[x][y] = c;
                    c++;
                }
                direction = true;
            }
        }

        printMatrix(matrix);
    }

    private static void task10_c() {
        int size = 4;
        int[][] matrix = new int[size][size];

        int N = matrix.length;

        for (int row = N - 1; row >= 0; row--) {
            for (int col = 0; col < N; col++) {
                matrix[row][col] = (row + col < N) ?
                        ((row + col + 1) * (row + col) / 2 + col + 1) :
                        (N * N + 1 - (N - col) - (2 * N - row - col - 1) * (2 * N - row - col - 2) / 2);
            }
        }

        printMatrix(matrix);
    }

    private static void printMatrix(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.printf("%3d ", m[i][j]);
            }
            System.out.println();
        }
    }

    private static void task11() {
        // 11.Да се напише програма, която създава правоъгълна матрица с размер (n, m).
        // Размерността и елементите на матрицата да се четат от конзолата.
        // Да се намери подматрицата с размер (3,3), която има максимална сума.

        int[][] matrix = {
                {0, 2, 4, 0, 9, 5},
                {7, 1, 3, 3, 2, 1},
                {1, 3, 9, 8, 5, 6},
                {4, 6, 7, 9, 1, 0}
        };

        int sum = 0;
        int r = 0;
        int c = 0;

        for (int row = 0; row < matrix.length - 2; row++) {
            for (int col = 0; col < matrix[0].length - 2; col++) {
                int e1 = matrix[row][col];
                int e2 = matrix[row][col + 1];
                int e3 = matrix[row][col + 2];

                int e4 = matrix[row + 1][col];
                int e5 = matrix[row + 1][col + 1];
                int e6 = matrix[row + 1][col + 2];

                int e7 = matrix[row + 2][col];
                int e8 = matrix[row + 2][col + 1];
                int e9 = matrix[row + 2][col + 2];

                int currentSum = e1 + e2 + e3 + e4 + e5 + e6 + e7 + e8 + e9;

                if (currentSum > sum) {
                    sum = currentSum;
                    r = row;
                    c = col;
                }
            }
        }

        System.out.printf("[%d][%d][%d]\n[%d][%d][%d]\n[%d][%d][%d]\n",
                matrix[r][c], matrix[r][c + 1], matrix[r][c + 2],
                matrix[r + 1][c], matrix[r + 1][c + 1], matrix[r + 1][c + 2],
                matrix[r + 2][c], matrix[r + 2][c + 1], matrix[r + 2][c + 2]
        );
        System.out.printf("max sum: %d", sum);
    }

    private static void task12() {
        // 12.Да се напише програма, която създава масив с всички букви от латинската азбука.
        // Да се даде възможност на потребител да въвежда дума от конзолата и в резултат да се извеждат индексите на буквите от думата.

        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        String concatAlphabet = new String(alphabet);
        String word = "planet"; // 16, 12, 1, 14, 5 , 20

        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            int index = concatAlphabet.indexOf(letter) + 1;
            System.out.printf("Letter '%s' at %d\n", letter, index);
        }
    }

    private static void task16() {
        // 16.Напишете програма, която намира всички прости числа в диапазона [1..10 000 000].

        /******************************************************************************
         *  Compilation:  javac PrimeSieve.java
         *  Execution:    java -Xmx1100m PrimeSieve n
         *
         *  Computes the number of primes less than or equal to n using
         *  the Sieve of Eratosthenes.
         *
         *  % java PrimeSieve 25
         *  The number of primes <= 25 is 9
         *
         *  % java PrimeSieve 100
         *  The number of primes <= 100 is 25
         *
         *  % java -Xmx100m PrimeSieve 100000000
         *  The number of primes <= 100000000 is 5761455
         *
         *  % java PrimeSieve -Xmx1100m 1000000000
         *  The number of primes <= 1000000000 is 50847534
         *
         *
         *  The 110MB and 1100MB is the amount of memory you want to allocate
         *  to the program. If your computer has less, make this number smaller,
         *  but it may prevent you from solving the problem for very large
         *  values of n.
         *
         *
         *                  n     Primes <= n
         *  ---------------------------------
         *                 10               4
         *                100              25
         *              1,000             168
         *             10,000           1,229
         *            100,000           9,592
         *          1,000,000          78,498
         *         10,000,000         664,579
         *        100,000,000       5,761,455
         *      1,000,000,000      50,847,534
         *
         ******************************************************************************/

        // initially assume all integers are prime
        int n = 1000000;
        int upperBoundSquareRoot = (int) Math.sqrt((double) n);

        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // mark non-primes <= n using Sieve of Eratosthenes

//        for (int factor = 2; factor * factor <= n; factor++) {
        for (int factor = 2; factor <= upperBoundSquareRoot; factor++) { // added optimisation

            // if factor is prime, then mark multiples of factor as nonprime
            // suffices to consider mutiples factor, factor+1, ...,  n/factor
            if (isPrime[factor]) {
                for (int j = factor; factor * j <= n; j++) {
                    isPrime[factor * j] = false;
                }
            }
        }

        // count primes
        int primes = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primes++;
                System.out.printf("%d ", i);
            }
        }
        System.out.println("\nThe number of primes <= " + n + " is " + primes);
    }

    //2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97

}
