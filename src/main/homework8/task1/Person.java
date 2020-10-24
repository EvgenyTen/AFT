package main.homework8.task1;

import main.homework6.task4.IdentityDocument;
import main.homework6.task4.NameGenerator;

import java.util.Random;

public class Person {
    private String surname;
    private String name;

    public Person() {
    surname="Фамилия-"+numberGenerate();
    name="Имя-"+numberGenerate();
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }


    public static int numberGenerate() {
        int number = new Random().nextInt(20) + 1;
        return number;
    }

    @Override
    public String toString() {
        String str=String.format("Фамилия : %s  , Имя : s%",surname,name);
        return str;
    }
}

