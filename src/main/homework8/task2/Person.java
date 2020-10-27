package main.homework8.task2;
import java.util.Random;

public class Person {

    private int birthday;

    public Person() {
        birthday = numberGenerate();
    }

    public static int numberGenerate() {
        int day = new Random().nextInt(365) + 1;
        return day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return birthday == person.birthday;
    }

    @Override
    public int hashCode() {
        return birthday;
    }

}

