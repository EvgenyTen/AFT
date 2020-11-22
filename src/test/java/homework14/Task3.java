package homework14;

import homework14.helpers.JsonHelper;
import homework14.model.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Task3 {
    List<Person> persons = JsonHelper.getPersonsFromFile("src/test/java/homework14/dataset.json");

    @Test
    @DisplayName("Task 3-Part1")
    public void partOne() {
        long count = persons.stream()
                .filter(person -> person.getPassport() == null)
                .filter(person -> person.getProperties().size() == 3)
                .peek(person -> System.out.printf("%s %s %s%n", person.getLastName(), person.getFirstName(), person.getPatronymic()))
                .count();
        Assertions.assertEquals(3, count);
    }

    @Test
    @DisplayName("Task 3-Part2")
    public void partTwo() {
        long count = persons.stream()
                .filter(person -> person.getLastName().equals("Васильев"))
                .filter(person -> person.getCards().size() != person.getAccounts().size())
                .peek(person -> System.out.printf("%s %s %s%n", person.getLastName(), person.getFirstName(), person.getPatronymic()))
                .count();
        Assertions.assertEquals(10, count);
    }

    @Test
    @DisplayName("Task 3-Part3")
    public void partThree() {
        persons.stream()
                .filter(person -> person.getPassport() != null)
                .filter(person -> person.getPassport().getSeries().startsWith("00"))
                .limit(5)
                .forEach(person -> System.out.printf("%s %s %s%n", person.getLastName(), person.getFirstName(), person.getPatronymic()));
    }
}