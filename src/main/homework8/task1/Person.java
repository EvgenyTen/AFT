package main.homework8.task1;

import main.homework6.task4.IdentityDocument;
import main.homework6.task4.NameGenerator;

import java.util.Objects;
import java.util.Random;

import static java.lang.String.format;

public class Person {
    private String surname;
    private String name;

    public Person() {
        surname = "Фамилия-" + numberGenerate();
        name = "Имя-" + numberGenerate();
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
        return surname + " " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return surname.equals(person.surname) &&
                name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, name);
    }
}

