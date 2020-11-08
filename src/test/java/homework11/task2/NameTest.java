package homework11.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NameTest {
    @Test
    public void name1() {
        String name="Иван";
        Human human = new Human();
        human.setName(name);
        String result = human.getName();
        Assertions.assertEquals(name,result);
        }
    @Test
    public void name2() {
        String name="Ив";
        try {
            Human human = new Human();
            human.setName(name);
            String result = human.getName();
            Assertions.fail();
        } catch (IllegalArgumentException exception) {
            String expected = "Некорректное имя: "+name;
            Assertions.assertEquals(expected,exception.getMessage());
        }
    }
    @Test
    public void name3() {
        String name="Ивансдлиннымименем";
        try {
            Human human = new Human();
            human.setName(name);
            String result = human.getName();
            Assertions.fail();
        } catch (IllegalArgumentException exception) {
            String expected = "Некорректное имя: "+name;
            Assertions.assertEquals(expected,exception.getMessage());
        }
    }
    @Test
    public void name4() {
        String name="Иван5аа";
        try {
            Human human = new Human();
            human.setName(name);
            String result = human.getName();
            Assertions.assertEquals(name,result);
        } catch (IllegalArgumentException exception) {
            String expected = "Некорректное имя: "+name;
            Assertions.assertEquals(expected,exception.getMessage());
        }
    }

}
