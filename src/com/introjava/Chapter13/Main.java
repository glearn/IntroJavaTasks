package com.introjava.Chapter13;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        task1();

//        task2();

//        task3();

//        task4();

//        task5();

//        task6();

//        task7();
    }

    private static void task1() {
        // 1. Напишете програма, която прочита символен низ, обръща го отзад
        // напред и го принтира обратно на конзолата. Например: "introduction" → "noitcudortni".

        String input = "introduction";

        String actual = new StringBuilder(input).reverse().toString();
        String expected = "noitcudortni";

        System.out.println(actual);
        System.out.println(actual.equals(expected));
    }

    private static void task2() {
        // 2. Напишете програма, която открива колко пъти даден подниз се съдържа в текст.
        // Например, ако търсим подниза "in" в текста

        String text = "We are living in a yellow submarine. We don't have anything else. " +
                "Inside the submarine is very tight. So we are drinking all the day. We will move out of it in 5 days.";

        String searchWord = "in";
        int count = 0;

        int index = text.toLowerCase().indexOf(searchWord);

        while (index != -1) {
            count++;
            index = text.toLowerCase().indexOf(searchWord, index + 1);
        }

        System.out.println(String.format("The word '%s' has been found %d times", searchWord, count)); // 9 times
    }

    private static void task3() {
        // 3. Даден е текст. Напишете програма, която променя регистъра на буквите на всички места в текста,
        // заградени с таговете <upcase> и </upcase>. Таговете не могат да бъдат вложени.

        String input = "We are living in a <upcase>yellow submarine</upcase>. We don't have <upcase>anything</upcase> else.";

        StringBuilder text = new StringBuilder(input);

        int openTag = text.indexOf("<upcase>");
        int closeTag = text.indexOf("</upcase>");

        while (openTag != -1) {
            String content = text.substring(openTag + 8, closeTag).toUpperCase(); // 8 is length of open tag
            text.replace(openTag, closeTag + 9, content); // 9 is length of closing tag

            openTag = text.indexOf("<upcase>");
            closeTag = text.indexOf("</upcase>");
        }

        String actual = text.toString();
        String expected = "We are living in a YELLOW SUBMARINE. We don't have ANYTHING else.";

        System.out.println(actual);
        System.out.println(expected);
        System.out.println(actual.equals(expected));
    }


    private static void task4() {
        // 4. Даден е символен низ, съставен от няколко "забранени" думи, разделени със запетая.
        // Даден е и текст, съдържащ тези думи. Да се напише програма, която замества забранените думи в текста със звездички.

        String input = "Microsoft announced its next generation Java compiler today." +
                " It uses advanced parser and special optimizer for the Microsoft JVM.";

        String restriction = "Java,JVM,Microsoft";
        String[] restrictedWords = restriction.split(",");

        StringBuilder text = new StringBuilder(input);

        for (String restrictedWord : restrictedWords) {
            int index = text.indexOf(restrictedWord);

            while (index != -1) {
                // create string with specified length containing desired symbol '*'
                String s = String.format("%0" + restrictedWord.length() + "d", 0).replace('0', '*');

                text.replace(index, index + restrictedWord.length(), s);

                index = text.indexOf(restrictedWord, index + 1);
            }
        }

        String actual = text.toString();
        String expected = "********* announced its next generation **** compiler today. " +
                "It uses advanced parser and special optimizer for the ********* ***.";

        System.out.println(actual);
        System.out.println(expected);
        System.out.println(actual.equals(expected));
    }

    private static void task5() {
        // 5. Напишете програма, която приема URL адрес във формат:
        //   [protocol]://[server]/[resource]
        //   и извлича от него протокол, сървър и ресурс.

        //   Например, при подаден адрес: http://www.devbg.org/forum/index.php
        //   резултатът е:
        //   [protocol]="http"
        //   [server]="www.devbg.org"
        //   [resource]="/forum/index.php"

        String url = "http://www.devbg.org/forum/index.php";

        try {
            URI uri = new URI(url);

            System.out.println(String.format("[protocol]=\"%s\"", uri.getScheme()));
            System.out.println(String.format("[server]=\"%s\"", uri.getHost()));
            System.out.println(String.format("[resource]=\"%s\"", uri.getPath()));

        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    private static void task6() {
        // 6. Напишете програма, която обръща думите в дадено изречение.
        //    Например: "C# is not C++ and PHP is not Delphi" -> "Delphi not is PHP and C++ not is C#".

        String input = "C# is not C++ and PHP is not Delphi";
        String[] words = input.split(" ");
        StringBuilder text = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            text.append(words[i]).append(" ");
        }

        String actual = text.toString().trim();
        String expected = "Delphi not is PHP and C++ not is C#";

        System.out.println(actual);
        System.out.println(expected);
        System.out.println(actual.equals(expected));
    }

    private static void task7() {
        // 7. Колко обратни наклонени черти трябва да посочите като аргумент на метода split(…),
        // за да разделите текста по обратна наклонена черта?

        String string = "one\\two\\three";
        String[] parts = string.split("\\\\");

        System.out.println(Arrays.toString(parts));
    }
}
