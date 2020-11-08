package homework9.task1;

import java.util.Random;

public class Factory {
    public static Car make() {
        int rand = new Random().nextInt(101);
        if (rand >= 0 && rand < 40) return new Renault();
        else if (rand >= 40 && rand < 70) return new Nissan();
        else if (rand >= 70 && rand < 90) return new Mitsubishi();
        else if (rand >= 90) return new Mersedes();
        return null;
    }
}
