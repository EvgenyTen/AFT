package homework6.task1;

import java.util.Random;

public class AgeGenerator {
    public static int generate() {
        int age = new Random().nextInt(55) + 20;
        return age;
    }

}
