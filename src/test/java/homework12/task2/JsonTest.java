package homework12.task2;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class JsonTest {
    private final String PATH = "src/test/java/homework12/task2/data.xlsx";

    @Test
    @DisplayName("JSON-Users sheet")
    void usersSheetTest() throws IOException {
        String result = Helper.getJsonArrayFromXls(PATH, "users");
        JsonElement element = JsonParser.parseString(result);
        JsonArray array = (JsonArray) element;
        Assertions.assertEquals(4, array.size());
        for (int i = 0; i < array.size(); i++) {
            JsonObject object = array.get(i).getAsJsonObject();
            if (object.get("id").getAsString() == "10") {
                Assertions.assertEquals("api", object.get("action").getAsString());
                Assertions.assertEquals("2020-09-26 23:07:34", object.get("created_on").getAsString());
                Assertions.assertEquals("2020-09-26 23:07:34", object.get("updated_on").getAsString());
                Assertions.assertEquals("6", object.get("user_id").getAsString());
                Assertions.assertEquals("6218bbecc4dec9fce01dd1b7f26cef55e9c4dfb4", object.get("value").getAsString());
            }
        }
    }

    @Test
    @DisplayName("JSON-Projects sheet")
    void projectsSheetTest() throws IOException {
        String result = Helper.getJsonArrayFromXls(PATH, "projects");
        JsonElement element = JsonParser.parseString(result);
        JsonArray array = (JsonArray) element;
        Assertions.assertEquals(4, array.size());
        for (int i = 0; i < array.size(); i++) {
            JsonObject object = array.get(i).getAsJsonObject();
            if (object.get("id").getAsString() == "1") {
                Assertions.assertEquals("Тестовый проект", object.get("name").getAsString());
                Assertions.assertEquals("дескрипшен", object.get("description").getAsString());
                Assertions.assertEquals("нет", object.get("homepage").getAsString());
                Assertions.assertEquals("true", object.get("is_public").getAsString());
            }
        }
    }

    @Test
    @DisplayName("JSON-Roles sheet")
    void rolesSheetTest() throws IOException {
        String result = Helper.getJsonArrayFromXls(PATH, "roles");
        JsonElement element = JsonParser.parseString(result);
        JsonArray array = (JsonArray) element;
        Assertions.assertEquals(3, array.size());
        for (int i = 0; i < array.size(); i++) {
            JsonObject object = array.get(i).getAsJsonObject();
            if (object.get("id").getAsString() == "1") {
                Assertions.assertEquals("Non member", object.get("name").getAsString());
                Assertions.assertEquals("0", object.get("position").getAsString());
                Assertions.assertEquals("true", object.get("is_assignable").getAsString());
                Assertions.assertEquals("1", object.get("builtin").getAsString());
            }
        }
    }
}
