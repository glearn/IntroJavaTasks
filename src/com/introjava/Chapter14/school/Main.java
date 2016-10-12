package com.introjava.Chapter14.school;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        School school = new School(
                "SchoolName",
                new ArrayList<SchoolClass>() {{
                    add(new SchoolClass(
                            "9A",
                            new ArrayList<Student>() {{
                                add(new Student("firstA", "lastA", 1));
                                add(new Student("firstB", "lastB", 2));
                                add(new Student("firstC", "lastC", 3));
                            }},
                            new ArrayList<Teacher>() {{
                                add(new Teacher(
                                        "first1",
                                        "last1",
                                        new ArrayList<Discipline>() {{
                                            add(new Discipline("disc1", 10, 20));
                                        }}));

                                add(new Teacher(
                                        "first2",
                                        "last2",
                                        new ArrayList<Discipline>() {{
                                            add(new Discipline("disc2", 30, 20));
                                            add(new Discipline("disc3", 40, 20));
                                        }}));
                            }}
                    ));
                }}
        );

        System.out.println(school);
    }
}
