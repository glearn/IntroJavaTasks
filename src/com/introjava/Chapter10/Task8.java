package com.introjava.Chapter10;

class Task8 {
    public static void main(String[] args) {
        // Даден е масив с цели числа.
        // Напишете програма, която проверява дали в масива съществуват едно или повече числа, чиято сума е N.

        int[] arr = {1, 5, 4, 2, 8};

        int sum = 6;
        System.out.printf("sum = %d\n", sum);

        for (int i = 0; i < arr.length; i++) {
            int first = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                int second = arr[j];

                if ((first + second) == sum)
                    System.out.printf("(%d, %d)\n", first, second);
            }
        }
    }
}