package com.introjava.Chapter14.school;

import java.util.List;

public class School {
    private String name;
    private List<SchoolClass> classes;

    public School(String name, List<SchoolClass> classes) {
        this.name = name;
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", classes=" + classes +
                '}';
    }
}
