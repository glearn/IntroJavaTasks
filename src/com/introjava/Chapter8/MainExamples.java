package com.introjava.Chapter8;


public class MainExamples {
    public static void main(String[] args) {
        printTriangle(5);
    }

    public static void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            print(i);
        }

        for (int i = n - 1; i > 0; i--) {
            print(i);
        }
    }

    public static void print(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(" " + i);
        }
        System.out.println();
    }
}
