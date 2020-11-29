package homework14;

import homework14.helpers.JsonHelper;
import homework14.model.Person;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Task5 {
    List<Person> persons = JsonHelper.getPersonsFromFile("src/test/java/homework14/dataset.json");

    @Test
    @DisplayName("Task 1")
    void task1() {

        persons.stream()
                .filter(person -> !person.getAccounts().isEmpty())
                .filter(person -> person.getAccounts().stream()
                        .map(Account -> Account.getAccountBalance())
                        .reduce((balance1, balance2) -> balance1 + balance2)
                        .orElseThrow(() -> new IllegalStateException()) <= 2100000)
                .forEach(person -> System.out.printf("%s %s %s%n", person.getLastName(), person.getFirstName(), person.getPatronymic()));

    }
}
