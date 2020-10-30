package main.homework9.task3;

public class Square extends OneParametrFigure {
    @Override
    public double getArea() {
        return parametr * parametr;
    }

    @Override
    public double getLength() {
        return 4 * parametr;
    }
}
