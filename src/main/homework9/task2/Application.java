package main.homework9.task2;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Object> obj = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            obj.add(Generator.generate());
            Action.action(obj);
        }
    }
}