package homework12.task1;

import homework12.task1.helpers.JsonHelper;
import homework12.task1.model.Flat;
import homework12.task1.model.House;
import homework12.task1.model.Room;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class XmlDeserializeTest {
    private final JsonHelper help = new JsonHelper();
    private final String ROOM_PATH = "src\\test\\java\\homework12\\task1\\files\\room.json";
    private final String FLAT_PATH = "src\\test\\java\\homework12\\task1\\files\\flat.json";
    private final String HOUSE_PATH = "src\\test\\java\\homework12\\task1\\files\\house.json";

    @Test
    @DisplayName("Room deserialization")
    void deserializationRoomTest() throws IOException {
        String xml = String.join("", Files.readAllLines(Paths.get(ROOM_PATH)));
        Room room = (Room) help.deserialize(xml, Room.class);
        Assertions.assertEquals(4, room.getHeight());
        Assertions.assertEquals(4, room.getWitdh());
    }

    @Test
    @DisplayName("Flat deserialization")
    void deserializationFlatTest() throws IOException {
        String xml = String.join("", Files.readAllLines(Paths.get(FLAT_PATH)));
        Flat flat = (Flat) help.deserialize(xml, Flat.class);
        Assertions.assertEquals(3, flat.getRooms().size());
        Assertions.assertEquals(3, flat.getRooms().get(1).getWitdh());
        Assertions.assertEquals(3, flat.getRooms().get(1).getHeight());
    }

    @Test
    @DisplayName("House deserialization")
    void deserializationHouseTest() throws IOException {
        String xml = String.join("", Files.readAllLines(Paths.get(HOUSE_PATH)));
        House house = (House) help.deserialize(xml, House.class);
        Assertions.assertEquals(4, house.getFlats().size());
        Assertions.assertEquals(4, house.getFlats().get(2).getRooms().get(2).getWitdh());
        Assertions.assertEquals(4, house.getFlats().get(2).getRooms().get(2).getHeight());
    }
}
