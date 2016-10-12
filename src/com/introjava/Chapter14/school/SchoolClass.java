package com.introjava.Chapter14.school;

import java.util.List;

public class SchoolClass {
    private String textId;
    private List<Student> students;
    private List<Teacher> teachers;

    public SchoolClass(String textId, List<Student> students, List<Teacher> teachers) {
        this.textId = textId;
        this.students = students;
        this.teachers = teachers;
    }

    @Override
    public String toString() {
        return "SchoolClass{" +
                "teachers=" + teachers +
                ", students=" + students +
                ", textId='" + textId + '\'' +
                '}';
    }
}
