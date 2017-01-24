package com.introjava.Chapter17.tasks;

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

    public int countNumberInNodes(int number) {
        return countNumberInNodesDFS(number, root, 0);
    }

    private int countNumberInNodesDFS(int number, Node<T> root, int counter) {
        if (root == null) {
            return counter;
        }

        Node<T> child;

        for (int i = 0; i < root.getChildrenCount(); i++) {
            child = root.getChild(i);
            if (child.value.equals(number)) {
                counter++;
            }
            counter = countNumberInNodesDFS(number, child, counter);
        }
        return counter;
    }

    public List<Integer> findRootsOfSubtreesWithKChildren(int k) {
        return countKChildren(root, k, new ArrayList<Integer>());
    }

    private List<Integer> countKChildren(Node<T> root, int k, List<Integer> res) {
        if (root == null) {
            return res;
        }

        Node<T> child;

        for (int i = 0; i < root.getChildrenCount(); i++) {
            child = root.getChild(i);

            if (child.children.size() == k) {
                res.add((Integer) child.value);
            }

            countKChildren(child, k, res);
        }
        return res;
    }
}
