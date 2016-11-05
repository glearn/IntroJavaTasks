package com.introjava.Chapter16.stack;

public class DynamicStack<T> {
    private static final int INITIAL_CAPACITY = 10;

    private Node<T>[] elements = new Node[INITIAL_CAPACITY];
    private int counter = 0;

    public void push(T value) {
        if (counter == 0) {
            elements[counter] = new Node<T>(value, null);
            counter++;
        } else {
            Node<T> previous = elements[counter];
            Node<T> current = new Node<T>(value, previous);
            elements[counter] = current;
            counter++;
        }
    }

    public T pop() {
        Node<T> element = elements[counter - 1];
        elements[counter - 1] = null;
        counter--;
        return element.value;
    }

    public T peek() {
        return elements[counter - 1].value;
    }

    public int search(T value) {
        int index = 1;

        for (int i = counter - 1; i >= 0; i--) {
            Node<T> current = elements[i];
            if (current.value.equals(value)) {
                return index;
            } else if (i == 0) {
                index =- 2;
            }
            index++;
        }

        return index;
    }

    public boolean isEmpty() {
        return counter == 0;
    }

    class Node<T> {
        T value;
        Node<T> next;

        public Node(T value, Node<T> next) {
            this.value = value;
            this.next = next;
        }
    }
}
