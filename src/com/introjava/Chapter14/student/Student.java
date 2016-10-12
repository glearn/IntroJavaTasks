package com.introjava.Chapter14.student;

public class Student {
    public static Integer instanceCount = 0;

    public enum UNI {UNI1, UNI2}

    private String firstName;
    private String middleName;
    private String familyName;
    private Integer year;
    private String major;
    private String university;
    private String email;
    private String phone;

    public Student(String firstName, String middleName, String familyName,
                   Integer year, String major, String university, String email, String phone) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.familyName = familyName;
        this.year = year;
        this.major = major;
        this.university = university;
        this.email = email;
        this.phone = phone;

        instanceCount++;
    }

    public Student(String firstName, String familyName, String major, String university, String email) {
        this(firstName, null, familyName, 0, major, university, email, null);
    }

    public static Integer getInstanceCount() {
        return instanceCount;
    }

    public static void setInstanceCount(Integer instanceCount) {
        Student.instanceCount = instanceCount;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void printInfo() {
        System.out.println("--- info ---");
        System.out.println(firstName);
        System.out.println(middleName);
        System.out.println(familyName);
        System.out.println(year);
        System.out.println(major);
        System.out.println(university);
        System.out.println(email);
        System.out.println(phone);
        System.out.println();
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", familyName='" + familyName + '\'' +
                ", year=" + year +
                ", major='" + major + '\'' +
                ", university='" + university + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
