package main.homework8.task1;

import main.homework6.task4.IdentityDocument;
import main.homework6.task4.NameGenerator;

import java.util.Objects;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        if(!Objects.equals(surname,person.surname)) return false;
        return Object.equals(name,person.name);
    }

    @Override
    public int hashCode() {
       int result=surname!=null?surname.hashCode():0;
       result=31*result+(name!=null?name.hashCode():0);
       return result;
    }

    @Override
    public String toString() {
        String str=String.format("Фамилия : %s  , Имя : s%",surname,name);
        return str;
    }
}

