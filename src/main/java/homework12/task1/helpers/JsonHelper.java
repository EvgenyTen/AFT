package homework12.task1.helpers;

import com.google.gson.Gson;
import homework10.task4.Generatable;

public class JsonHelper implements SerializeHelper {
    @Override
    public Generatable deserialize(String json,Class class) return (Generatable)new Gson().fromJson(json,class);
    @Override
    public String serialize(Generatable object) return new Gson().toJson(object);

}
