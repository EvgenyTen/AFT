package homework8.task2;

import java.util.HashSet;
import java.util.Set;

public class Application {
    final static int iterations = 100000;
    final static int groupFrom = 10;
    final static int groupTill = 30;

    public static void main(String[] args) {
        for (int i = groupFrom; i < groupTill; i++) {
            int duplicates = 0;
            for (int k = 0; k < iterations; k++) {
                Set<Person> persons = new HashSet<>();
                for (int j = 0; j < i; j++) {
                    persons.add(new Person());
                }
                if (persons.size() != i) duplicates++;

            }
            double chance = (100.0f * duplicates) / iterations;
            System.out.printf("%d :   %.2f  %%%n", i, chance);
        }
    }

}

