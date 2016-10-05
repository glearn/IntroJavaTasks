package com.introjava.Chapter10;


public class RecursivePrint {
    public static void main(String[] args) {
        print(5);
    }

    public static void print(int n) {
        if (n == 0) {
            System.out.println("bottom of the recursion");
            return;
        }

        // pre-action (forward way)
        System.out.println(new String(new char[n]).replace("\0", "*"));

        // recursive call
        print(n - 1);

        // post-action (backward way)
        System.out.println(new String(new char[n]).replace("\0", "#"));
    }
}
