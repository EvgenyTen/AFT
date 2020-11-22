package homework14;

import homework14.helpers.JsonHelper;
import homework14.model.Card;
import homework14.model.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Task8 {
    List<Person> persons = JsonHelper.getPersonsFromFile("src/test/java/homework14/dataset.json");
    @Test
    @DisplayName("Task 8-Part1-all cards")
    void allCards(){
        long countAll=persons.stream()
                .flatMap(person -> person.getCards().stream())
                .filter(this::isValid)
                .count();
    }
    @Test
    @DisplayName("Task 8-Part2-all valid visa")
    void allVisaCards(){
        long allVisa = persons.stream()
                .flatMap(person -> person.getCards().stream())
                .filter(this::isValid)
                .filter(card -> card.getType().equalsIgnoreCase("VISA"))
                .count();
    }
    @Test
    @DisplayName("Task 8-Part3-all valid master")
    void allMasterCards(){
        long allMaster = persons.stream()
                .flatMap(person -> person.getCards().stream())
                .filter(this::isValid)
                .filter(card -> card.getType().equalsIgnoreCase("MasterCard"))
                .count();
    }
    @Test
    @DisplayName("Task 8-Part4-all valid peace")
    void allPeaceCards(){
        long allPeace = persons.stream()
                .flatMap(person -> person.getCards().stream())
                .filter(this::isValid)
                .filter(card -> card.getType().equalsIgnoreCase("мир"))
                .count();
    }
    @Test
    @DisplayName("Task 8-Part5-check cards")
    void allCardsCheck(){
        long countAll=persons.stream()
                .flatMap(person -> person.getCards().stream())
                .filter(this::isValid)
                .count();
        long allVisa = persons.stream()
                .flatMap(person -> person.getCards().stream())
                .filter(this::isValid)
                .filter(card -> card.getType().equalsIgnoreCase("VISA"))
                .count();
        long allMaster = persons.stream()
                .flatMap(person -> person.getCards().stream())
                .filter(this::isValid)
                .filter(card -> card.getType().equalsIgnoreCase("MasterCard"))
                .count();
        long allPeace = persons.stream()
                .flatMap(person -> person.getCards().stream())
                .filter(this::isValid)
                .filter(card -> card.getType().equalsIgnoreCase("мир"))
                .count();
        System.out.println(countAll);
        System.out.println(allVisa);
        System.out.println(allMaster);
        System.out.println(allPeace);
        Assertions.assertEquals(countAll,allMaster+allPeace+allVisa);
    }










    private boolean isValid(Card card) {
        try {
            Date cardDate = new SimpleDateFormat("MM.yy").parse(card.getEndDateMonth() + "." + card.getEndDateYear());
            return cardDate.after(new Date());
        } catch (ParseException exception) {
            throw new RuntimeException();
        }
    }
}
