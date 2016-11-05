package com.introjava.Chapter16.deque;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertArrayEquals;


public class TestDeque {
    private Deque<String> deque = new Deque<String>();

    @Test
    public void emptyInitial() throws Exception {
        assertThat(deque.toArray().length, is(0));
    }

    @Test
    public void addFirst() {
        deque.addFirst("a");
        deque.addFirst("b");
        deque.addFirst("c");
        deque.addFirst("d");

        Object[] actual = deque.toArray();
        Object[] expected = new String[]{"d", "c", "b", "a"};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void addLast() {
        deque.addLast("a");
        deque.addLast("b");
        deque.addLast("c");
        deque.addLast("d");

        Object[] actual = deque.toArray();
        Object[] expected = new String[]{"a", "b", "c", "d"};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void removeFirst() throws Exception {
        deque.addFirst("a");
        deque.addFirst("b");
        deque.addFirst("c");
        deque.addFirst("d");
        deque.addFirst("e");
        deque.addFirst("f");

        deque.removeFirst();
        deque.removeFirst();

        Object[] actual = deque.toArray();
        Object[] expected = new Object[]{"d", "c", "b", "a"};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void removeLast() throws Exception {
        deque.addLast("a");
        deque.addLast("b");
        deque.addLast("c");
        deque.addLast("d");
        deque.addLast("e");
        deque.addLast("f");

        deque.removeLast();
        deque.removeLast();

        Object[] actual = deque.toArray();
        Object[] expected = new Object[]{"a", "b", "c", "d"};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void clear() throws Exception {
        deque.addFirst("a");
        deque.addFirst("b");
        deque.addFirst("c");

        deque.clear();

        assertThat(deque.toArray().length, is(0));
    }
}
