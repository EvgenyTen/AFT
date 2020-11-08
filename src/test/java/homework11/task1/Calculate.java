package homework11.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Calculate {
    @Test
    public void calculate1() {
        int firstValue = 5;
        int secondValue = 3;
        int result = Calculator.calculate(firstValue, secondValue);
        Assertions.assertEquals(8, result);

    }

    @Test
    public void calculate2() {
        int firstValue = 1;
        int secondValue = 2;
        int thirdValue = 3;
        int fourValue = 4;
        int fithValue = 5;
        int sixValue = 6;
        int result = Calculator.calculate(firstValue, secondValue, thirdValue, fourValue, fithValue, sixValue);
        Assertions.assertEquals(21, result);

    }
}
