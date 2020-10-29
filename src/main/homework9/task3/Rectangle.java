package main.homework9.task3;

public class Rectangle extends TwoParametrFigure{
    @Override
    public double getArea() {
        return parametr*parametr2;
    }

    @Override
    public double getLength() {
        return 2*(parametr+parametr2);
    }
}
