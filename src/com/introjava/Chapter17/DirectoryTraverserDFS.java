package com.introjava.Chapter17;

import java.io.File;

public class DirectoryTraverserDFS {
    private static void traverseDir(File dir, String spaces) {
        // If the current element is a directory,
        // we get all it subdirectories and files
        if (dir.isDirectory()) {
            System.out.println(spaces + dir.getAbsolutePath());
            String[] children = dir.list();
            // For each child go and visit its subtree
            for (String child : children) {
                traverseDir(new File(dir, child), spaces + "   ");
            }
        }
    }

    /**
     * Traverses and prints given directory recursively.
     *
     * @param directoryPath - the path to the directory which
     *                      should be traversed.
     */
    public static void traverseDir(String directoryPath) {
        traverseDir(new File(directoryPath), new String());
    }

    public static void main(String[] args) {
        traverseDir("/home");
    }
}
