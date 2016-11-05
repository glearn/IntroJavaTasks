package com.introjava.Chapter16.circularqueue;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;

public class CircularQueueTest {
    private CircularQueue<String> queue = new CircularQueue<String>(3);

    @Test
    public void emptyInitialQueue() {
        assertThat(queue.size(), is(0));
    }

    @Test
    public void addElement() throws Exception {
        queue.add("first");

        assertThat(queue.size(), is(1));
    }

    @Test
    public void arrayWithSingleElement() throws Exception {
        queue.add("first");

        Object[] actual = queue.toArray();
        Object[] expected = new Object[]{"first"};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void arrayWithMultipleElements() throws Exception {
        queue.add("first");
        queue.add("second");

        Object[] actual = queue.toArray();
        Object[] expected = new Object[]{"first", "second"};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void arrayOnMaxAllowLimit() throws Exception {
        queue.add("first");
        queue.add("second");
        queue.add("third");

        Object[] actual = queue.toArray();
        Object[] expected = new Object[]{"first", "second", "third"};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void overflowElements() throws Exception {
        queue.add("first");
        queue.add("second");
        queue.add("third");
        queue.add("fourth");

        Object[] actual = queue.toArray();
        Object[] expected = new Object[]{"fourth", "first", "second"};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void overflowSeveralElements() throws Exception {
        queue.add("a");
        queue.add("b");
        queue.add("c");
        queue.add("d");
        queue.add("e");

        // a b c
        // d a b
        // e d a

        Object[] actual = queue.toArray();
        Object[] expected = new Object[]{"e", "d", "a"};


        assertArrayEquals(actual, expected);
    }

    @Test
    public void peek() throws Exception {
        queue.add("first");
        queue.add("second");
        queue.add("third");
        queue.add("fourth");
        queue.add("fifth");

        String el = (String) queue.peek();

        Object[] actual = queue.toArray();
        Object[] expected = new Object[]{"fifth", "fourth", "first"};

        assertThat(el, is(equalTo("fifth")));
        assertArrayEquals(actual, expected);
    }

    @Test
    public void poll() throws Exception {
        queue.add("first");
        queue.add("second");
        queue.add("third");
        queue.add("fourth");
        queue.add("fifth");

        String el = (String) queue.poll();

        Object[] actual = queue.toArray();
        Object[] expected = new Object[]{"fourth", "first"};

        assertThat(el, is(equalTo("fifth")));
        assertThat(queue.size(), is(2));
        assertArrayEquals(actual, expected);
    }
}
