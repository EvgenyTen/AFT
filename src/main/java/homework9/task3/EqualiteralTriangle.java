package homework9.task3;

public class EqualiteralTriangle extends OneParametrFigure {
    @Override
    public double getArea() {
        return Math.sqrt(3) * parametr * parametr / 4;
    }

    @Override
    public double getLength() {
        return 3 * parametr;
    }
}
