package com.introjava.Chapter6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainExamplesCh6 {
    public static void main(String[] args) throws IOException {
//        System.out.println(isPrimeNum(37));
//        System.out.println(isPrimeNum(34));

//        System.out.println(fact(5)); // 120

//        System.out.println(productInRange(2, 6));

//        System.out.println(power(5, 3));

//        System.out.println(sum(26));

        //---------------------------------------------------

//        List<String> names = new ArrayList<String>() {{
//            add("Peter");
//            add("John");
//        }};
//
//        for (String name : names) {
//            System.out.println(name);
//        }

        //---------------------------------------------------

//        printTriangle(5);

//        primeInRange(3, 75);

//        printHappyNumbers();

        toto6from49();
    }

    //------------------------------------------------------------------------------------------------------------
    private static boolean isPrimeNum(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
//            System.out.println("print1"); // printed for prime
        }
//        System.out.println("print2"); // printed for  prime
        return true;
    }

    private static boolean isPrimeNum2(int num) {
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
                // при достигане на оператора break, независимо дали условието за излизане от цикъла е изпълнено,
                // изпълнението на цикъла се прекратява, като кода след break не се изпълнява.
            }
//            System.out.println("print3");  // printed for prime
        }
//        System.out.println("print4");  // printed for prime
        return isPrime;
    }

    //------------------------------------------------------------------------------------------------------------

    private static int fact(int n) {
        // n! = 1*2*...*n
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res *= i;
        }
        return res;
    }

    private static int productInRange(int start, int end) {
        int product = 1;

        for (int i = start; i <= end; i++) {
            product *= i;
        }

        return product;
    }

    private static int power(int number, int power) {
        //example;  5 ^ 3 == 5 * 5 * 5

        int product = number;

        for (int i = 1; i < power; i++) {
            product *= number;
        }

        return product;
    }

    private static int sum(int n) {
//        Ще намерим сумата на всички нечетни естествени числа в интервала
//        [1...n], който не се делят на 7.

        int sum = 0;

        for (int i = 1; i < n; i += 2) {
//            if (i % 7 == 0) {
//                continue;
//            }
//
//            sum += i;

            if (i % 7 != 0) {
                sum += i;
            }
        }

        return sum;
    }


    private static void printTriangle(int n) {
        // по дадено число n да отпечатаме на конзолата триъгълник с n на брой реда

        for (int i = 1; i <= n; i++) { // обхожда редовете

            for (int j = 1; j <= i; j++) { // обхожда елементите
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }

    private static void primeInRange(int n, int m) {
        for (int i = n; i <= m; i++) {
            if (isPrimeNum(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private static void printHappyNumbers() {
        // Целта е да намерим и  отпечатаме всички четирицифрени числа от вида ABCD, за които:
        // A + B = C + D (наричаме ги щастливи числа)

//        List<Integer> numbers = new ArrayList<Integer>();

        for (int a = 1; a < 10; a++) { // if a start from 1 there is no need to check if constructed number is > 1000 and to add it to numbers
            for (int b = 0; b < 10; b++) {
                for (int c = 0; c < 10; c++) {
                    for (int d = 0; d < 10; d++) {
                        if ((a + b) == (c + d)) {
//                            int number = (a * 1000) + (b * 100) + (c * 10) + d;
//                            numbers.add(number);

                            System.out.printf("%d%d%d%d%n", a, b, c, d);

                        }
                    }
                }
            }
        }

//        System.out.println("Total found: " + numbers.size());
//
//        for (Integer number : numbers) {
//            System.out.println(number);
//        }
    }


    private static void toto6from49() throws IOException {
        // Задача да намерим всички възможни комбинации от тото 6/49

        // Трябва да намерим и отпечатаме всички възможни извадки от 6 различни числа в интервала [1...49].

        // има изискване, че числата не могат да се повтарят. Затова
        // вътрешните цикли няма да започват от 1, а от числото, до което е стигнал
        // предходния цикъл + 1. За да избегнем повторенията ще се стремим всяко
        // следващо число да е по-голямо от предходното. Първият цикъл ще трябва
        // да го въртим до 44 (а не до 49), вторият до 45, и т.н. Последният цикъл ще
        // е до 49. Ако въртим всички цикли до 49, ще получим съвпадащи числа в
        // някои от комбинациите. По същата причина всеки следващ цикъл започва
        // от брояча на предходния + 1

//        FileWriter writer = new FileWriter(new File("toto.txt"));

        long start = System.currentTimeMillis();

        for (int i1 = 1; i1 <= 44; i1++) {
            for (int i2 = i1 + 1; i2 <= 45; i2++)
                for (int i3 = i2 + 1; i3 <= 46; i3++)
                    for (int i4 = i3 + 1; i4 <= 47; i4++)
                        for (int i5 = i4 + 1; i5 <= 48; i5++)
                            for (int i6 = i5 + 1; i6 <= 49; i6++) {
                                System.out.printf("%d %d %d %d %d %d%n", i1, i2, i3, i4, i5, i6);

//                                writer.write(String.format("%d %d %d %d %d %d%n", i1, i2, i3, i4, i5, i6));
//                                writer.flush();
                            }
        }

        long end = System.currentTimeMillis();

        System.out.println((end - start));        // 180214
        System.out.println((end - start) / 1000);

        // 3 min and 236 MB txt file (13 983 816 rows)

        /*
            1 2 3 4 5 6
            1 2 3 4 5 7
            ...
            1 2 3 4 5 49

            1 2 3 4 6 7
            1 2 3 4 6 8
            ...
            1 2 3 4 6 49

            1 2 3 4 7 8
            1 2 3 4 7 9
            ...
            1 2 3 4 7 49

                ...

            42 44 46 47 48 49
            42 45 46 47 48 49
            43 44 45 46 47 48
            43 44 45 46 47 49
            43 44 45 46 48 49
            43 44 45 47 48 49
            43 44 46 47 48 49
            43 45 46 47 48 49
            44 45 46 47 48 49
         */
    }


}
