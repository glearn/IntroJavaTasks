package com.introjava.Chapter14.school;

import java.util.List;

public class Teacher {
    private String firstName;
    private String lastName;
    private List<Discipline> disciplines;

    public Teacher(String firstName, String lastName, List<Discipline> disciplines) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.disciplines = disciplines;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", disciplines=" + disciplines +
                '}';
    }
}
