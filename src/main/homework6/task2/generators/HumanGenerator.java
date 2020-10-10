package main.homework6.task2.generators;

import main.homework6.task1.Human;
import main.homework6.task2.Chance;
import main.homework6.task2.PhoneType;

import java.util.HashMap;
import java.util.Map;

public class HumanGenerator {
    public static Human generate() {
        String surname = NameGenerator.generate();
        String name = NameGenerator.generate();
        int age = AgeGenerator.generate();
        Map<PhoneType, String> phones = new HashMap<>();

        for (int i = 0; i < PhoneType.values().length; i++) {
            if (Chance.calculateChance(20)) {
                PhoneType phoneType = PhoneType.values()[i];
                phones.put(phoneType, PhoneGenerator.generate());
            }
        }

        return new Human(surname, name, age, phones);

    }
}
