package main.homework6.task1;

import java.util.Random;

public class PhoneGenerator {

    public static String generate() {
        return String.format("+7(%s)%s-%s-%s", randomNumber(3), randomNumber(3), randomNumber(2), randomNumber(2));
    }

    private static String randomNumber(int length) {
        int[] digitsForNumber = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] series = new int[length];
        for (int i = 0; i < length; i++) {
            series[i] = digitsForNumber[new Random().nextInt(10)];
            ;
        }
        String stringNumber = "";
        for (int value : series) {
            stringNumber = String.format("%s%s", stringNumber, value);
        }
        return stringNumber;
    }
}

