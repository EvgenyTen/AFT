package main.homework4.task1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Human {
    private String name, surname;
    private Date birthDate;

    private String SURNAME = "фамилии";
    private String NAME = "имени";
    private String BIRTHDATE = "даты рождения";
    private String CYRILLIC_FORMAT = "^[А-Я][а-я]{2,}$";
    private SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd.MM.yyyy");

    public Human() {
        this.name = name;
        this.surname = surname;
    }

    public void setName(String name) {
        if (name.matches(CYRILLIC_FORMAT)) {
            this.name = name;
            setCorrectPrint(NAME, name);
        } else {
            setIncorrectPrint(name);
        }
    }

    public void setSurname(String surname) {
        if (surname.matches(CYRILLIC_FORMAT)) {
            this.surname = surname;
            setCorrectPrint(SURNAME, surname);
        } else {
            setIncorrectPrint(surname);
        }
    }

    public String getName() {
        getPrint(NAME, name);
        return name;
    }

    public String getSurname() {
        getPrint(SURNAME, surname);
        return surname;
    }

    public void setBirthDate(Date birthDate) {
        Date today = new Date();
        if (birthDate.before(today)) {
            this.birthDate = birthDate;
            setCorrectPrint(BIRTHDATE, DATE_FORMAT.format(birthDate));
        } else {
            setIncorrectPrint(DATE_FORMAT.format(birthDate));
        }
    }

    public Date getBirthDate() {
        String date = birthDate != null
                ? DATE_FORMAT.format(birthDate)
                : null;
        getPrint(BIRTHDATE, date);
        return birthDate;
    }

    private void getPrint(String type, String value) {
        System.out.printf("Получено значение %s: %s%n", type, value);
    }

    private void setCorrectPrint(String type, String value) {
        System.out.printf("Установлено корректное значение %s: %s%n", type, value);
    }

    private void setIncorrectPrint(String value) {
        System.out.printf("Введенное значение некорректно: %s%n", value);
    }
}
