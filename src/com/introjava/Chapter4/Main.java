package com.introjava.Chapter4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. Напишете програма, която чете от конзолата три числа от тип int и отпечатва тяхната сума.

//        Scanner input = new Scanner(System.in);
//        Integer sum = 0;
//
//        for (int i = 0; i < 3; i++) {
//            System.out.println("enter " + (i + 1) + " number:");
//            int number = input.nextInt();
//            sum += number;
//        }
//
//        System.out.println("Total: " + sum);

        //2. Напишете програма, която чете от конзолата радиуса "r" на кръг и отпечатва неговия периметър и обиколка.
//        Scanner input = new Scanner(System.in);
//        int r = input.nextInt();
//
//        double p = 2 * Math.PI * r;
//        System.out.println("P = " + p);
//
//        double s = Math.PI * r * r;
//        System.out.println("S = " + s);


        // 3. Дадена фирма има име, адрес, телефонен номер, факс номер, уеб сайт и мениджър.
        // Мениджърът има име, фамилия и телефонен номер. Напишете програма, която чете информацията за компанията и нейния мениджър
        // и я отпечатва след това на конзолата.

//        String companyName;
//        String address;
//        Integer phone;
//        Integer fax;
//        String website;
//        String manager;
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter company info");
//
//        System.out.println("Name:");
//        companyName = input.nextLine();
//
//        System.out.println("Address:");
//        address = input.nextLine();
//
//        System.out.println("Phone:");
//        phone = input.nextInt();
//
//        System.out.println("Fax:");
//        fax = input.nextInt();
//
//        System.out.println("Website:");
//        website = input.next();
//
//        System.out.println("Manager:");
//        manager = input.next();
//
//        System.out.println("***** Company info *****");
//        System.out.println("NAME: " + companyName);
//        System.out.println("ADDRESS: " + address);
//        System.out.println("PHONE: " + phone);
//        System.out.println("FAX: " + fax);
//        System.out.println("WEBSITE: " + website);
//        System.out.println("MANAGER: " + manager);


        //4. Напишете програма, която чете от конзолата две цели числа (integer) и отпечатва,
        // колко числа има между тях, такива, че остатъкът им от деленето на 5 да е 0.

//        Scanner input = new Scanner(System.in);
//        int counter = 0;
//        Integer first = input.nextInt();
//        Integer second = input.nextInt();
//
//        for (int i = first + 1; i < second; i++) {
//            if (i % 5 == 0) {
//                counter++;
//            }
//        }
//
//        System.out.println("Counter: " + counter);


        //5. Напишете програма, която чете от конзолата две цели числа и отпечатва
        //по-голямото от тях. Реализирайте програмата без използването на сравнение. Забележка: задачата изисква малко да помислите!

//        int a = 5;
//        int b = 12;
//
//        //book solution works for specific order and is not good
//        a = a - b;
//        b = b + a;
//        a = b - a;
//
//        System.out.println(a);


        //6. Напишете програма, която чете пет числа и отпечатва тяхната сума.

//        Scanner input = new Scanner(System.in);
//        int sum = 0;
//
//        for (int i = 0; i < 5; i++) {
//            int number = input.nextInt();
//            sum += number;
//        }
//        System.out.println("Total: " + sum);

        //7. Напишете програма, която чете пет числа и отпечатва най-голямото от тях.
        //Забележка: трябва да използвате конструкция "if", която до момента не сме разгледали.

//        Scanner input = new Scanner(System.in);
//        int max = 0;
//        for (int i = 0; i < 5; i++) {
//            int number = input.nextInt();
//            if (number > max) {
//                max = number;
//            }
//        }
//        System.out.println("Max: " + max);
    }
}
