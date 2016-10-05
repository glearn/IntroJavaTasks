package com.introjava.Chapter7;

public class MatrixTasks {
    public static void main(String[] args) {
        System.out.println("a");
        matrixA();

        System.out.println("b");
        matrixB();

        System.out.println("c");
        matrixC();

        System.out.println("d");
        matrixD();
    }

    private static void matrixA() {
        int size = 6;
        int[][] matrix = new int[size][size];

        int row, col;
        for (int i = 0; i < size * size; i++) {
            row = i % size;
            col = i / size;
            matrix[row][col] = i + 1;
        }

        print(matrix);
    }

    private static void matrixB() {
        int size = 6;
        int[][] matrix = new int[size][size];

        int row, col;

        for (int i = 0; i < size * size; i++) {
            row = i % size;
            col = i / size;

            if (i / size % 2 > 0) {
                row = size - 1 - row;
            }
            matrix[row][col] = i + 1;
        }

        print(matrix);
    }

    private static void matrixC() {
        int size = 6;
        int[][] matrix = new int[size][size];

        int row, col;

        int intercept;
        col = 0;
        intercept = size - 1;
        row = col + intercept;

        for (int i = 0; i < size * size; i++) {
            matrix[row][col] = i + 1;

            row++;
            col++;

            if (row > size - 1 || col > size - 1) {
                col = 0;
                intercept--;
                row = col + intercept;
                if (row < 0) {
                    col -= row;
                    row = 0;
                }
            }
        }

        print(matrix);
    }

    private static void matrixD() {
        int size = 6;
        int[][] matrix = new int[size][size];

        int row, col;

        int stepRows, stepCols, maxRow, minRow, maxCol, minCol;
        row = col = 0;
        stepRows = 1;
        stepCols = 0;
        maxRow = maxCol = size - 1;
        minRow = minCol = 0;

        for (int i = 0; i < size * size; i++) {
            matrix[row][col] = i + 1;

            row += stepRows;
            col += stepCols;
            if (row > maxRow || col > maxCol ||
                    row < minRow || col < minCol) {
                row -= stepRows;
                col -= stepCols;
                if (stepRows > 0) {
                    minCol++;
                }
                if (stepRows < 0) {
                    maxCol--;
                }
                if (stepCols > 0) {
                    maxRow--;
                }
                if (stepCols < 0) {
                    minRow++;
                }
                int swap = stepRows;
                stepRows = (stepRows != 0 ? 0 : -stepCols);
                stepCols = (stepCols != 0 ? 0 : swap);
                row += stepRows;
                col += stepCols;
            }
        }

        print(matrix);
    }

    private static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%3d", matrix[i][j]);
            }
            System.out.println();
        }
    }
}

