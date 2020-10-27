package main.homework1.task4;

public class metr {
    public static void main(String[] args) {
        metr instance = new metr();
        System.out.println(instance.okruglenie(115));
        System.out.println(instance.okruglenie(800));
        System.out.println(instance.okruglenie(278));
    }

    int okruglenie(int number) {
        return number / 100;
    }
}