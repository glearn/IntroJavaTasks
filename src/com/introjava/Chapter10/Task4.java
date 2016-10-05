package com.introjava.Chapter10;

class Task4 {
    static String[] strings = {"test", "rock", "fun"};
    static String[] str;

    public static void main(String[] args) {
        for (int i = 0; i <= strings.length; i++) {
            str = new String[strings.length];
            allSubSetsOfGivenSetOfWords(0, 0, i);
        }

    }

    static void allSubSetsOfGivenSetOfWords(int currentIteration, int startIndex, int k) {
        if (currentIteration == k) {
            printLoop();
            return;
        }

        for (int i = startIndex; i < strings.length; i++) {
            str[currentIteration] = strings[i];
            allSubSetsOfGivenSetOfWords(currentIteration + 1, i + 1, k);
        }
    }

    static void printLoop() {
        for (int i = 0; i < strings.length; i++) {

            if ((str[i] == null) && i == 0) {

                System.out.print("() ");

            } else if (str[i] == null) {

                continue;

            } else {
                System.out.printf("%s ", str[i]);
            }
        }
        System.out.println();
    }
}