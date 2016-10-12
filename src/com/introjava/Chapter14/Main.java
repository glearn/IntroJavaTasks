package com.introjava.Chapter14;

import com.introjava.Chapter14.gsm.Battery;
import com.introjava.Chapter14.gsm.Call;
import com.introjava.Chapter14.gsm.Display;
import com.introjava.Chapter14.gsm.GSM;
import com.introjava.Chapter14.student.Student;
import com.introjava.Chapter14.student.StudentTest;

import java.util.Date;

import static com.introjava.Chapter14.student.Student.UNI.UNI1;

public class Main {
    public static void main(String[] args) {
//        task1();

//        task2();

//        task3();

//        task4();

//        task6();

//        task7();

//        task9();

//        task10();

//        task13();

//        task15();

//        task16();
    }

    public static void task1() {
        System.out.println(new Student("Peter", "Ivanov", "Petrov", 2, "CS", UNI1.name(), "peter@some.com", "+359555665"));
    }

    public static void task2() {
        System.out.println(new Student("Peter", "Petrov", "CS", "Uni", "peter@some.com"));
    }

    public static void task3() {
        System.out.println(new Student("FirstName1", "LastName1", "CS", "Uni", "first@some.com"));
        System.out.println(new Student("FirstName2", "LastName2", "CS", "Uni", "second@some.com"));
        System.out.println(new Student("FirstName3", "LastName3", "CS", "Uni", "third@some.com"));

        System.out.println(Student.instanceCount); // 3
    }

    public static void task4() {
        new Student("Peter", "Ivanov", "Petrov", 2, "CS", "Uni", "peter@some.com", "+359555665").printInfo();
    }

    public static void task6() {
        Student first = new Student("FirstName1", "LastName1", "CS", "Uni", "first@some.com");
        Student second = new Student("FirstName2", "LastName2", "CS", "Uni", "second@some.com");
        Student third = new Student("FirstName3", "LastName3", "CS", "Uni", "third@some.com");

        first.printInfo();
        second.printInfo();
        third.printInfo();

        System.out.println(Student.instanceCount == 3);
    }

    public static void task7() {
        StudentTest.initiate();
        StudentTest.getFirst().printInfo();
        StudentTest.print();
    }

    public static void task9() {
        System.out.println(new GSM("modeA", "manifacturer1", 199.39, new Battery(4400), new Display(5.5)));
    }

    public static void task10() {
        new GSM().printNokiaN95Info();
    }

    public static void task13() {
        System.out.println(new Call(15, new Date()));
    }

    public static void task15() {
        GSM gsm = new GSM();

        System.out.println("all");
        System.out.println(gsm.getCallHistory().toString());

        gsm.removeCall(1);

        System.out.println("\nremoved index 1");
        System.out.println(gsm.getCallHistory().toString());

        gsm.addCall(new Call(40, new Date(1676208257)));

        System.out.println("\nadded call");
        System.out.println(gsm.getCallHistory().toString());

        gsm.deleteCallHistory();

        System.out.println("\ndeleted history");
        System.out.println(gsm.getCallHistory().toString());
    }

    public static void task16() {
        GSM gsm = new GSM();

        System.out.println("number of calls: " + gsm.getCallHistory().size());
        System.out.println("total cost: " + gsm.calculateTotalCallCost(0.50));
    }
}
