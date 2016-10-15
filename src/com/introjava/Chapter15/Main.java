package com.introjava.Chapter15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
    }

    public static void task1() {
        // 1. Напишете програма, която чете от текстов файл и принтира нечетните му редове на конзолата.

        Scanner input = null;
        try {
            input = new Scanner(new File("names.txt"));
            int counter = 1;

            while (input.hasNextLine()) {
                String line = input.nextLine();

                if (counter % 2 == 1) {
                    System.out.println(line);
                }

                counter++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (input != null) {
                input.close();
            }
        }
    }

    public static void task2() {
        // 2. Напишете програма, която чете списък от имена от един текстов файл,
        // сортира ги по азбучен ред и ги запазва в друг файл. Имената да са с латински букви.
        // На всеки ред от файла, където са записани имената, има точно по едно име.
        // На всеки ред от файла с резултата също трябва да има само по едно име.

        Scanner input = null;
        PrintStream printStream = null;

        try {
            input = new Scanner(new File("names.txt"));
            printStream = new PrintStream(new File("sorted_names.txt"));

            List<String> names = new ArrayList<String>();

            while (input.hasNextLine()) {
                names.add(input.nextLine());
            }

            Object[] sorted = names.toArray();

            Arrays.sort(sorted);

            for (Object name : sorted) {
                printStream.println(name);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (input != null) {
                input.close();
            }

            if (printStream != null) {
                printStream.close();
            }
        }
    }

    public static void task3() {
        // 3. Напишете програма, която чете от файл квадратна матрица от цели
        // числа и намира подматрицата с размери 2 х 2 с най-голяма сума и
        // записва тази сума в отделен текстов файл. Първия ред на входния файл съдържа големината на записаната матрица (N).
        // Следващите N реда съдържат по N числа, разделени с интервал.

        int[][] matrix = null;

        Scanner input = null;
        PrintStream printStream = null;

        try {
            input = new Scanner(new File("matrix.txt"));
            printStream = new PrintStream(new File("matrix_res.txt"));

            int currentRow = 0;

            while (input.hasNextLine()) {
                String line = input.nextLine();
                String[] strNums = line.split(" ");

                if (strNums.length == 2) {
                    int rows = Integer.parseInt(strNums[0]);
                    int cols = Integer.parseInt(strNums[1]);

                    matrix = new int[rows][cols];
                    continue;
                }

                for (int j = 0; j < matrix[0].length; j++) {
                    int num = Integer.parseInt(strNums[j]);
                    matrix[currentRow][j] = num;
                }

                currentRow++;
            }

            int sum = 0;
            int r = 0;
            int c = 0;

            for (int row = 0; row < matrix.length - 1; row++) {
                for (int col = 0; col < matrix[0].length - 1; col++) {
                    int e1 = matrix[row][col];
                    int e2 = matrix[row][col + 1];
                    int e3 = matrix[row + 1][col];
                    int e4 = matrix[row + 1][col + 1];

                    int currentSum = e1 + e2 + e3 + e4;

                    if (currentSum > sum) {
                        sum = currentSum;
                        r = row;
                        c = col;
                    }
                }
            }

            String res = String.format("[%d][%d]\n[%d][%d]\n", matrix[r][c], matrix[r][c + 1], matrix[r + 1][c], matrix[r + 1][c + 1]);

            printStream.print(res);

            System.out.println(res);
            System.out.printf("max sum: %d", sum);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (input != null) {
                input.close();
            }

            if (printStream != null) {
                printStream.close();
            }
        }

    }

    public static void task4() {
        // 4. Напишете програма, която заменя всяко срещане на подниза "start" с "finish" в текстов файл.

        // sample content:
        // word word word starting word word word start
        // starting word word starting word word word

        Scanner input = null;
        PrintStream printStream = null;
        try {
            input = new Scanner(new File("start_finish.txt"));

            StringBuilder text = new StringBuilder();

            Pattern pattern = Pattern.compile("start"); // works with whole words and substrings

//            Pattern pattern = Pattern.compile("\\bstart\\b"); // works only with whole words

            while (input.hasNextLine()) {
                String line = input.nextLine();
                Matcher matcher = pattern.matcher(line);
                String res = matcher.replaceAll("finish");
                text.append(res).append("\n");
            }

            printStream = new PrintStream(new File("start_finish.txt"));
            printStream.print(text.toString());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (input != null) {
                input.close();
            }

            if (printStream != null) {
                printStream.close();
            }
        }
    }

    public static void task5() {
        // 5. Напишете програма, която прочита списък от думи от файл, наречен words.txt,
        // преброява колко пъти всяка от тези думи се среща в друг файл text.txt
        // и записва резултата в трети файл – result.txt, като преди това ги сортира по брой на срещане в намаляващ ред.

        Scanner input = null;
        PrintStream printStream = null;

        try {
            input = new Scanner(new File("words.txt"));
            printStream = new PrintStream(new File("result.txt"));

            List<String> words = new ArrayList<String>();

            // 1) read all words
            while (input.hasNextLine()) {
                words.add(input.nextLine());
            }

            // 2) prepare counting
            Map<String, Integer> counts = new HashMap<String, Integer>();

            for (String word : words) {
                counts.put(word, 0);
            }

            // 3) count the words
            input = new Scanner(new File("text.txt"));

            while (input.hasNextLine()) {
                String word = input.nextLine();

                if (counts.containsKey(word)) {
                    int currentCount = counts.get(word);
                    counts.put(word, ++currentCount);
                }
            }

            // 4) sort the map by value in descending order
            Comparator<Map.Entry<String, Integer>> comparator = new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
//                    return o1.getValue().compareTo(o2.getValue());
                    return o2.getValue().compareTo(o1.getValue()); // to sort desc
                }
            };

            List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>();
            list.addAll(counts.entrySet());

            Collections.sort(list, comparator);

            // 5) write result to file
            for (int i = 0; i < list.size(); i++) {
                Map.Entry<String, Integer> entry = list.get(i);
                String line = String.format("%s:%d", entry.getKey(), entry.getValue());
                printStream.println(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (input != null) {
                input.close();
            }

            if (printStream != null) {
                printStream.close();
            }
        }
    }
}
