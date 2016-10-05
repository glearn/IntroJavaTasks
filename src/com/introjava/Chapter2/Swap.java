package com.introjava.Chapter2;

public class Swap {
    public static void main(String[] args) {
        /*10.Декларирайте две променливи от тип int. Задайте им стойности
            съответно 5 и 10. Разменете стойностите им и ги отпечатайте.*/

        int a = 5;
        int b = 10;

        b = b + a;
        a = b - a;
        b = b - a;

        System.out.println(a);
        System.out.println(b);
    }
}
