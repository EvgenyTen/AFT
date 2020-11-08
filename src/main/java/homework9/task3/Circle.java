package homework9.task3;

public class Circle extends OneParametrFigure {
    @Override
    public double getArea() {
        return Math.PI * parametr * parametr;
    }

    @Override
    public double getLength() {
        return 2 * Math.PI * parametr;
    }
}
