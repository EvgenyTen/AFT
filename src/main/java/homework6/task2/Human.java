package homework6.task2;

import java.util.Map;

public class Human {
    private String name;
    private String surname;
    private int age;
    private Map<PhoneType, String> phones;

    public Human(String surname, String name, int age, Map<PhoneType, String> phones) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phones = phones;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public Map<PhoneType, String> getPhones() {
        return phones;
    }
}
