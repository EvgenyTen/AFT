package homework14;

import homework14.helpers.JsonHelper;
import homework14.model.Person;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Task3 {
    List<Person> persons = JsonHelper.getPersonsFromFile("src/test/java/homework14/dataset.json");

    @Test
    @DisplayName("Task 3-Part1")
    public void partOne() {
        long count = persons.stream()
                .filter(person -> person.getPassport() != null)
                .map(person -> person.getPassport().getSeries())
                .distinct()
                .count();
        System.out.printf("Количество различных серий паспортов: %s%n", count);
    }

    @Test
    @DisplayName("Task 3-Part2")
    public void partTwo() {
       Person result = persons.stream()
                .filter(person -> person.getPassport() != null)
                .skip(49)
                .limit(50)
                .filter(person -> person.getCards().size()==2)
                .filter(person -> person.getAccounts().size()==3)
                .findFirst()
               .orElse(persons.get(0));
        System.out.printf("%s %s %s%n", result.getLastName(), result.getFirstName(), result.getPatronymic());



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