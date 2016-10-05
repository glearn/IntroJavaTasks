package com.introjava.Chapter10;

public class RecursiveNestedLoops {
    public static int n = 2;
    public static int k = 3;
    public static int[] loops;

    public static void main(String[] args) {
        loops = new int[n];
        nestedLoops(0);
    }

    public static void nestedLoops(int currentLoop) {
        if (currentLoop == n) {
            printLoops();
            return;
        }
        for (int i = 1; i <= k; i++) {
            loops[currentLoop] = i;
            System.out.println("current loop " + currentLoop);
            nestedLoops(currentLoop + 1);
        }
    }

    public static void printLoops() {
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", loops[i]);
        }
        System.out.println();
    }
}

