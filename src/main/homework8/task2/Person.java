package main.homework8.task2;

import main.homework6.task4.IdentityDocument;
import main.homework6.task4.NameGenerator;

import java.util.Random;

public class Person {
    private int birthday;
    public Person() {
        birthday =numberGenerate();
    }

    public static int numberGenerate() {
        int day = new Random().nextInt(365) + 1;
        return day;
    }
}

