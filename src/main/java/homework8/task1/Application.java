package homework8.task1;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        List<Person> humans = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            humans.add(new Person());
        }
        Set<Person> existPersons = new HashSet<>();
        for (int i = 0; i < humans.size(); i++) {
            for (int j = i + 1; j < humans.size(); j++) {
                Person one = humans.get(i);
                Person two = humans.get(j);
                if (one.equals(two)) existPersons.add(one);
            }
        }
        Iterator<Person> iter = existPersons.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        Set<Person> manyPersons = new HashSet<>();
        for (int i = 0; i < 2000; i++) {
            manyPersons.add(new Person());
        }
        System.out.println("Amount: " + manyPersons.size());
    }
}
