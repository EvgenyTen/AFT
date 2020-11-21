package homework13.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MaxObjFunc {
    @Test
    @DisplayName("object-string")
    void maxObjString() {
        Assertions.assertEquals("zvcv", Functions.maxObj.execute(Arrays.asList("abcd", "zvcv", "qwwj")));
    }

    @Test
    @DisplayName("objct-doubles")
    void maxObjDoubles() {
        Assertions.assertEquals(258.15, Functions.maxObj.execute(Arrays.asList("abcd", "zvcv", "qwwj")));
    }
}
