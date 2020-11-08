package homework1.task2;

public class Rectangle {
    int width, height;

    public static void main(String[] args) {
        Rectangle instance = new Rectangle();
        instance.height = 6;
        instance.width = 5;
        int square = instance.squareCalculation();
        int perimetr = instance.perimetrCalculation();
        System.out.println("Площадь :" + square);
        System.out.println("Периметр :" + perimetr);
        boolean result = (square > perimetr) ? true : false;
        System.out.println(result);
    }

    int squareCalculation() {
        return width * height;
    }

    int perimetrCalculation() {
        return 2 * (width + height);
    }

}