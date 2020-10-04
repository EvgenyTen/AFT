package main.homework5.task4;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Cat[] cats = new Cat[10];

        for (int i = 0; i < cats.length; i++) {
            try {
                cats[i] = new Cat("Cat", new Random().nextInt(100) - 50);
                System.out.println("Name : " + cats[i].name + ", Age: " + cats[i].age);
            } catch (AgeTooHighException exception) {
                cats[i] = null;
                System.out.println("Too old");
            } finally {
                i++;
            }
        }

        for (int i = 0; i < cats.length; i++) {
            try {

            } catch (NullPointerException npe) {
                System.out.println("Error");
            }
        }
    }

}

