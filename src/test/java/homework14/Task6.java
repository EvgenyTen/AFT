package homework14;

import homework14.helpers.JsonHelper;
import homework14.model.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;

public class Task6 {
    List<Person> persons = JsonHelper.getPersonsFromFile("src/test/java/homework14/dataset.json");
    @Test
    @DisplayName("Task 6-Part1")
    void allObjects(){
        long count=persons.stream()
                .flatMap(person->person.getProperties().stream())
                .count();
        System.out.println(count);
        Assertions.assertEquals(972,count,2);
    }
    @Test
    @DisplayName("Task 6-Part2")
    void allLivingObjects(){
        long count=persons.stream()
                .map(Person::getProperties)
                .flatMap(Collection::stream)
                .filter(property -> property.getType().equals("Жилая"))
                .count();
       System.out.println(count);
       Assertions.assertEquals(497,count);
    }
    @Test
    @DisplayName("Task 6-Part3")
    void allNonLivingObjects(){
        long count=persons.stream()
                .map(Person::getProperties)
                .flatMap(Collection::stream)
                .filter(property -> property.getType().equals("Нежилая"))
                .count();
        System.out.println(count);
        Assertions.assertEquals(477,count);
    }
    @Test
    @DisplayName("Task 6-Part4")
    void checkObjects(){
        long countTotal=persons.stream()
                .flatMap(person->person.getProperties().stream())
                .count();
        long countLiving=persons.stream()
                .map(Person::getProperties)
                .flatMap(Collection::stream)
                .filter(property -> property.getType().equals("Жилая"))
                .count();
        long countNonLiving=persons.stream()
                .map(Person::getProperties)
                .flatMap(Collection::stream)
                .filter(property -> property.getType().equals("Нежилая"))
                .count();
        Assertions.assertEquals(countTotal,countLiving+countNonLiving);
    }

}
