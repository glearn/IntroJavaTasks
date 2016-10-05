package com.introjava.Chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        task8();

//        task9();

//        task10();
    }

    public static void task8() {
        String content = readFile("file.txt");
        System.out.println(content);
    }

    public static String readFile(String name) {
        StringBuilder builder = new StringBuilder();
        try {
            Scanner input = new Scanner(new File(name));
            while (input.hasNext()) {
                builder.append(input.nextLine()).append("\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return builder.toString();
    }

    public static void task9() {
        FileCopier fileCopier = new FileCopier();

        String filename = "pic1.jpg";

        byte[] data = fileCopier.readBytesFromFile(filename);

        System.out.printf("Readed: %s bytes from file %s", data.length, filename);

        fileCopier.writeBytesToFile("pic1_copy.jpg", data);
    }

    private static void task10() {
        try {
            parseFromFile("file.txt");
        } catch (FileParseException e) {
            e.printStackTrace();
        }
    }

    public static void parseFromFile(String name) {
        int errLine = 0;
        try {
            Scanner input = new Scanner(new File(name));
            while (input.hasNext()) {
                System.out.println(input.nextInt());
                errLine++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (InputMismatchException e) {
            throw new FileParseException(
                    String.format("Can not parse file '%s' completely. Check line: %d", name, errLine)
            );
        }
    }
}