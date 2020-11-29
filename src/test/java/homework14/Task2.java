package homework14;

import homework14.helpers.JsonHelper;
import homework14.model.Person;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.NoSuchElementException;

public class Task2 {
    List<Person> persons = JsonHelper.getPersonsFromFile("src/test/java/homework14/dataset.json");

    @Test
    @DisplayName("Task 2-Part1")
    public void partOne() {
        persons.stream()
                .filter(person -> person.getPassport() != null)
                .filter(person -> person.getPassport().getSeries().startsWith("00"))
                .sorted((p1, p2) -> p2.getPassport().getNumber().compareTo(p1.getPassport().getNumber()))
                .forEach(person -> System.out.printf("%s %s %s %s %s%n", person.getLastName(), person.getFirstName(), person.getPatronymic(), person.getPassport().getSeries(), person.getPassport().getNumber()));
    }

    @Test
    @DisplayName("Task 2-Part2")
    public void partTwo() {
        Person person = persons.stream()
                .filter(pers -> pers.getPassport() != null)
                .filter(pers -> pers.getPassport().getSeries().endsWith(pers.getPassport().getSeries()))
                .findFirst()
                .orElseThrow(NoSuchElementException::new);
        System.out.printf("%s %s %s %s %s%n", person.getLastName(), person.getFirstName(), person.getPatronymic(), person.getPassport().getSeries(), person.getPassport().getNumber());
    }
}

