package main.homework8.task1;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List <Person> humans=new ArrayList<>();
        for(int i=0;i<50;i++){
            humans.add(new Person());
        }
    }
}
