package com.introjava.Chapter6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        task1();

//        task2();

//        task3();

//        task4();
//        task4_v2();

//        task5();

//        task6();

//        task7();

//        task8();

//        task9();

//        task10();

//        task11();

//        task12();

        task13();

//        task14();

//        task15();

//        task16();
    }

    private static void task1() {
        //1. Напишете програма, която отпечатва на конзолата числата от 1 до N.

        System.out.println("Enter number:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        System.out.println("Output:");
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    private static void task2() {
        // 2. Напишете програма, която отпечатва на конзолата числата от 1 до N,
        // които не се делят на 3 и 7. Числото N се чете от стандартния вход.

        System.out.println("Enter number:");

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            if (!(i % 3 == 0) && !(i % 7 == 0)) {
                System.out.printf("%d ", i);
            }
        }
    }

    private static void task3() {
        // 3. Напишете програма, която чете от конзолата поредица от цели числа и
        // отпечатва най-малкото и най-голямото от тях.

        Scanner input = new Scanner(System.in);
        SortedSet<Integer> numbers = new TreeSet<Integer>();

        int number = 1;

        while (number > 0) {
            number = input.nextInt();

            numbers.add(number);
        }

        System.out.println("min: " + numbers.toArray()[1]);
        System.out.println("max: " + numbers.toArray()[numbers.size() - 1]);
    }

    private static void task4() {
        // 4. Напишете програма, която отпечатва всички възможни карти от
        // стандартно тесте без джокери (имаме 52 карти: 4 бои по 13 карти).

        String[] names = new String[]{"Jack", "Queen", "King"};
        String[] colours = new String[]{"Club", "Diamond", "Hearth", "Spade"};

        for (String colour : colours) {
            for (int j = 1; j <= 13; j++) {
                if (j == 1) {
                    System.out.printf("Ace %s\n", colour);
                } else if (j < 11) {
                    System.out.printf("%d %s\n", j, colour);
                } else {
                    System.out.printf("%s %s\n", names[j % 11], colour);
                }
            }
            System.out.println();
        }
    }

    private static void task4_v2() {
        // 4. Напишете програма, която отпечатва всички възможни карти от
        // стандартно тесте без джокери (имаме 52 карти: 4 бои по 13 карти).

        String[] names = new String[]{"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] colours = new String[]{"Club", "Diamond", "Hearth", "Spade"};

        for (String colour : colours) {
            for (int j = 0; j <= 12; j++) {
                System.out.printf("%s %s\n", names[j], colour);
            }
            System.out.println();
        }
    }

    private static void task5() {
        // 5. Напишете програма, която чете от конзолата числото N и отпечатва
        // сумата на първите N члена от редицата на Фибоначи:
        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, ...

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter n:");
//        int n = input.nextInt();

//        int n = 2;
        for (int i = 0; i < 11; i++) {
            System.out.println("fib" + i + " = " + fib(i));
        }
    }

    private static int fib(int n) {
//        if (n < 2) {
//            return 1;
//        }

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fib(n - 1) + fib(n - 2);
    }

    private static void task6() {
        //6. Напишете програма, която пресмята N!/K! за дадени N и K (1<K<N).

        // решение: Умножете числата от K+1 до N (вкл).

        // example: 5! / 2! = 5.4.3.2.1 / 2.1 = 5.4.3 = 20.3 = 60

        int k = 2;
        int n = 5;

        int product = 1;

        for (int i = k + 1; i <= n; i++) {
            product *= i;
        }

        System.out.printf("res: %s", product);
    }

    private static void task7() {
        //7. Напишете програма, която пресмята N!*K!/(N-K)! за дадени N и K.

        int n = 5;
        int k = 4;

        double res = (fact(n) * fact(k)) / fact(n - k);
        System.out.printf("res= %f", res);
    }

    private static long fact(int n) {
        long product = 1;

        for (int i = n; i > 0; i--) {
            product *= i;
        }

        return product;
    }

    private static void task8() {
        // Напишете програма, която за дадено цяло число N, пресмята сумата ...
    }

    private static void task9() {
        // Напишете програма, която изчислява N-тото число на Каталан за дадено N.

        int n = 5;

        double res = fact(2 * n) / (fact(n + 1) * fact(n));

        System.out.println(res);
    }

    private static void task10() {
        // print matrix !!!

        int n = 4;

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= i + (n - 1); j++) {
                System.out.printf("%d ", j);
            }
            System.out.println();
        }
    }

    private static void task11() {
        // 11.Напишете програма, която пресмята на колко нули завършва факториела на дадено число.

        // решение: Броят на нулите зависи от това, колко пъти числото 5 е делител на факториела.

        int n = 20;
        long factN = fact(n);

        int counter = 0;
        boolean isDivisor = true;

        while (isDivisor) {
            if (factN % 5 == 0) {
                counter++;
                factN /= 5;
            } else {
                isDivisor = false;
            }
        }

        System.out.println(counter);
    }

    private static void task12() {
        // 12.Напишете програма, която преобразува дадено число от десетична в двоична бройна система.

//        int n = 177; // 10110001
        int n = 1509; // 10111100101
        String res = decimalToBinary(n);
        System.out.println(res);
    }

    private static String decimalToBinary(int n) {
        StringBuilder binaryNum = new StringBuilder();

        while (n != 0) {
            binaryNum.append(n % 2);
            n = n / 2;
        }

        return binaryNum.reverse().toString();
    }

    private static void task13() {
        // 13.Напишете програма, която преобразува дадено число от двоична в десетична бройна система.

        // 1509 == 10111100101

        String binary = "10111100101";
        int decimal = binaryToDecimal(binary);

        System.out.println(decimal);
    }

    private static int binaryToDecimal(String binary) {
        String reversedBin = new StringBuilder(binary).reverse().toString();
        int sum = 0;

//        for (int i = 0; i < reversedBin.length(); i++) {
//            int n = Integer.parseInt(reversedBin.substring(i, i + 1));
//            sum += n * Math.pow(2, i);
//        }

        for (int i = 0; i < binary.length(); i++) {
            //понеже въведените сиволи са 0 или 1 с кодове съотв. 48 и 49 ще се получи "истинска" 1 или 0
            int x = (binary.charAt(i) - '0');
            sum *= 2;
            sum += x;
        }

        return sum;
    }

    private static void task14() {
        // 14.Напишете програма, която преобразува дадено число от десетична в шестнайсетична бройна система.

//        int n = 150; // 96
//        int n = 29; // 1D
        int n = 11423; // 2C9F
        String hex = decimalToHex(n);
        System.out.println(hex);
    }

    private static String decimalToHex(int n) {
        StringBuilder hexNum = new StringBuilder();
        Map<Integer, String> m = new HashMap<Integer, String>() {{
            put(10, "A");
            put(11, "B");
            put(12, "C");
            put(13, "D");
            put(14, "E");
            put(15, "F");
        }};

        while (n != 0) {
            int tmp = n % 16;

            if (tmp > 9) {
                hexNum.append(m.get(tmp));
            } else {
                hexNum.append(tmp);
            }

            n /= 16;
        }

        return hexNum.reverse().toString();
    }

    private static void task15() {
        // 15.Напишете програма, която преобразува дадено число от шестнайсетична в десетична бройна система.

        String hex = "2C9F"; // 11423
        int decimal = hexToDecimal(hex);
        System.out.println(decimal);
    }

    private static int hexToDecimal(String hex) {
        String reversed = new StringBuilder(hex).reverse().toString();
        int sum = 0;

        for (int i = 0; i < reversed.length(); i++) {
            int n = Integer.parseInt(reversed.substring(i, i + 1), 16);
            sum += n * Math.pow(16, i);
        }

        return sum;
    }

    private static void task16() {
        // 16.Напишете програма, която по дадено число N отпечатва случайно число между 1 и N.

        int n = 5;
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt(n)); // [0,n)
        }
    }
}
