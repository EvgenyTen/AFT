package homework12.task1;
import homework12.task1.helpers.XmlHelper;
import homework12.task1.model.House;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.nio.file.Files;

public class XmlSerializeTest {
    private final XmlHelper help=new XmlHelper();
    private final String PATH="src/test/java/homework12/task1/files/expected_xml.txt";

    @Test
    @DisplayName("Object Serialization Test")
    void xmlSerializationTest () throws IOException{
        House house =new House().generate();
        String actual=help.serialize(house);
        String expected= Files.readAllLines(paths.get(PATH)).get(0);
        Assertions.assertEquals(expected,actual);
    }
}
