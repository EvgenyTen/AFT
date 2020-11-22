package homework14;
import homework14.helpers.JsonHelper;
import homework14.model.Person;
import homework14.model.Property;
import org.junit.jupiter.api.Test;
import java.util.Collection;
import java.util.List;
public class Task10 {
    List<Person> persons = JsonHelper.getPersonsFromFile("src/test/java/homework14/dataset.json");
    @Test
    public void allSum() {
        double allSum = persons.stream()
                .filter(person -> !person.getAccounts().isEmpty())
                .map(person -> person.getAccounts())
                .flatMap(accounts -> accounts.stream())
                .map(account -> account.getAccountBalance())
                .reduce((acc1, acc2) -> acc1 + acc2)
                .get();
        double allObjects = persons.stream()
                .filter(person -> !person.getProperties().isEmpty())
                .map(Person::getProperties)
                .flatMap(Collection::stream)
                .map(Property::getPrice)
                .reduce(Double::sum)
                .get();
        System.out.printf("%.2f%n", allSum);
        System.out.printf("%.2f%n", allObjects);
    }
}