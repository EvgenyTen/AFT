package main.homework6.task1;

import java.util.Random;

public class PhoneGenerator {
    public static int generate() {

        int phone=new Random().nextInt(55)+20;
        return phone ;
    }
}
