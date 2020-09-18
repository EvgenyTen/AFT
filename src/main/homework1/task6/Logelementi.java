package main.homework1.task6;

public class Logelementi {
    boolean e,f,z;

    public static void main(String[] args)
    {

        Logelementi instance=new Logelementi();
        System.out.println(instance.logili(true,true,false,false));

    }

    boolean  logili(boolean a,boolean b,boolean c,boolean d) {
        e=a&&b;
        f=!(c||d);
        z=e&&f;
        return z;
    }
}