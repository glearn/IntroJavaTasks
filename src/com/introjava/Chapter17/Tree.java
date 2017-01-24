package com.introjava.Chapter17;

import java.util.ArrayList;
import java.util.List;

public class Tree<T> {
    public static class Node<T> {
        private T value;
        private boolean hasParent;
        private List<Node<T>> children;

        public Node(T value) {
            if (value == null) {
                throw new IllegalArgumentException("Cannot insert null value!");
            }
            this.value = value;
            this.children = new ArrayList<Node<T>>();
        }

        public void addChild(Node<T> child) {
            if (child == null) {
                throw new IllegalArgumentException("Cannot insert null value!");
            }

            if (child.hasParent) {
                throw new IllegalArgumentException("The node already has a parent!");
            }

            child.hasParent = true;
            children.add(child);
        }

        public Node<T> getChild(int index) {
            return children.get(index);
        }

        public int getChildrenCount() {
            return children.size();
        }
    }

    private Node<T> root;

//    public Tree(T value) {
//        if (value == null) {
//            throw new IllegalArgumentException("Cannot insert null value!");
//        }
//        this.root = new Node<T>(value);
//    }

    public Tree(T root, Tree<T>... children) {
//        this(root);

        if (root == null) {
            throw new IllegalArgumentException("Cannot insert null value!");
        }
        this.root = new Node<T>(root);

        for (Tree<T> child : children) {
            this.root.addChild(child.root);
        }
    }

    private void printDFS(Node<T> root, String spaces) {
        if (root == null) {
            return;
        }

        System.out.println(spaces + root.value);

        Node<T> child;

        for (int i = 0; i < root.getChildrenCount(); i++) {
            child = root.getChild(i);
            printDFS(child, spaces + "   ");
        }
    }

    public void printDFS() {
        printDFS(root, new String());
    }

    public static void main(String[] args) {
        Tree<Integer> tree =
                new Tree<Integer>(7,
                        new Tree<Integer>(19,
                                new Tree<Integer>(1),
                                new Tree<Integer>(12),
                                new Tree<Integer>(31)),
                        new Tree<Integer>(21),
                        new Tree<Integer>(14,
                                new Tree<Integer>(23),
                                new Tree<Integer>(6))
                );
        tree.printDFS();

//        7
//          19
//             1
//             12
//             31
//          21
//          14
//             23
//             6

    }
}
