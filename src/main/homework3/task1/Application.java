package main.homework3.task1;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Сумма  :" + calculator.summ(4, 2));
        System.out.println("Разность  :" + calculator.substract(5, 3));
        System.out.println("Произведение  :" + calculator.multiply(2, 6));
        System.out.println("Деление  :" + calculator.divide(5, 3));
    }
}
