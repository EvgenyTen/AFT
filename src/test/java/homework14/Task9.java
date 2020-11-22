package homework14;

import homework14.helpers.JsonHelper;
import homework14.model.Account;
import homework14.model.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Task9 {
    List<Person> persons = JsonHelper.getPersonsFromFile("src/test/java/homework14/dataset.json");
    @Test
    public void countCards() {
        long accountBalance = persons.stream()
                .filter(person -> !person.getAccounts().isEmpty())
                .filter(person -> person.getAccounts().stream()
                        .map(Account::getAccountBalance)
                        .reduce((balance1, balance2) -> balance1 + balance2)
                        .get() > 20000000)
                .count();

        long objectBalance = persons.stream()
                .filter(person -> !person.getProperties().isEmpty())
                .filter(person -> person.getProperties().stream()
                        .map(property -> property.getPrice())
                        .reduce((price1, price2) -> price1 + price2)
                        .get() > 26000000)
                .count();
        System.out.println(accountBalance);
        System.out.println(objectBalance);
        Assertions.assertEquals(accountBalance, objectBalance);

    }
}
