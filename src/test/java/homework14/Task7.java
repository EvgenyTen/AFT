package homework14;

import homework14.helpers.JsonHelper;
import homework14.model.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Task7 {
    List<Person> persons = JsonHelper.getPersonsFromFile("src/test/java/homework14/dataset.json");

    @Test
    @DisplayName("Task 7-Part1-sum of all accounts")
    void allAccounts() {
        long countAll = persons.stream()
                .flatMap(person -> person.getAccounts().stream())
                .count();
    }

    @Test
    @DisplayName("Task 7-Part2-all checking accounts")
    void allCheckingAccounts() {
        long countCheckingAccounts = persons.stream()
                .flatMap(person -> person.getAccounts().stream())
                .filter(account -> account.getAccountType().equalsIgnoreCase("расчетный"))
                .count();
    }

    @Test
    @DisplayName("Task 7-Part3-all deposit accounts")
    void allDeposits() {
        long countDeposits = persons.stream()
                .flatMap(person -> person.getAccounts().stream())
                .filter(account -> account.getAccountType().equalsIgnoreCase("депозитный"))
                .count();
    }

    @Test
    @DisplayName("Task 7-Part4-all current accounts")
    void allCurrents() {
        long countCurrents = persons.stream()
                .flatMap(person -> person.getAccounts().stream())
                .filter(account -> account.getAccountType().equalsIgnoreCase("Текущий"))
                .count();
    }

    @Test
    @DisplayName("Task 7-Part5-check")
    void checkAccounts() {
        long countAll = persons.stream()
                .flatMap(person -> person.getAccounts().stream())
                .count();
        long countCheckingAccounts = persons.stream()
                .flatMap(person -> person.getAccounts().stream())
                .filter(account -> account.getAccountType().equalsIgnoreCase("расчетный"))
                .count();
        long countDeposits = persons.stream()
                .flatMap(person -> person.getAccounts().stream())
                .filter(account -> account.getAccountType().equalsIgnoreCase("депозитный"))
                .count();
        long countCurrents = persons.stream()
                .flatMap(person -> person.getAccounts().stream())
                .filter(account -> account.getAccountType().equalsIgnoreCase("Текущий"))
                .count();
        System.out.println(countAll);
        System.out.println(countCheckingAccounts);
        System.out.println(countDeposits);
        System.out.println(countCurrents);
        Assertions.assertEquals(countAll, countCheckingAccounts + countCurrents + countDeposits);
    }

}
