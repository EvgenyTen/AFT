package homework14;

import homework14.helpers.JsonHelper;
import homework14.model.Card;
import homework14.model.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
    @Test
    @DisplayName("Task 4-Part2")

    public void actions(){
        List<Object> object=null;
        List<Object> object1=new ArrayList<>();
        long cardAmount=persons.stream()
                .filter(person -> !person.getCards().isEmpty())
                .count();
        System.out.println(cardAmount);
        long onlyActiveCards=persons.stream()
                .map(Person::getCards)
                .filter(cards -> cards.stream().allMatch(this::isValid))
                .count();
        System.out.println(onlyActiveCards);
        long onlyExperidCards=persons.stream()
                .map(Person::getCards)
                .filter(cards -> cards.stream().noneMatch(this::isValid))
                .count();
        System.out.println(onlyExperidCards);
        long others=persons.stream()
                .map(Person::getCards)
                .filter(cards -> cards.stream().anyMatch(this::isValid))
                .filter(cards -> cards.stream().anyMatch(card -> !isValid(card)))
                .count();
        System.out.println(others);
    }
    public boolean isValid(Card card) {
        SimpleDateFormat sdf=new SimpleDateFormat("MM.yy");
        try{
            Date cardDate=sdf.parse(card.getEndDateMonth()+"."+card.getEndDateYear());
            return cardDate.after(new Date());
        }catch (ParseException pe){
            throw new RuntimeException();
        }
    }
}