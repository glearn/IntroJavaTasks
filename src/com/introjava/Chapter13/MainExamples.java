package com.introjava.Chapter13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainExamples {
    public static void main(String[] args) {
//        allOccurrencesOfWordInString();

//        printFilename();

//        printAllBeers();

//        printCatalog();

//        replaceEmail();

//        replacePhoneNumberDigits();

//        reverseWord();

//        extractCapitals();

        printTime();
    }

    public static void allOccurrencesOfWordInString() {
        String quote = "The main subject in the \"Intro Java\" book is Java for Java newbies.";

        int index = quote.indexOf("Java");

        while (index != -1) {
            System.out.println("Java found on index: " + index);
            index = quote.indexOf("Java", index + 1);
        }

//        Java found on index: 31
//        Java found on index: 45
//        Java found on index: 54
    }

    public static void printFilename() {
        String path = "C:\\Pics\\Rila2008.jpg";

        int index = path.lastIndexOf("\\");

        System.out.println(index);

        String filename = path.substring(index + 1);

        System.out.println(filename);
    }

    public static void printAllBeers() {
        String listOfBeers = "Amstel, Zagorka, Tuborg, Becks.";
//        String[] beers = listOfBeers.split("[ ,.]");
        String[] beers = listOfBeers.split("[,.]");

        for (String beer : beers) {
//            if (!beer.isEmpty()) {
            System.out.println(beer.trim());
//            }
        }
    }

    public static void printCatalog() {
        String catalog = "MicrowaveOven: 170, \n" + "AudioSystem: 125, \n" + "TV: 315, \n" + "Refrigerator: 400";

        System.out.println(catalog);
        /* MicrowaveOven: 170,
        AudioSystem: 125,
        TV: 315,
        Refrigerator: 400 */

        String[] products = catalog.split("[\\d\\s,:]+");

        for (String product : products) {
            System.out.print(product + " ");
        }

        // MicrowaveOven AudioSystem TV Refrigerator
        System.out.println();

        String[] prices = catalog.split("\\D+");

        for (String price : prices) {
            System.out.print(price + " ");
        }

        // Result: 170 125 315 40
    }

    public static void replaceEmail() {
        String doc = "Hello, some@mail.bg, you have been using some@mail.bg in your registration.";
        String fixedDoc = doc.replace("some@mail.bg", "other@mail.bg");
        System.out.println(fixedDoc);
        // Hello, other@mail.bg, you have been using other@mail.bg in your registration.
    }

    public static void replacePhoneNumberDigits() {
        String doc = "Smith's number: 0892880022 Franky can be found at 0853445566 so as Steven - 0811654321";
        String replacedDoc = doc.replaceAll("(08)[0-9]{8}", "$1********");
        System.out.println(replacedDoc);
        // Smith's number: 08******** Franky can be found at 08******** so as Steven - 08********
    }

    public static void reverseWord() {
        String word = "EM edit";
        System.out.println(word);
        System.out.println(new StringBuilder(word).reverse().toString());

        // EM edit
        // tide ME
    }

    public static void extractCapitals() {
        String s = "The Quick Brown Fox";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)) {
                result.append(ch);
            }
        }

        System.out.println(result.toString());
    }

    public static void printTime() {
        String pattern = "HH часа и mm мин.";

        SimpleDateFormat sdf = new SimpleDateFormat(pattern);

        Date dateNow = new Date();
        System.out.println(dateNow); // Wed Oct 05 22:41:28 EEST 2016

        String formattedDate = sdf.format(dateNow);
        System.out.println(formattedDate); // 22 часа и 41 мин.
    }
}


