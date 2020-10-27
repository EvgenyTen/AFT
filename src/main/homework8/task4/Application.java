package main.homework8.task4;

import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Entity user = new User("Oleg Petrov", "Manager");
        user.validate();
        Entity user2 = new User("Oleg Ivanoff", "Cleaner");
        user2.validate();
        Entity user3 = new User("Oleg Ivanoff", "Manager");
        user3.validate();
        List<Entity> list = Arrays.asList(
                new Account("RS", "123456777"), new Account("RS", "123456777"), new Account("RS", "1234567778"),
                new Branch("Office", "Voronezh"), new Branch("Office2", "Voronezh2"), new Branch("Office", "Voronezh2"),
                new Client("Terra Incognito", "Msk.Tverstkaya 1"), new Client("Terra Incognito", "Msk.Tverstkaya 1"),
                new Client("Terra Incognito2", "Msk.Tverstkaya 2")
        );
        for (Entity entity : list) entity.validate();
    }
}
