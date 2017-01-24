package com.introjava.Chapter17;

public class BinaryTree<T> {
    public static class Node<T> {
        private T value;
        private Node<T> leftChild;
        private Node<T> rightChild;

        /**
         * Constructs a binary tree node.
         *
         * @param value      - the value of the node.
         * @param leftChild  - the left child of the node.
         * @param rightChild - the right child of the node.
         */
        public Node(T value, Node<T> leftChild, Node<T> rightChild) {
            if (value == null) {
                throw new IllegalArgumentException("Cannot insert null value!");
            }
            this.value = value;
            this.leftChild = leftChild;
            this.rightChild = rightChild;
        }
    }

    private Node<T> root;

    public BinaryTree(T value, BinaryTree<T> leftChild, BinaryTree<T> rightChild) {
        if (value == null) {
            throw new IllegalArgumentException();
        }
        Node<T> leftChildNode = leftChild != null ? leftChild.root : null;
        Node<T> rightChildNode = rightChild != null ? rightChild.root : null;
        this.root = new Node<T>(value, leftChildNode, rightChildNode);
    }

    /**
     * Constructs the tree.
     *
     * @param value - the value of the node.
     */
    public BinaryTree(T value) {
        this(value, null, null);
    }

    /**
     * Traverses binary tree in pre-order manner.
     *
     * @param root - the binary tree to be traversed.
     */
    private void printPreOrder(Node<T> root) {
        if (root == null) {
            return;
        }
        // 1. Visit the left child.
        printPreOrder(root.leftChild);
        // 2. Visit the root of this subtree.
        System.out.print(root.value + " ");
        // 3. Visit the right child.
        printPreOrder(root.rightChild);
    }

    /**
     * Traverses and prints the binary
     * tree in pre-order manner.
     */
    public void printPreOrder() {
        System.out.print("pre-order: ");
        printPreOrder(this.root);
        System.out.println();
    }

    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree =
                new BinaryTree<Integer>(14,
                        new BinaryTree<Integer>(19,
                                new BinaryTree<Integer>(23),
                                new BinaryTree<Integer>(6,
                                        new BinaryTree<Integer>(10),
                                        new BinaryTree<Integer>(21))),
                        new BinaryTree<Integer>(15,
                                new BinaryTree<Integer>(3),
                                null));

        binaryTree.printPreOrder();  // 23 19 10 6 21 14 3 15
    }
}
