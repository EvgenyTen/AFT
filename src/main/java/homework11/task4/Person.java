package homework11.task4;

import java.util.Date;
import java.util.Objects;

public class Person {
    private String surname;
    private String name;
    private String secondName;
    private Date birthDate;
    private Passport passport;

    public Person(String lastName, String name, String secondName, Date birthDate, Passport passport) {
        this.surname = lastName;
        this.name = name;
        this.secondName = secondName;
        this.birthDate = birthDate;
        this.passport = passport;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public Passport getPassport() {
        return passport;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (!Objects.equals(surname, person.surname)) return false;
        if (!Objects.equals(name, person.name)) return false;
        if (!Objects.equals(secondName, person.secondName)) return false;
        if (!Objects.equals(birthDate, person.birthDate)) return false;
        return Objects.equals(passport, person.passport);
    }

    @Override
    public int hashCode() {
        int result = surname != null ? surname.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        result = 31 * result + (passport != null ? passport.hashCode() : 0);
        return result;
    }
}

