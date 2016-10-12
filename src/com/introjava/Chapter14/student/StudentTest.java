package com.introjava.Chapter14.student;

public class StudentTest {
    public static Student first;
    public static Student second;
    public static Student third;

    public static void initiate() {
        first = new Student("FirstName1", "LastName1", "CS", "Uni", "first@some.com");
        second = new Student("FirstName2", "LastName2", "CS", "Uni", "second@some.com");
        third = new Student("FirstName2", "LastName2", "CS", "Uni", "second@some.com");
    }

    public static Student getFirst() {
        return first;
    }

    public static Student getSecond() {
        return second;
    }

    public static Student getThird() {
        return third;
    }

    public static void print() {
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }
}
