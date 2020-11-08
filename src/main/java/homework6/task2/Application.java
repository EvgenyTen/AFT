package homework6.task2;

import homework6.task2.generators.HumanGenerator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        //*коллекция сет*//
        Set<Human> humans = new HashSet<>();
        for (int i = 0; i < 2000; i++) {
            humans.add(HumanGenerator.generate());
        }
        //*итератор чтоб не порушить  и гарантировать порядок*//
        Iterator<Human> iterator = humans.iterator();
        while (iterator.hasNext()) {
            Human human = iterator.next();
            Set<PhoneType> phoneTypes = human.getPhones().keySet();
            if (human.getPhones().size() == 3) {
                System.out.printf("Фамилия : %s  Имя: %s , возраст :  %d ,  HOME : %s , WORK: %s , MOBILE : %s%n",
                        human.getSurname(), human.getName(), human.getAge(),
                        human.getPhones().get(PhoneType.HOME), human.getPhones().get(PhoneType.WORK), human.getPhones().get(PhoneType.MOBILE));
            }
            if (human.getPhones().size() >= 1)
                iterator.remove();
        }
        System.out.println("После удаления: " + humans.size());
    }
}

