package homework11.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class RandomInteger {
    final int AMOUNT = 10000;

    @Test
    public void numberTest() {
        for (int i = 0; i < AMOUNT; i++) {
            int from = new Random().nextInt(1000);
            int to = 1000 + new Random().nextInt(1000);
            int rand = Generator.randomInteger(from, to);
            Assertions.assertEquals(1000, rand, 1000);
        }
    }
}
