package com.introjava.Chapter16.linkedlist;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

public class DoublyLinkedListTest {
    private DoublyLinkedList<String> list = new DoublyLinkedList<String>();

    @Test
    public void initialEmptyList() {
        assertThat(list.size(), is(0));
    }

    @Test
    public void addSingleElement() {
        list.add("first");

        String element = list.get(0);

        assertThat(element, is(equalTo("first")));
    }

    @Test
    public void addMultipleElements() {
        list.add("first");
        list.add("second");

        String element = list.get(1);

        assertThat(element, is(equalTo("second")));
    }

    @Test
    public void addElementToPosition() {
        list.add("first");
        list.add("second");
        list.add("fourth");

        list.add(2, "third");

        String[] actual = list.toArray();
        String[] expected = new String[]{"first", "second", "third", "fourth"};

        assertArrayEquals(actual, expected);
    }


    @Test(expected = IndexOutOfBoundsException.class)
    public void getNonexistentElement() {
        list.add("first");
        list.add("second");

        list.get(2);
    }

    @Test
    public void getSize() {
        list.add("first");
        list.add("second");
        list.add("third");

        assertThat(list.size(), is(equalTo(3)));
    }

    @Test
    public void removeElement() {
        list.add("first");
        list.add("second");
        list.add("third");

        list.remove(1);

        assertThat(list.get(1), is(equalTo("third")));
    }

    @Test
    public void containsElement() {
        list.add("first");
        list.add("second");
        list.add("third");
        list.add("fourth");

        assertTrue(list.contains("fourth"));
    }

    @Test
    public void getArray() throws Exception {
        list.add("first");
        list.add("second");
        list.add("third");

        String[] actual = list.toArray();
        String[] expected = new String[]{"first", "second", "third"};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void clearList() {
        list.add("first");
        list.add("second");

        list.clear();

        assertThat(list.size(), is(equalTo(0)));
    }

    @Test
    public void differentType() throws Exception {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);

        assertThat(list.size(), is(equalTo(3)));
        assertThat(list.get(1), is(equalTo(2)));

        list.remove(1);

        Integer[] actual = list.toArray();
        Integer[] expected = new Integer[]{1, 3};

        assertArrayEquals(actual, expected);
    }
}