package homework11.task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class ExcelReadTest {
    private Date fromString(String parse) throws ParseException {
        return new SimpleDateFormat("dd.MM.yyyy").parse(parse);
    }

    @Test
    void readFromFirstSheet() throws ParseException {
        List<Person> persons = FileHelper.getPersonsFromExcel("src/main/java/homework11/task4/persons.xlsx", "Persons1");
        List<Person> expected = Arrays.asList(
                new Person("Иванов", "Владимир", "Михайлович", fromString("14.01.1990"), new Passport("4510", "155442")),
                new Person("Петров", "Михаил", "Валерьевич", fromString("12.06.1984"), new Passport("4511", "523533")),
                new Person("Васильев", "Валерий", "Александрович", fromString("17.12.1991"), new Passport("4512", "325235")),
                new Person("Михайлов", "Константин", "Игоревич", fromString("18.05.1972"), new Passport("4500", "535344")),
                new Person("Александрова", "Мария", "Сергеевна", fromString("19.11.1985"), new Passport("4502", "154333")),
                new Person("Кузнецов", "Сергей", "Николаевич", fromString("17.07.1978"), new Passport("4504", "532212"))
        );
        Assertions.assertNotNull(persons);
        Assertions.assertEquals(expected.size(), persons.size());
        for (int i = 1; i < persons.size(); i++) Assertions.assertEquals(expected.get(i), persons.get(i));
    }

    @Test
    void readFromSecondSheet() throws ParseException {
        List<Person> persons = FileHelper.getPersonsFromExcel("src/main/java/homework11/task4/persons.xlsx", "Persons2");
        List<Person> expected = Arrays.asList(
                new Person("Иванов", "Владимир", "Михайлович", fromString("14.01.1990"), new Passport("4510", "155442")),
                new Person("Петров", "Михаил", "Валерьевич", fromString("12.06.1984"), new Passport("4511", "523533")),
                new Person("Васильев", "Валерий", "Александрович", fromString("17.12.1991"), new Passport("4512", "325235")),
                new Person("Александрова", "Мария", "Сергеевна", fromString("19.11.1985"), new Passport("4502", "154333")),
                new Person("Кузнецов", "Сергей", "Николаевич", fromString("17.07.1978"), new Passport("4504", "532212"))
        );
        Assertions.assertNotNull(persons);
        Assertions.assertEquals(expected.size(), persons.size());
        for (int i = 1; i < persons.size(); i++) Assertions.assertEquals(expected.get(i), persons.get(i));
    }

    @Test
    void fromWrongSheet() throws ParseException {
        List<Person> persons = FileHelper.getPersonsFromExcel("src/main/java/homework11/task4/persons.xlsx", "Persons5");
        Assertions.assertNull(persons);
    }

    @Test
    void fromWrongFile() throws ParseException {
        List<Person> persons = FileHelper.getPersonsFromExcel("src/main/java/homework11/task4/persons25.xlsx", "Persons1");
        Assertions.assertNull(persons);
    }

}
