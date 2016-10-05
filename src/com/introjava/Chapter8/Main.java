package com.introjava.Chapter8;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        task8();

    }


    public static String decToBin(int number) {
        int base = 2;
        StringBuilder binary = new StringBuilder();

        while (number != 0) {
            binary.append(number % base);
            number /= base;
        }

        return binary.reverse().toString();
    }
}
