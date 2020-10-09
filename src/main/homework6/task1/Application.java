package main.homework6.task1;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Human> records = new ArrayList<>();
        for (int i = 0; i < 500; i++) {
            String name = NameGenerator.generate();
            String surname = NameGenerator.generate();
            int age = AgeGenerator.generate();
            String phone = PhoneGenerator.generate();
            Human human = new Human(surname, name, age, phone);
            records.add(human);
        }

        for (Human human : records) {
            if (human.getAge() == 35)
                System.out.printf("%s %s, возраст %d, тел. %s%n", human.getSurname(), human.getName(), human.getAge(), human.getPhone());
        }
    }
}





