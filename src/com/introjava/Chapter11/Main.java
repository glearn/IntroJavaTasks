package com.introjava.Chapter11;

class Main {
    public static void main(String[] args) {
//        task1();

//        task2();

//        task4();

        task5();
    }

    public static void task1() {
        // 1. Напишете програма, която извежда на стандартния изход броя на дните, часовете и минутите,
        // които са изтекли от 1 януари 1970 година до момента на изпълнението на програмата.
        // За реализацията използвайте класа System.

        long currentTimeInMillis = System.currentTimeMillis();

        // days = currentTimeInMillis / millisInDay
        long days = currentTimeInMillis / (60 * 60 * 24 * 1000);
        System.out.println(days);

        // hours = currentTimeInMillis / millisInHour
        long hours = currentTimeInMillis / (60 * 60 * 1000);
        System.out.println(hours);

        // minutes = currentTimeInMillis / millisInMinute
        long minutes = currentTimeInMillis / (60 * 1000);
        System.out.println(minutes);
    }

    public static void task2() {
        // 2. Напишете програма, която по дадени два катета намира хипотенузата на правоъгълен триъгълник.
        // Реализирайте въвеждане на дължините на катетите от стандартния вход,
        // а за пресмятането на хипотенузата използвайте методи на класа Math.


        // a^2 + b^2 = c^2

        int side = 5;

        System.out.println(Math.sqrt(Math.pow(side, 2) + Math.pow(side, 2)));
    }

    public static void task4() {
        System.out.println(Sequence.next());
        System.out.println(Sequence.next());
        System.out.println(Sequence.next());

        for (int i = 1; i <= 10; i++) {
            new Cat("cat" + i).sayMuiau();
        }
    }

    public static void task5(){
        System.out.println(new RandomGreeting().generate());
    }
}