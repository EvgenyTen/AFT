package main.homework1.task6;

public class Logelementi {

    public static void main(String[] args) {

        Logelementi instance = new Logelementi();
        System.out.println(instance.log(false, false, false, false));
        System.out.println(instance.log(true, true, true, true));
        System.out.println(instance.log(false, true, false, true));
        System.out.println(instance.log(true, false, true, false));
        System.out.println(instance.log(true, true, false, false));
        System.out.println(instance.log(false, false, true, true));
    }

    boolean log(boolean a, boolean b, boolean c, boolean d) {
        return (a && b) && (!(c || d));
    }
}