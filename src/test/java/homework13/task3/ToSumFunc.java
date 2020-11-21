package homework13.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ToSumFunc {

    @Test
    @DisplayName("sum test")
    void sumFunc() {
        Assertions.assertEquals(55, Functions.sumFunc.execute(Arrays.asList(1, 2, 3, 4, 5, 10, 9, 8, 7, 6)));
    }
}
