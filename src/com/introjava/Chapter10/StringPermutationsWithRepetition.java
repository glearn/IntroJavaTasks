package com.introjava.Chapter10;

public class StringPermutationsWithRepetition {

    public static void main(String[] args) {
        // All permutations of a string (allowing repetition of characters)
        // For example for string "ab" the output would be "aa, ab, ba, bb"

        String str = "ab";

        permute("", str);
    }

    static void permute(String prefix, String str) {
        if (prefix.length() == str.length()) {
            System.out.println(prefix);
            return;
        }

        for (int i = 0; i < str.length(); i++)
            permute(prefix + str.charAt(i), str);
    }
}
