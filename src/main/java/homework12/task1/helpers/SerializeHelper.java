package homework12.task1.helpers;

import homework12.task1.model.Generatable;

public interface SerializeHelper  <T extends Generatable> {
    T deserialize(String data, Class <T> classx);
    String serialize (T object);
}
