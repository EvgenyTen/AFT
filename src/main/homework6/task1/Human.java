package main.homework6.task1;

public class Human {
    private String surname;
    private String name;
    private int age;
    private String phone;

    public Human(String lastName, String firstName, int age, String phone) {
        this.surname = lastName;
        this.name = firstName;
        this.age = age;
        this.phone = phone;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }
}
