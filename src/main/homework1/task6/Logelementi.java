package main.homework1.task6;

public class Logelementi {

    public static void main(String[] args)
    {

        Logelementi instance=new Logelementi();
        System.out.println(instance.logili(true,true,false,false));

    }

    boolean  logili(boolean a,boolean b,boolean c,boolean d) {
        return  (a&&b)&&(!(c||d));
    }
}