package homework12.task1.helpers;
import homework10.task4.Generatable;

public interface SerializeHelper  <T extends Generatable> {
    homework12.task1.model.Generatable deserialize(String data, Class <T> classx);
    String serialize (T object);
}
