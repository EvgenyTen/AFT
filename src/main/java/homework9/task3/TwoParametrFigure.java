package homework9.task3;

import java.util.Random;

public abstract class TwoParametrFigure extends Figure {
    public int parametr2;

    public TwoParametrFigure() {
        parametr = new Random().nextInt(10) + 1;
        parametr2 = new Random().nextInt(10) + 1;
    }

    public int getParametr2() {
        return parametr2;
    }
}
