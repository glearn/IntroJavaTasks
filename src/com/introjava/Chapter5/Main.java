package com.introjava.Chapter5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // required types for switch: byte, char, short or int


//        System.out.println(5.0 == 5L);
//
//        double num = 1.0;
//        double sum = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
//        System.out.println("num: " + num);
//        System.out.println("sum: " + sum);
//        System.out.println(num == sum);

        //------------------------------------------------------------------------------------

        /*
            1. Да се напише if-конструкция, която изчислява стойността на две
            целочислени променливи и разменя техните стойности, ако стойността
            на първата променлива е по-голяма от втората.
         */

//        int a = 7;
//        int b = 5;
//        int tmp = 0;
//
//        System.out.println("before");
//        System.out.println("a="+a);
//        System.out.println("b="+b);
//
//        if (a > b) {
//            tmp = b;
//            b = a;
//            a = tmp;
//        }
//
//        System.out.println("after");
//        System.out.println("a="+a);
//        System.out.println("b="+b);

        //------------------------------------------------------------------------------------

//        int a = 5;
//        int b = 7;
//
//        b = a + b;
//        a = b - a;
//        b = b - a;
//
//        System.out.println(a);
//        System.out.println(b);

        //------------------------------------------------------------------------------------

        /*
            3. Напишете програма, която намира най-голямото по стойност число,
            измежду три дадени числа.
         */

//        int[] numbers = new int[]{24, 9, 12};
//
//        int max = numbers[0];
//
//        for (int i = 1; i <= numbers.length - 1; i++) {
//            if (max < numbers[i]) {
//                max = numbers[i];
//            }
//        }
//
//        System.out.println(max);

        //------------------------------------------------------------------------------------

        /*
            4. Напишете програма, която за дадена цифра (0-9), зададена като вход,
            извежда името на цифрата на български език.
        */

//        Map<Integer, String> digits = new HashMap<Integer, String>() {{
//            put(0, "Нула");
//            put(1, "Едно");
//            put(2, "Две");
//            put(3, "Три");
//            put(4, "Четири");
//            put(5, "Пет");
//            put(6, "Шест");
//            put(7, "Седем");
//            put(8, "Осем");
//            put(9, "Девет");
//        }};
//
//        System.out.println(digits.get(5));

        //------------------------------------------------------------------------------------


        /*5.
                Напишете програма, която при въвеждане на коефициентите (a, b и c) на квадратно уравнение:
                ax^2 + bx + c , изчислява и извежда неговите реални корени.
        */

//        int a = 1;
//        int b = 18;
//        int c = 3;
//
//        double d = Math.sqrt((b * b) - (4 * a * c));
//        System.out.println(d);
//
//        if (d < 0) {
//            System.out.println("d < 0");
//            return;
//        }
//
//        if (d == 0) {
//            double x = -b / (2 * a);
//            System.out.println(x);
//        } else {
//            double x1 = (-b + Math.sqrt(d)) / (2 * a);
//            double x2 = (-b - Math.sqrt(d)) / (2 * a);
//
//            System.out.println(x1);
//            System.out.println(x2);
//        }
        //------------------------------------------------------------------------------------


        /*
             6. Напишете програма, която намира най-голямото по стойност число
             измежду дадени 5 числа.
        */

        // see 3.

        //------------------------------------------------------------------------------------

        /*
            7. Дадени са няколко цели числа. Напишете програма, която намира онези
            подмножества от тях, които имат сума 0. Примери:
            - Ако са дадени числата {-2, -1, 1}, сумата на -1 и 1 е 0.
            - Ако са дадени числата {3, 1, -7}, няма подмножества със сума 0.
        */

//        int[] numbers = new int[]{-2, -1, 1};
////        int[] numbers = new int[]{3, 1, -7};
//        List<Integer> tmp = new ArrayList<Integer>();
//
//        for (int i = 0; i <= numbers.length - 1; i++) {
////            System.out.println("i=" + i + "(" + numbers[i] + ")");
//
//            for (int j = 0; j <= numbers.length - 1; j++) {
//                if (j != i) {
////                    System.out.println("j" + j + "=" + numbers[j]);
//                    int a = numbers[i];
//                    int b = numbers[j];
//
//                    if (!tmp.contains(a) && !tmp.contains(b)) {
//                        if (a + b == 0) {
//                            tmp.add(a);
//                            tmp.add(b);
//
//                            System.out.println("sum of " + a + " and " + b + " = 0");
//                        }
//                    }
//                }
//            }
////            System.out.println();
//        }

        //------------------------------------------------------------------------------------


        /*
             8. Напишете програма, която прилага бонус точки към дадени точки в
                интервала [1..9] чрез прилагане на следните правила:
                - Ако точките са между 1 и 3, програмата ги умножава по 10.
                - Ако точките са между 4 и 6, ги умножава по 100.
                - Ако точките са между 7 и 9, ги умножава по 1000.
                - Ако точките са 0 или повече от 9, се отпечатва съобщение за грешка.
        */

//        int points = 7;
//
//        if (points >= 1 && points <= 3) {
//            points = points * 10;
//        }
//
//        if (points >= 4 && points <= 6) {
//            points = points * 100;
//        }
//
//        if (points >= 7 && points <= 9) {
//            points = points * 1000;
//        }
//
//        if (points == 0 && points > 9) {
//            System.out.println("Points not in range");
//        }
//
//        System.out.println(points);

        //------------------------------------------------------------------------------------


        /*
             9. Напишете програма, която преобразува дадено число в интервала
                [0..999] в текст, съответстващ на българското произношение. Примери:
                - 0 : "Нула"
                - 273 : "Двеста седемдесет и три"
                - 400 : "Четиристотин"
                - 501 : "Петстотин и едно"
                - 711 : "Седемстотин и единадесет"
        */

        Map<Integer, String> m1 = new HashMap<Integer, String>() {{
            put(1, "едно");
            put(2, "две");
            put(3, "три");
            put(4, "четири");
            put(5, "пет");
            put(6, "шест");
            put(7, "седем");
            put(8, "осем");
            put(9, "девет");
        }};

        Map<Integer, String> m2 = new HashMap<Integer, String>() {{
            put(10, "десет");
            put(11, "единадесет");
            put(12, "дванадесет");
            put(13, "тринадесет");
            put(14, "четиринадесет");
            put(15, "петнадесет");
            put(16, "шестнадесет");
            put(17, "седемнадесет");
            put(18, "осемнадесет");
            put(19, "деветнадесет");
        }};

        Map<Integer, String> m3 = new HashMap<Integer, String>() {{
            put(2, "двадесет");
            put(3, "тридесет");
            put(4, "четиридесет");
            put(5, "петдесет");
            put(6, "шестдесет");
            put(7, "седемдесет");
            put(8, "осемдесет");
            put(9, "деветдесет");
        }};

        Map<Integer, String> m4 = new HashMap<Integer, String>() {{
            put(1, "сто");
            put(2, "двеста");
            put(3, "триста");
            put(4, "четиристотин");
            put(5, "петстотин");
            put(6, "шестстотин");
            put(7, "седемстотин");
            put(8, "осемстотин");
            put(9, "деветстотин");
        }};


        int[] numbers = new int[]{1, 2, 10, 50, 40, 80, 15, 19, 21, 54, 124, 952, 999};

        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            String res = "";

            if (number < 10) {
                res = m1.get(number);
            } else if (number > 9 && number < 20) {
                res = m2.get(number);
            } else if (number > 19 && number < 100) {

                int d1 = number / 10;
                int d2 = number % 10;

                if (d2 == 0) {
                    res = m3.get(d1);
                } else {
                    res = m3.get(d1) + " и " + m1.get(d2);
                }
            } else if (number > 99 && number < 1000) {
                int d1 = number / 100;
                int d2 = (number / 10) % 10;
                int d3 = (number % 100) % 10;

                res = m4.get(d1) + " " + m3.get(d2) + " и " + m1.get(d3);
            }

            System.out.println(number + " - " + res);
        }
    }
}
