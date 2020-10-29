package main.homework9.task3;

public class RightTriangle extends TwoParametrFigure {

    public double getHypotenuse(){
        return Math.sqrt(parametr*parametr+parametr2*parametr2);
    }
    @Override
    public double getArea() {
        return (parametr*parametr2)/2;
    }

    @Override
    public double getLength() {
        return parametr+parametr2+getHypotenuse();
    }

}
