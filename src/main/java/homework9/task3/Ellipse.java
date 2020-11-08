package homework9.task3;

public class Ellipse extends TwoParametrFigure {
    @Override
    public double getArea() {
        return Math.PI * parametr * parametr2;
    }

    @Override
    public double getLength() {
        double oneMinus2 = parametr - parametr2;
        double oneMinus2In2 = oneMinus2 * oneMinus2;
        double sum = parametr + parametr2;
        double piab = getArea();
        double uppart = 4 * (piab + oneMinus2In2);
        double answer = (4 * uppart) / sum;

        return answer;
    }
}
