package main.homework4.task1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Application {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

    public static void main(String[] args) throws ParseException {
        Human human = new Human();
        human.setName("Иван");
        human.setSurname("Иванов");
        human.setBirthDate(sdf.parse("02.01.2020"));
        String today = sdf.format(new Date());
        human.setBirthDate(sdf.parse(today));
        String tomorrow = sdf.format(new Date(new Date().getTime() + 86_400_000L));
        human.setBirthDate(sdf.parse(tomorrow));

        String name = human.getName();
        String surName = human.getSurname();
        Date birthDate = human.getBirthDate();


    }
}
