package homework11.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class RandomString {
    final int AMOUNT = 10000;

    @Test
    public void stringsTest() {
        for (int i = 0; i < AMOUNT; i++) {
            int from = new Random().nextInt(20);
            int to = 20 + new Random().nextInt(20);
            String rand = Generator.randomString(from, to);
            Assertions.assertTrue(rand.matches("^[A-Za-z]{0,40}$"));
        }
    }
}
