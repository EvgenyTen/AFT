package homework14;

import homework14.helpers.JsonHelper;
import homework14.model.Account;
import homework14.model.Person;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Task5 {
    List<Person> persons = JsonHelper.getPersonsFromFile("src/test/java/homework14/dataset.json");

    @Test
    public void balance() {
        long accountBalance = persons.stream()
                .filter(person -> !person.getAccounts().isEmpty())
                .filter(person -> person.getAccounts().stream()
                        .map(Account::getAccountBalance)
                        .reduce((bal1, bal2) -> bal1 + bal2)
                        .get() < 2100000)
                .count();
        System.out.println(accountBalance);
    }
}