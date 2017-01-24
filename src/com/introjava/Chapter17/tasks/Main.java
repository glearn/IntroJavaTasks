package com.introjava.Chapter17.tasks;

public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
    }

    public static void task1() {
        // 1. Да се напише програма, която намира броя на срещанията на дадено число в дадено дърво от числа.

        Tree<Integer> tree =
                new Tree<Integer>(7,
                        new Tree<Integer>(1,
                                new Tree<Integer>(1),
                                new Tree<Integer>(12),
                                new Tree<Integer>(31)
                        ),
                        new Tree<Integer>(1),
                        new Tree<Integer>(1,
                                new Tree<Integer>(1),
                                new Tree<Integer>(1)
                        )
                );

        System.out.println(tree.countNumberInNodes(1)); // 6
    }

    public static void task2() {
        // 2. Да се напише програма, която извежда корените на онези поддървета на дадено дърво,
        // които имат точно k на брой върха, където k e дадено естествено число.

        Tree<Integer> tree =
                new Tree<Integer>(7,
                        new Tree<Integer>(18,
                                new Tree<Integer>(1),
                                new Tree<Integer>(12),
                                new Tree<Integer>(31)
                        ),
                        new Tree<Integer>(15),
                        new Tree<Integer>(20,
                                new Tree<Integer>(1),
                                new Tree<Integer>(1)),
                        new Tree<Integer>(25,
                                new Tree<Integer>(5),
                                new Tree<Integer>(9),
                                new Tree<Integer>(3)
                        )
                );

        System.out.println(tree.findRootsOfSubtreesWithKChildren(3)); // [18, 25]
    }
}
