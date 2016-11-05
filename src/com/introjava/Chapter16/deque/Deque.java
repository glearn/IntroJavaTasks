package com.introjava.Chapter16.deque;

public class Deque<T> {
    private Node<T> head;
    private Node<T> tail;
    private int count = 0;

    public void addFirst(T value) {
        if (head == null) {
            head = new Node<T>(value, null);
            tail = head;
        } else {
            Node<T> currentHead = head;
            head = new Node<T>(value, currentHead);
            tail = currentHead;

        }
        count++;
    }

    public void addLast(T value) {
        if (tail == null) {
            head = new Node<T>(value, null);
            tail = head;
        } else {
            tail.next = new Node<T>(value, null);
            tail = tail.next;
        }
        count++;
    }

    public void removeFirst() {
        head = head.next;
        count--;
    }

    public void removeLast() {
        Node<T> current = head;
        Node<T> prev = null;
        while (current.next != null) {
            current = current.next;
            prev = current;
        }

        prev.next = null;
        count--;
    }

    public void clear() {
        head = tail = null;
        count = 0;
    }

    public Object[] toArray() {
        Object[] arr = new Object[count];

        if (count == 0) {
            return arr;
        }

        Node<T> current = head;
        arr[0] = current.value;

        for (int i = 1; i < count; i++) {
            current = current.next;
            arr[i] = current.value;
        }

        return arr;
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
