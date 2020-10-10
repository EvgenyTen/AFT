package main.homework6.task2;

public class Chance {
    public static boolean calculateChance(int percent) {
        int receivedValue = percent;
        int calculatedValue = 100 - percent;
        return (receivedValue > calculatedValue) ? true : false;
    }
}
