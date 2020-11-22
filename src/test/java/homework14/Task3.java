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
        result.getAccounts().forEach(account->System.out.printf("%s  ",account.getAccountNumber()));
        System.out.println();
        result.getCards().forEach(card->System.out.printf("%s ",card.getCardNumber()));
    }

    @Test
    @DisplayName("Task 3-Part3")
    public void partThree() {
        boolean correсtness=persons.stream()
                .filter(person -> person.getPassport() != null)
                .map(Person::getPassport)
                .allMatch(passport -> passport.getSeries().matches("^[0-9]{4}$") && passport.getNumber().matches(("^[0-9]{6}$")))
                String resultPrint=correсtness
                        ?"У всех клиентов,у которых есть пасспорт,данные соответствуют формату"
                        :"Есть клиенты,у которых данные не соответствуют";
                System.out.println(resultPrint);
    }
}