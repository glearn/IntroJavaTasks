package com.introjava.Chapter17;

import java.io.File;
import java.util.LinkedList;
import java.util.Queue;

public class DirectoryTraverserBFS {
    public static void traverseDir(String startDirectory) {
        Queue<File> visited = new LinkedList<File>();

        visited.add(new File(startDirectory));

        while (visited.size() > 0) {
            File currentDir = visited.remove();

            System.out.println(currentDir.getAbsolutePath());

            File[] children = currentDir.listFiles();

            if (children != null) {
                for (File child : children) {
                    if (child.isDirectory()) {
                        visited.add(child);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        traverseDir("/home");
    }
}
