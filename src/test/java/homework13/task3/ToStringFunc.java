package homework13.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ToStringFunc {
    @Test
    @DisplayName("to string-string")
    void stringToString() {
        Assertions.assertEquals("s1", Functions.toStringFunc.execute("s1"));
    }

    @Test
    @DisplayName("to string-object")
    void objectToString() {
        Object object = new Object();
        String expected = object.getClass().getName() + "@" + Integer.toHexString(object.hashCode());
        Assertions.assertEquals(expected, Functions.toStringFunc.execute(object));
    }

    @Test
    @DisplayName("to string-cat")
    void catToString() {
        class Cat {
            private String name;
            private int age;

            private Cat(String name, int age) {
                this.name = name;
                this.age = age;
            }

            @Override
            public String toString() {
                return String.format("Имя : %s, Возраст : %d", name, age);
            }
        }
        Object cat = new Cat("Барсик", 3);
        Assertions.assertEquals("Имя : Барсик, Возраст : 3", Functions.toStringFunc.execute(cat));
    }
}
