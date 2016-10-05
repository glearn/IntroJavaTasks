package com.introjava.Chapter7;

import java.util.Arrays;

public class MainExamplesCh7 {
    public static void main(String[] args) {
//        example1();

//        example2();

//        example3();

        example4();
    }

    private static void example1() {
        //  reverse array

        int[] numbers = {1, 2, 3, 4, 5};
        int length = numbers.length;

        int[] reversed = new int[length];

        for (int i = 0; i < length; i++) {
            reversed[length - i - 1] = numbers[i];
            // reverced indexes:
            // 5 - 0 - 1 = 4
            // 5 - 1 - 1 = 3
            // 5 - 2 - 1 = 2
            // 5 - 3 - 1 = 1
            // 5 - 4 - 1 = 0
            // end
        }

        String res = Arrays.toString(reversed);
        System.out.println(res);
    }

    private static void example2() {
        // check if array is symmetric

        int[] array = {4, 3, 2, 1, 1, 2, 3, 1};

        // (array.length + 1) / 2 за четна и нечетна дължина

        for (int i = 0; i < (array.length + 1) / 2; i++) {
            if (array[i] != array[array.length - i - 1]) {
                System.out.println("not symmetric");
                return;
            }
        }

        System.out.println("symmetric");
    }

    private static void example3() {
        int[][] matrix = {
                {1, 2, 3, 4, 5, 6, 7},        // row 0
                {10, 20, 30, 40, 50, 60, 70}  // row 1
        };

        // matrix.length == number of rows

        // matrix[i].length == length of i row

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.printf("[row %d, col %d] = %d\n", row, col, matrix[row][col]);
            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(matrix));
    }

    private static void example4() {
        // Дадена е правоъгълна матрица с числа.
        // Трябва да намерим в нея максималната подматрица с размер 2 х 2

        int[][] matrix = {
                {0, 2, 4, 0, 9, 5},
                {7, 1, 3, 3, 2, 1},
                {1, 3, 9, 8, 5, 6},
                {4, 6, 7, 9, 1, 0}
        };

        int sum = 0;
        int r = 0;
        int c = 0;

        for (int row = 0; row < matrix.length - 1; row++) {
            for (int col = 0; col < matrix[0].length - 1; col++) {
                int e1 = matrix[row][col];
                int e2 = matrix[row][col + 1];
                int e3 = matrix[row + 1][col];
                int e4 = matrix[row + 1][col + 1];

                int currentSum = e1 + e2 + e3 + e4;

                if (currentSum > sum) {
                    sum = currentSum;
                    r = row;
                    c = col;
                }
            }
        }

        System.out.printf("[%d][%d]\n[%d][%d]\n", matrix[r][c], matrix[r][c + 1], matrix[r + 1][c], matrix[r + 1][c + 1]);
        System.out.printf("max sum: %d", sum);
    }
}
