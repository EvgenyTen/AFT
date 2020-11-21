package homework13.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ModifierTest {

    @Test
    @DisplayName("Boolean")
    void testBoolean() {
        Assertions.assertFalse(Modifiers.invert.modify(true));
        Assertions.assertTrue(Modifiers.invert.modify(false));
    }

    @Test
    @DisplayName("Integer")
    void testInteger() {
        Assertions.assertEquals(5, Modifiers.absolute.modify(5));
        Assertions.assertEquals(5, Modifiers.absolute.modify(-5));
    }

    @Test
    @DisplayName("String")
    void testString() {
        Assertions.assertEquals("abcdef", Modifiers.reverse.modify("fedcba"));
    }
}
