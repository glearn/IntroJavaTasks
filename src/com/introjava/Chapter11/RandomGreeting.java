package com.introjava.Chapter11;

import java.util.Random;

public class RandomGreeting {
    private final Random random = new Random();

    private final String[] phrases = {
            "Продуктът е отличен.",
            "Това е страхотен продукт.",
            "Постоянно ползвам този продукт.",
            "Това е най-добрият  продукт от тази категория."
    };

    private final String[] opinions = {
            "Вече се чувствам добре.",
            "Успях да се променя.",
            "Той направи чудо.",
            "Не мога да повярвам, но вече се чувствам страхотно.",
            "Опитайте и вие. Аз съм много доволна."
    };

    private final String[] firstNames = {"Диана", "Петя", "Стела", "Елена", "Катя"};

    private final String[] lastNames = {"Иванова", "Петрова", "Кирова"};

    private final String[] cities = {"София", "Пловдив", "Варна", "Русе", "Бургас"};

    public String generate() {

        int phraseIndex = random.nextInt(phrases.length);
        int opinionIndex = random.nextInt(opinions.length);
        int firstNameIndex = random.nextInt(firstNames.length);
        int lastNameIndex = random.nextInt(lastNames.length);
        int cityIndex = random.nextInt(cities.length);

        return String.format("%s %s %s %s %s",
                phrases[phraseIndex],
                opinions[opinionIndex],
                firstNames[firstNameIndex],
                lastNames[lastNameIndex],
                cities[cityIndex]
        );
    }
}
