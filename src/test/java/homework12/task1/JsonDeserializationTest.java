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

public class JsonDeserializationTest {
    private final JsonHelper help = new JsonHelper();
    private final String ROOM_PATH = "src\\test\\java\\homework12\\task1\\files\\room.json";
    private final String FLAT_PATH = "src\\test\\java\\homework12\\task1\\files\\flat.json";
    private final String HOUSE_PATH = "src\\test\\java\\homework12\\task1\\files\\house.json";

    @Test
    @DisplayName("Room Deserialization")
    void deserializationRoomTest() throws IOException {
        String json = String.join("", Files.readAllLines(Paths.get(ROOM_PATH)));
        Room room = (Room) help.deserialize(json, Room.class);
        Assertions.assertEquals(6, room.getWitdh());
        Assertions.assertEquals(5, room.getHeight());
    }

    @Test
    @DisplayName("Flate Deserialization")
    void deserializationFlatTest() throws IOException {
        String json = String.join("", Files.readAllLines(Paths.get(FLAT_PATH)));
        Flat flat = (Flat) help.deserialize(json, Flat.class);
        Assertions.assertEquals(4, flat.getRooms().get(0).getWitdh());
        Assertions.assertEquals(3, flat.getRooms().get(0).getHeight());
        Assertions.assertEquals(2, flat.getRooms().get(2).getWitdh());
        Assertions.assertEquals(3, flat.getRooms().get(2).getHeight());
    }

    @Test
    @DisplayName("House Deserialization")
    void deserializationHouseTest() throws IOException {
        String json = String.join("", Files.readAllLines(Paths.get(HOUSE_PATH)));
        House house = (House) help.deserialize(json, House.class);
        Assertions.assertEquals(2, house.getFlats().get(0).getRooms().size());
        Assertions.assertEquals(3, house.getFlats().get(0).getRooms().get(1).getHeight());
        Assertions.assertEquals(3, house.getFlats().get(2).getRooms().get(1).getWitdh());
    }

}
