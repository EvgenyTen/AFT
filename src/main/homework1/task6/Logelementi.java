package main.homework1.task6;

public class Logelementi {

    public static void main(String[] args)
    {

        Logelementi instance=new Logelementi();
        System.out.println(instance.logili(false,false,false,false));
        System.out.println(instance.logili(true,true,true,true));
        System.out.println(instance.logili(false,true,false,true));
        System.out.println(instance.logili(true,false,true,false));
        System.out.println(instance.logili(true,true,false,false));
        System.out.println(instance.logili(false,false,true,true));
    }

    boolean  logili(boolean a,boolean b,boolean c,boolean d) {
        return (a&&b)&&(!(c||d));
    }
}