package com.introjava.Chapter2;

public class PrintTriangle {

    public static void main(String[] args) {
        // isosceles triangle

        int size = 7;
        int base = size * 2;

        for (int i = 1; i < base; i += 2) {
//            System.out.println("i: " + i);

            int n = ((size - 1) - i / 2);
//            System.out.println("n: " + n);

            for (int k = 0; k < n; k++) {
                System.out.print(" ");
//                System.out.println("k: " + k);
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*");
//                System.out.println("j: " + j);
            }

            System.out.println("");
        }
    }
}

/*

      *
     ***
    *****
   *******
  *********
 ***********
*************

i: 1
n: 6
k: 0
k: 1
k: 2
k: 3
k: 4
k: 5
j: 0

i: 3
n: 5
k: 0
k: 1
k: 2
k: 3
k: 4
j: 0
j: 1
j: 2

i: 5
n: 4
k: 0
k: 1
k: 2
k: 3
j: 0
j: 1
j: 2
j: 3
j: 4

i: 7
n: 3
k: 0
k: 1
k: 2
j: 0
j: 1
j: 2
j: 3
j: 4
j: 5
j: 6

i: 9
n: 2
k: 0
k: 1
j: 0
j: 1
j: 2
j: 3
j: 4
j: 5
j: 6
j: 7
j: 8

i: 11
n: 1
k: 0
j: 0
j: 1
j: 2
j: 3
j: 4
j: 5
j: 6
j: 7
j: 8
j: 9
j: 10

i: 13
n: 0
j: 0
j: 1
j: 2
j: 3
j: 4
j: 5
j: 6
j: 7
j: 8
j: 9
j: 10
j: 11
j: 12
*/

