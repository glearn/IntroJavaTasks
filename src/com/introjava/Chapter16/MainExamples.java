package com.introjava.Chapter16;

import java.util.*;

public class MainExamples {
    public static void main(String[] args) {
//        example1();
//        example2();
//        example3();
        example4();

//        customArrayListUsage();
//        dynamicArrayListUsage();
    }

    public static void example1() {
        List<Integer> firstList = new ArrayList<Integer>();
        firstList.add(1);
        firstList.add(2);
        firstList.add(3);
        firstList.add(4);
        firstList.add(5);

        System.out.print("firstList = ");
        printList(firstList);

        List<Integer> secondList = new ArrayList<Integer>();
        secondList.add(2);
        secondList.add(4);
        secondList.add(6);

        System.out.print("secondList = ");
        printList(secondList);

        List<Integer> unionList = union(firstList, secondList);

        System.out.print("union = ");
        printList(unionList);

        List<Integer> intersectList = intersect(firstList, secondList);

        System.out.print("intersect = ");
        printList(intersectList);
    }

    public static void example2() {
        String expression = "1 + (3 + 2 - (2+3) * 4 - ((3+1)*(4-2)))";

        Stack<Integer> stack = new Stack<Integer>();

        boolean correctBrackets = true;

        for (int index = 0; index < expression.length(); index++) {
            char ch = expression.charAt(index);

            if (ch == '(') {
                stack.push(index);
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    correctBrackets = false;
                    break;
                }
                stack.pop();
            }
        }

        if (!stack.isEmpty()) {
            correctBrackets = false;
        }

        System.out.println("Are the brackets correct? " + correctBrackets);
    }

    public static void example3() {
        // Нека сега разгледаме задача, в която използването на структурата опашка
        // ще бъде много полезна за реализацията. Да вземем редицата числа, чиито
        // членове се поличават по-следния начин: първият елемент е N; вторият
        // получаваме като съберем N с 1; третият – като умножим първия с 2 и така
        // последователно умножаваме всеки елемент с 2 и го добавяме накрая на
        // редицата, след което го събираме с 1 и отново го поставяме накрая на редицата.

        int n = 3;
        int p = 16;

        Queue<Integer> queue = new LinkedList<Integer>();

        queue.offer(n);

        int index = 0;

        System.out.print("S =");

        while (queue.size() > 0) {
            index++;

            int current = queue.poll();

            System.out.print(" " + current);

            if (current == p) {
                System.out.println();
                System.out.println("Index = " + index);
                return;
            }

            queue.offer(current + 1);
            queue.offer(2 * current);
        }

        // S = 3 4 6 5 8 7 12 6 10 9 16
        // Index = 11
    }

    public static void example4() {
        ArrayList<Integer> primes = getPrimes(200, 300);
        for (int p : primes) {
            System.out.printf("%d ", p);
        }
        System.out.println();
    }

    public static ArrayList<Integer> getPrimes(int start, int end) {
        ArrayList<Integer> primesList = new ArrayList<Integer>();
        for (int num = start; num <= end; num++) {
            boolean prime = true;
            for (int div = 2; div <= Math.sqrt(num); div++) {
                if (num % div == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime)
                primesList.add(num);
        }
        return primesList;
    }

    public static List<Integer> union(List<Integer> first, List<Integer> second) {

        List<Integer> union = new ArrayList<Integer>();

        union.addAll(first);

        for (Integer item : second) {
            if (!union.contains(item)) {
                union.add(item);
            }
        }

        return union;
    }

    public static List<Integer> intersect(List<Integer> first, List<Integer> second) {
        List<Integer> intersect = new ArrayList<Integer>();

        for (Integer item : first) {
            if (second.contains(item)) {
                intersect.add(item);
            }
        }

        return intersect;
    }

    public static void printList(List<Integer> list) {
        System.out.print("{ ");
        for (Integer item : list) {
            System.out.print(item);
            System.out.print(" ");
        }
        System.out.println("}");
    }

    public static void customArrayListUsage() {
        CustomArrayList shoppingList = new CustomArrayList();
        shoppingList.add("Milk");
        shoppingList.add("Honey");
        shoppingList.add("Olives");
        shoppingList.add("Beer");
        shoppingList.remove("Olives");
        System.out.println("We need to buy:");
        for (int i = 0; i < shoppingList.getLength(); i++) {
            System.out.println(shoppingList.elementAt(i));
        }
        System.out.println("Do we have to buy Bread? " +
                shoppingList.contains("Bread"));
    }

    public static void dynamicArrayListUsage() {
        DynamicList shoppingList = new DynamicList();
        shoppingList.add("Milk");
        shoppingList.add("Honey");
        shoppingList.add("Olives");
        shoppingList.add("Beer");
        shoppingList.remove("Olives");
        System.out.println("We need to buy:");
        for (int i = 0; i < shoppingList.getLength(); i++) {
            System.out.println(shoppingList.elementAt(i));
        }
        System.out.println("Do we have to buy Bread? " +
                shoppingList.contains("Bread"));
    }
}