package main.homework11.task1;

public class Calculator {
    public static int calculate(int... values) {
        int sum = 0;
        for (int val : values) {
            sum += val;
        }
        return sum;
    }

    public static int multiply(int... values) {
        int res = 1;
        for (int val : values) {
            res *= val;
        }
        return res;
    }

}
