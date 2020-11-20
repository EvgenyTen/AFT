package homework12.task1.helpers;
import com.google.gson.Gson;
import homework12.task1.model.Generatable;

public class JsonHelper implements SerializeHelper {
    @Override
    public Generatable deserialize(String json, Class classx) {return (Generatable)new Gson().fromJson(json, classx);}

    @Override
    public String serialize(homework10.task4.Generatable object) {
        return null;
    }
}
