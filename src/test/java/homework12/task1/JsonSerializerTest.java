package homework12.task1;

import homework12.task1.helpers.JsonHelper;
import homework12.task1.model.House;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonSerializerTest {
    private final JsonHelper help = new JsonHelper();
    private final String PATH = "src/test/java/homework12/task1/files/expected_json.txt";

    @Test
    @DisplayName("Object Serialization Test")
    void serializationTest() throws IOException {
        House house = new House().generate();
        String actual = help.serialize(house);
        String expected = Files.readAllLines(Paths.get(PATH)).get(0);
        Assertions.assertEquals(expected, actual);
    }
}
