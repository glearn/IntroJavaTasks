package com.introjava.Chapter16.circularqueue;

public class CircularQueue<T> {
    // The add(Object), peek(), poll()

    private Object[] elements;
    private int count = 0;

    public CircularQueue(int capacity) {
        elements = new Object[capacity];
    }

    public void add(T value) {
        if (count == elements.length) {
            for (int i = elements.length - 1; i > 0; i--) {
                elements[i] = elements[i - 1];
            }

            elements[0] = value;

            return;
        }

        elements[count] = value;
        count++;
    }

    public Object peek() {
        return elements[0];
    }

    public Object poll() {
        Object firstEl = elements[0];

        for (int i = 1; i < elements.length; i++) {
            elements[i - 1] = elements[i];
        }

        count--;
        return firstEl;
    }

    public Object[] toArray() {
        Object[] arr = new Object[count];

        for (int i = 0; i < count; i++) {
            arr[i] = elements[i];
        }

        return arr;
    }

    public int size() {
        return count;
    }
}
