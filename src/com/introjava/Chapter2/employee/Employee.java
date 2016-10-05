package com.introjava.Chapter2.employee;

public class Employee {
    public final Long Id;
    public final Long uId;
    public final String name;
    public final String lastName;
    public final Integer age;
    public final char sex;

    public Employee(Long id, Long uId, String name, String lastName, Integer age, char sex) {
        this.Id = id;
        this.uId = uId;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Id=" + Id +
                ", uId=" + uId +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
