package com.introjava.Chapter16.linkedlist;

import java.lang.reflect.Array;

public class DoublyLinkedList<T> {
    private static final Integer INITIAL_CAPACITY = 10;
    private Node<T>[] elements;
    private int count = 0;

    public DoublyLinkedList() {
        this.elements = new Node[INITIAL_CAPACITY];
    }

    public void add(T value) {
        if (count == 0) {
            elements[count] = new Node<T>(value, null, null);
            count++;
        } else {
            Node<T> prev = elements[count - 1];
            Node<T> current = new Node<T>(value, elements[count - 1], null);
            prev.next = current;
            elements[count] = current;
            count++;
        }
    }

    public void add(int index, T value) {
        if (count == 0) {
            elements[count] = new Node<T>(value, null, null);
            count++;
        } else {
            int previousIndex = index - 1;
            Node<T> previousEl = elements[previousIndex];
            Node<T> current = new Node<T>(value, elements[count - 1], previousEl.next);
            previousEl.next = current;

            elements[count] = current;
            count++;
        }
    }

    public T get(int index) {
        if (index < 0 || index > count - 1) {
            throw new IndexOutOfBoundsException(
                    String.format("Cannot access %d element from %d total", index, count)
            );
        }

        if (index == 0) {
            return elements[0].value;
        }

        int counter = 1;
        Node<T> current = elements[0];

        while (counter <= index) {
            current = current.next;
            counter++;
        }

        return current.value;
    }

    public void remove(int index) {
        if (index < 0 || index > count - 1) {
            throw new IndexOutOfBoundsException(
                    String.format("Cannot access %d element from %d total", index, count)
            );
        }

        Node<T> current = null;

        for (int i = 0; i < index; i++) {
            current = elements[i].next;
        }

        count--;

        current.previous.next = current.next;
    }

    public boolean contains(T value) {
        boolean contains = false;
        for (int i = 0; i < count; i++) {
            Node<T> current = elements[i];
            if (current.value.equals(value)) {
                contains = true;
                break;
            }
        }

        return contains;
    }

    public void clear() {
        elements = new Node[INITIAL_CAPACITY];
        count = 0;
    }

    public int size() {
        return count;
    }

    public T[] toArray() {
        T[] arr = (T[]) Array.newInstance(elements[0].value.getClass(), count);

        Node<T> current = elements[0];
        arr[0] = current.value;

        for (int i = 1; i < count; i++) {
            current = current.next;
            arr[i] = current.value;
        }

        return arr;
    }

    class Node<T> {
        private T value;
        private Node<T> previous;
        private Node<T> next;

        public Node(T value, Node<T> previous, Node<T> next) {
            this.value = value;
            this.previous = previous;
            this.next = next;
        }
    }
}