package main.homework9.task3;

public class Generator {
    public static int roundRobin = 0;

    static Figure generateFigure() {
        roundRobin %= 6;
        switch (roundRobin++) {
            case 0:
                return new Square();
            case 1:
                return new Circle();
            case 2:
                return new EqualiteralTriangle();
            case 3:
                return new Rectangle();
            case 4:
                return new Ellipse();
            case 5:
                return new RightTriangle();
            default:
                throw new IllegalStateException();
        }

    }
}
