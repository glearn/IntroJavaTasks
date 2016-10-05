package com.introjava.Chapter10;

public class Labyrinth {
    private static char[][] lab = {
            {' ', ' ', ' ', '*', ' ', ' ', ' '},
            {'*', '*', ' ', '*', ' ', '*', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', '*', '*', '*', '*', '*', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', 'e'},
    };

    private static char[] path = new char[lab[0].length * lab.length];
    private static int position = 0;

    public static void main(String[] args) {
        findPath(0, 0, 'B');
    }

    private static void findPath(int row, int col, char direction) {
        // out of labyrinth
        if ((row < 0) || (col < 0) || (row >= lab.length) || (col >= lab[0].length)) {
            return;
        }

        // Append the direction to the path
        path[position] = direction;
        position++;

        // found the exit
        if (lab[row][col] == 'e') {
//            System.out.println("Found the exit!");
            printPath(path, 1, position - 1);

        }

        if (lab[row][col] == ' ') {
            // The current cell is free. Mark it as visited
            lab[row][col] = 'v';

            findPath(row, col - 1, 'L'); // left
            findPath(row - 1, col, 'U'); // up
            findPath(row, col + 1, 'R'); // right
            findPath(row + 1, col, 'D'); // down

            // Маркирането на текущата клетка като свободна при излизане от рекурсията
            // е важно, защото при връщане назад тя вече не е част от текущия път. Ако
            // пропуснем това действие, няма да намерим всички пътища до изхода, а
            // само някои от тях.
            lab[row][col] = ' ';
        }

        // Remove the direction from the path
        position--;
    }

    private static void printPath(char[] path, int startPos, int endPos) {
        System.out.print("Found path to the exit: ");
        for (int pos = startPos; pos <= endPos; pos++) {
            System.out.print(path[pos]);
        }
        System.out.println();
    }
}
