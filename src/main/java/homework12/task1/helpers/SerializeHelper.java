package homework12.task1.helpers;

import homework10.task4.Generatable;

public interface SerializeHelper  <T extends Generatable> {
    T deserialize(String data,Class <T> class);
    String serialize (T object);
}
