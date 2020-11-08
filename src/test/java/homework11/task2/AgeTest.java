package homework11.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AgeTest {
    @Test
    public void age1() {
        int age=0;
        try {
            Human human = new Human();
            human.setAge(age);
            int result = human.getAge();
            Assertions.assertEquals(age,result);
        } catch (IllegalArgumentException exception) {
            Assertions.fail("Поле не установлено");
        }
    }
    @Test
    public void age2() {
        int age=60;
        try {
            Human human = new Human();
            human.setAge(age);
            int result = human.getAge();
            Assertions.assertEquals(age,result);
        } catch (IllegalArgumentException exception) {
            Assertions.fail("Поле не установлено");
        }
    }
    @Test
    public void age3() {
        int age=120;
        try {
            Human human = new Human();
            human.setAge(age);
            int result = human.getAge();
            Assertions.assertEquals(age,result);
        } catch (IllegalArgumentException exception) {
            Assertions.fail("Поле не установлено");
        }
    }
    @Test
    public void age4() {
        int age=-1;
        try {
            Human human = new Human();
            human.setAge(age);
            int result = human.getAge();
            Assertions.fail();
        } catch (IllegalArgumentException exception) {
            String expected = "Некорректный возраст: "+age;
            Assertions.assertEquals(expected,exception.getMessage());
        }
    }
    @Test
    public void age5() {
        int age=121;
        try {
            Human human = new Human();
            human.setAge(age);
            int result = human.getAge();
            Assertions.fail();
        } catch (IllegalArgumentException exception) {
            String expected = "Некорректный возраст: "+age;
            Assertions.assertEquals(expected,exception.getMessage());
        }
    }
}
