package com.introjava.Chapter9;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        task1();

//        task2();

//        task3();

//        task4();

//        task5();

//        task6();

//        task7();

//        task8();

//        9_a  - Обръща последователността на цифрите на едно число. (same as 7.)

//        task9_b();

//        task9_c();
    }

    private static void task1() {
        // 1. Напишете метод, който при подадено име отпечатва в конзолата "Hello, <name>!" (например "Hello, Peter!").
        // Напишете програма, която тества този метод.

        String actual = greet("Peter");
        String expected = "Hello, Peter";
        System.out.println(actual.equals(expected));
    }

    private static String greet(String name) {
        return "Hello, " + name;
    }

    private static void task2() {
        // 2. Създайте метод getMax() с два целочислени (int) параметъра, който връща по-голямото от двете числа.
        // Напишете програма, която прочита три цели числа от конзолата и отпечатва най-голямото от тях, използвайки метода getMax().

        int first = 5;
        int second = 1;
        int third = 7;

        System.out.println(getMax(getMax(first, second), third));
    }

    private static int getMax(int first, int second) {
        if (first > second) {
            return first;
        }

        return second;
    }

    private static void task3() {
        // 3. Напишете метод, който връща английското наименование на последната цифра от дадено число.
        // Примери: за числото 512 отпечатва "two"; за числото 1024 – "four".

        System.out.println(getLastDigitName(156));
        System.out.println(getLastDigitName(1024));
        System.out.println(getLastDigitName(23));
    }

    private static String getLastDigitName(int number) {
        Map<Integer, String> values = new HashMap<Integer, String>() {{
            put(0, "zero");
            put(1, "one");
            put(2, "two");
            put(3, "three");
            put(4, "four");
            put(5, "five");
            put(6, "six");
            put(7, "seven");
            put(8, "eight");
            put(9, "nine");
        }};

        int digit = number % 10;
        return values.get(digit);
    }

    private static void task4() {
        // 4. Напишете метод, който намира колко пъти дадено число се среща в
        // даден масив. Напишете програма, която проверява дали този метод работи правилно.

        int[] numbers = {1, 2, 5, 4, 56, 6, 1, 7, 8, 1, 6, 1, 1};

        int actual = countElementInArray(1, numbers);
        int expected = 5;

        System.out.println(actual == expected);
    }

    private static int countElementInArray(int el, int[] arr) {
        int count = 0;

        for (int anArr : arr) {
            if (el == anArr) {
                count++;
            }
        }

        return count;
    }

    private static void task5() {
        // 5. Напишете метод, който проверява дали елемент,
        // намиращ се на дадена позиция от масив, е по-голям, или съответно по-малък от двата му съседа.

        int[] numbers = {1, 7, 5, 6, 8, 9, 5, 4};

        printElementStatus(5, numbers);
        printElementStatus(2, numbers);
    }

    private static void printElementStatus(int index, int[] arr) {
        int el = arr[index];
        int left = arr[index - 1];
        int right = arr[index + 1];

        if (el > left && el > right) {
            System.out.printf("element %d is bigger than left: %d and right: %d\n", el, left, right);
        } else if (el < left && el < right) {
            System.out.printf("element %d is smaller than left: %d and right: %d\n", el, left, right);
        }
    }

    private static void task6() {
        // 6. Напишете метод, който връща позицията на първия елемент на масив,
        // който е по-голям от двата свои съседи едновременно, или -1, ако няма такъв елемент.

        int[] numbers = {1, 2, 5, 3, 8, 9, 5, 4};

        int actual = getBiggerThanNeighborsElement(numbers);
        int expected = 2;

        System.out.println(actual == expected);
    }

    private static int getBiggerThanNeighborsElement(int[] arr) {
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                return i;
            }
        }

        return -1;
    }

    private static void task7() {
        // 7. Напишете метод, който отпечатва цифрите на дадено десетично число в обратен ред.
        // Например 256, трябва да бъде отпечатано като 652.

        int number = 123456789;
        System.out.println("Original: " + number);
        System.out.println("Reversed: " + reverseDigits(123456789));
    }

    private static int reverseDigits(int number) {
        int reversedNum = 0;

        while (number != 0) {
            reversedNum = reversedNum * 10 + number % 10;
            number = number / 10;
        }

        return reversedNum;
    }

    private static void task8() {
        //8. Напишете програма, която пресмята и отпечатва n! за всяко n в интервала [1..100].

        for (int i = 1; i <= 100; i++) {
            System.out.println("calculate factorial for n = " + i + " is " + fact(i));
        }
    }

    private static BigInteger fact(int n) {
        BigInteger res = new BigInteger("1");

        for (Integer i = 1; i <= n; i++) {
            res = res.multiply(new BigInteger(i.toString()));
        }

        return res;
    }

    private static void task9_b() {
        // Пресмята средното аритметично на дадена редица
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("res = " + (sum / arr.length)); // 5
    }

    private static void task9_c() {
        // Решава линейното уравнение a * x + b = 0
        // a * x + b = 0
        // a * x = -b
        // x = -b/a

        double a = 5.0;
        int b = 7;
        double res = -(b / a);
        System.out.println(res);
    }
}
