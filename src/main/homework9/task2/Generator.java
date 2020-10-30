package main.homework9.task2;

public class Generator {
    public static int roundRobin = 0;

    public static Object generate() {
        roundRobin %= 4;
        switch (roundRobin++) {
            case 0:
                return new Circle();
            case 1:
                return new Table();
            case 2:
                return new Box();
            case 3:
                return new Square();
        }
        return null;
    }
}
