package homework9.task3;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Figure> list = new ArrayList<>();
        for (int i = 0; i < 18; i++) {
            list.add(Generator.generateFigure());
        }

        for (Figure figure : list) {
            if (list instanceof OneParametrFigure)
                System.out.printf("%s [%d] : Длина - %.1f, Площадь -%.1f.%n",
                        figure.getClass().getSimpleName(), figure.getParametr(), figure.getLength(), figure.getArea());
            if (list instanceof TwoParametrFigure) {
                TwoParametrFigure twoParametr = (TwoParametrFigure) figure;
                System.out.printf("%s [%d , %d] : Длина - %.1f, Площадь -%.1f.%n",
                        figure.getClass().getSimpleName(), figure.getParametr(), ((TwoParametrFigure) figure).getParametr2(), figure.getLength(), figure.getArea());
            }
        }
        for (Figure figure : list) {
            if (figure instanceof RightTriangle) {
                RightTriangle triangle = (RightTriangle) figure;
                System.out.printf("Гипотенуза [%d, %d] равна %.1f.%n", figure.getParametr(), triangle.getParametr2(), triangle.getHypotenuse());
            }
        }

    }
}