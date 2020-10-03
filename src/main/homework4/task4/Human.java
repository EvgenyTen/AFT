package main.homework4.task4;

public class Human {
    private String name, surname;
    private int age;
    private Passport passport;

    public Human setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public Human setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public String getSurname() {
        return surname;
    }


    public Human setAge(int age) {
        this.age = age;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Human setPassport(Passport passport) {
        if (passport == null) {
            System.out.println("Ннвалиден");
            return this;
        }
        if (passport.getNumber() != null && passport.getSeries() != null) {
            System.out.println("Валиден");
            this.passport = passport;
        } else
            System.out.println("Валиден");
        return this;
    }


    public Passport getPassport() {
        return passport;
    }
}
