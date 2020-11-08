package homework3.task5;

import java.util.Random;

public class Names {
    static String[] humanNames = {"Oleg", "Vasiliy", "Ivan", "Katja", "Natalya"};
    static String[] catNames = {"Murzik", "Kisakisa", "Mono"};
    static String[] dogNames = {"Gavgav", "Sharik", "Bobik"};

    static String humanName() {
        return humanNames[new Random().nextInt(humanNames.length)];
    }

    static String catName() {
        return catNames[new Random().nextInt(catNames.length)];
    }

    static String dogName() {
        return dogNames[new Random().nextInt(dogNames.length)];
    }
}
