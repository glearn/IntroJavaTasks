package com.introjava.Chapter3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*2. Напишете булев израз, който да проверява дали дадено цяло число се дели на 5 и на 7 без остатък.*/

//        int num = 35;
//
//        boolean isDivisible = num % 5 == 0 && num % 7 == 0;
//
//        System.out.println(isDivisible);


        //3. Напишете израз, който да проверява дали дадено цяло число съдържа  7 за трета цифра (отдясно на ляво).

//        int num = 758;
//
//        for (int i = 0; i < 2; i++) {
//            num = num / 10;
//        }
//
//        System.out.println(num % 10);
//        System.out.println(num % 10 == 7);


        //4. Напишете израз, който да проверява дали третия бит на дадено число е 1 или 0.

//        int num = 13; // 1101
//        int mask = 100;

//        boolean isThirdBitOne = (num & mask) == 4;
//        boolean isThirdBitOne = (num & mask) != 0;
//
//        System.out.println(isThirdBitOne);


        //6. Напишете израз, който изчислява площта на трапец по дадени a, b и h.
//        int a = 5;
//        int b = 7;
//        int h = 9;
//
//        double s = ((a + b) / 2) * h;
//        System.out.println("s=" + s);



        /*

        7. Силата на гравитационното поле на луната е приблизително 17% от
        това на земята. Напишете програма, която да изчислява тежестта на
        човек на луната, по дадената тежест на земята.
         */

//        int earthWeight = 86;
//        double moonWeight = (17 / 100.0) * earthWeight;
//        double moonWeight = 0.17 * earthWeight;
//
//        System.out.println("earth: " + earthWeight);
//        System.out.println("moon: " + moonWeight);


        /*
        8. Напишете програма, която проверява дали дадена точка О (x, y) е вътре в окръжността К ((0,0), 5).
        */

//        int pointX = 3;
//        int pointY = 4;
//
//        int circleX = 0;
//        int circleY = 0;
//        int radius = 5;
//
//        int a = (pointX - circleX) * (pointX - circleX);
//        int b = (pointY - circleY) * (pointY - circleY);
//        int radiusSquared = radius * radius;
//
//        boolean isInsideCircle = (a + b) < radiusSquared;
//
//        System.out.println("is inside circle: " + isInsideCircle);



        /*9. Напишете програма, която проверява дали дадена точка О (x, y) е вътре в окръжността К ((0,0), 5) и е извън правоъгълника ((-1, 1), (5, 5). */
//        int pointX = 3;
//        int pointY = 4;
//
//        int circleX = 0;
//        int circleY = 0;
//        int radius = 5;
//
//        int a = (pointX - circleX) * (pointX - circleX);
//        int b = (pointY - circleY) * (pointY - circleY);
//        int radiusSquared = radius * radius;
//
//        boolean isInsideCircle = (a + b) < radiusSquared;
//        boolean isOutsideRectangle = pointX > 1 || pointX < 5 && pointY > -1 || pointY < 1;


        /*
        10.Напишете програма, която приема за вход четирицифрено число във
        формат abcd и след това извършва следните действия върху него:
        - Пресмята сбора от цифрите на числото.
        - Разпечатва на конзолата цифрите в обратен ред: dcba.
        - Поставя последната цифра, на първо място: dabc.
        - Разменя мястото на втората и третата цифра: acbd.
        */

//        Scanner input = new Scanner(System.in);
//        Stack stack = new Stack<Integer>();
//
//        Integer digit = input.nextInt();
//
//        Integer swappedInt = digit;
//
//        int sum = 0;
//        for (int i = 0; i < 4; i++) {
//            int d = digit % 10;
//            stack.push(d);
//            sum += d;
//            digit /= 10;
//        }
//
//        System.out.println("1) sum: " + sum);
//        System.out.println("2) " + Arrays.toString(stack.toArray()));
//        System.out.println("3) " + swapLastDigit(swappedInt));
//        System.out.println("4) " + swapSecondDigit(swappedInt));




        /*
        11.Дадено е число n и позиция p. Напишете поредица от операции, които да отпечатат стойността на бита на позиция p от числото n (0 или 1).
        Пример: n=35, p=5 -> 1. Още един пример: n=35, p=6 -> 0.
        */

//        int n = 35;
////        int p = 5;
//        int p = 6;
//
//        int tmp = n >> p;
//        int mask = 1;
//
//        int res = tmp & mask;
//        System.out.println(res);


        /*
        12.Дадено е число n, стойност v (v = 0 или 1) и позиция p. Напишете поредица от операции,
        които да променят стойността на n, така че битът на позиция p да има стойност v.
        Пример n=35, p=5, v=0 -> n=3. Още един пример: n=35, p=2, v=1 -> n=39.
        */

//        int n = 35; //000000 100011
//        System.out.println("number before: " + n);
//        int v = 1;
//        int p = 2;
//
//        if (v == 0) {
//            n &= ~(1 << p); // clear bit (make it 0)
//            // 1) move the 1 at pos p e.g. 000000 100000
//            // 2) invert bits         e.g. 111111 011111
//            // 3) bitwise and with the number
//
//            //    000000 100011
//            //  & 111111 011111
//            //    --------------
//            //    000000 000011
//        } else {
//            n |= 1 << p;    // set bit (make it 1)
//            // 1) move the 1 at pos p
//            // 2) bitwise or with the number
//
//            //    000000 100011
//            //  | 000000 000100
//            //    --------------
//            //    000000 100111
//        }
//        System.out.println("number after: " + n);

        /*
         Напишете програма, която проверява дали дадено число n (n < 100) е просто.
         */

//        int n = 6;
//
//        for (int i = 2; i < n; i++) { // check can be mod between 2 and n-1
//            if (n % i == 0) {
//                System.out.println(n + " is not prime");
//                return;
//            }
//        }
//        System.out.println(n + " is prime");


        System.out.println();
    }

    private static int swapSecondDigit(Integer number) {
        String strNum = number.toString();

        String ch0 = String.valueOf(strNum.charAt(0));
        String ch1 = String.valueOf(strNum.charAt(1));
        String ch2 = String.valueOf(strNum.charAt(2));
        String ch3 = String.valueOf(strNum.charAt(3));

        return Integer.parseInt(ch0 + ch2 + ch1 + ch3);
    }

    private static int swapLastDigit(Integer number) {
        int lastDigit = number % 10;
        int remaining = number / 10;

        return Integer.parseInt("" + lastDigit + remaining);
    }
}
