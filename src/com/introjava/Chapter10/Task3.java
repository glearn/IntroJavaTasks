package com.introjava.Chapter10;

public class Task3 {
    static int k = 2;
    static String[] strings = {"test", "rock", "fun"};
    static String[] str = new String[k];

    public static void main(String[] args) {
        // task 1 and task 2 in Combinatorics dir

        task3();
    }

    private static void task3() {
        // Да се напише програма, която генерира всички подмножества съставено от k на брой символни низа,
        // избрани измежду елементите на това множество.

        kLengthSubarrays(0, 0);
    }

    public static void kLengthSubarrays(int currentIteration, int startIndex) {
        if (currentIteration == k) {
            for (int i = 0; i < k; i++) {
                System.out.printf("%s ", str[i]);
            }
            System.out.println();
            return;
        }

        for (int i = startIndex; i < strings.length; i++) {
            str[currentIteration] = strings[i];

            kLengthSubarrays(currentIteration + 1, i + 1);
            // i+1 реално прави задачата да е без повторения
        }
    }

}
