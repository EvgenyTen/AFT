package homework14;

import homework14.helpers.JsonHelper;
import homework14.model.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

public class Task4 {
    List<Person> persons = JsonHelper.getPersonsFromFile("src/test/java/homework14/dataset.json");

    @Test
    @DisplayName("Task 4-Part1")
    public void partOne() {
        List<Person> filtredPersons=persons.stream()
                .filter(person -> person.getPassport() == null)
                .filter(person -> person.getAccounts().size() == 3)
                .filter(person -> person.getCards().size() ==0)
                .collect(Collectors.toList());
        Assertions.assertEquals(0, filtredPersons.size());
        boolean allSeries=filtredPersons.stream().allMatch(person->person.getPassport().getSeries().matches("^[0-9]{4}$"));
        boolean atLeastOne=filtredPersons.stream().anyMatch(person->person.getPassport().getSeries().matches("^[0-9]{4}$"));
        boolean noOneInList=filtredPersons.stream().noneMatch(person->person.getPassport().getSeries().matches("^[0-9]{4}$"));
        System.out.println(allSeries);
        System.out.println(atLeastOne);
        System.out.println(noOneInList);
    }
}