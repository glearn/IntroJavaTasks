package com.introjava.Chapter10;

import java.io.File;

public class TraverseDirectory {
    static int total = 0;

    public static void main(String[] args) {
        String dir = "/home/user/Films";
        System.out.printf("The content of %s\n", dir);
        traverse(dir);
        System.out.println("total: " + total);
    }

    public static void traverse(String path) {
        File input = new File(path);

        if (input.isDirectory()) {
            String[] items = input.list();
            total += items.length;

            for (String item : items) {
//                if (new File(path + "/" + item).isDirectory()) {
                    System.out.println(item);
                    traverse(path + "/" + item);
//                }
            }
        }
    }
}
