package com.introjava.Chapter14.school;

public class Discipline {
    private String name;
    private Integer lessonsCount;
    private Integer exercisesCount;

    public Discipline(String name, Integer lessonsCount, Integer exercisesCount) {
        this.name = name;
        this.lessonsCount = lessonsCount;
        this.exercisesCount = exercisesCount;
    }

    @Override
    public String toString() {
        return "Discipline{" +
                "name='" + name + '\'' +
                ", lessonsCount=" + lessonsCount +
                ", exercisesCount=" + exercisesCount +
                '}';
    }
}
