package com.introjava.Chapter16.stack;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

public class DynamicStackTest {
    private DynamicStack<String> stack = new DynamicStack<String>();

    @Test
    public void initialIsEmpty() {
        assertTrue(stack.isEmpty());
    }

    @Test
    public void addSingleElement() throws Exception {
        stack.push("first");

        String actual = stack.pop();

        assertThat(actual, is(equalTo("first")));
        assertTrue(stack.isEmpty());
    }

    @Test
    public void addMultipleElement() throws Exception {
        stack.push("first");
        stack.push("second");

        String actual = stack.pop();

        assertThat(actual, is(equalTo("second")));
    }

    @Test
    public void popMultipleElements() throws Exception {
        stack.push("first");
        stack.push("second");

        String[] actual = {stack.pop(), stack.pop()};
        String[] expected = {"second", "first"};

        assertArrayEquals(actual, expected);
        assertTrue(stack.isEmpty());
    }

    @Test
    public void peek() throws Exception {
        stack.push("first");
        stack.push("second");

        String res = stack.peek();
        String element = stack.pop();

        assertThat(res, is(equalTo("second")));
        assertThat(element, is(equalTo("second")));
    }

    @Test
    public void search() throws Exception {
        stack.push("first");
        stack.push("second");
        stack.push("third");
        stack.push("fourth");
        stack.push("fifth");
        stack.push("sixth");

        int third = stack.search("third");
        int first = stack.search("first");
        int nonexistent = stack.search("asd");

        assertThat("first",first, is(6));
        assertThat("third",third, is(4));
        assertThat(nonexistent, is(-1));

//        Stack<String> stack = new Stack<String>();
//        stack.push("first");
//        stack.push("second");
//        stack.push("third");
//
//        System.out.println(stack.search("third")); // 1
//        System.out.println(stack.search("first")); // 3
//        System.out.println(stack.search("asd")); // -1
    }
}
