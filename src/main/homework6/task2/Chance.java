package main.homework6.task2;

import java.util.Random;

public class Chance {
    public static boolean calculateChance(int percent) {
        int receivedValue = percent;
        int calculatedValue = new Random().nextInt(100);
        return (receivedValue > calculatedValue) ? true : false;
    }
}
