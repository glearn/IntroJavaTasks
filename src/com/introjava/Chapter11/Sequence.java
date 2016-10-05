package com.introjava.Chapter11;

public class Sequence {
    private static int value;

    public static int next() {
        return ++value;
    }
}
