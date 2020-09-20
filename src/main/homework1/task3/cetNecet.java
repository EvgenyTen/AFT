package main.homework1.task3;

public class cetNecet {
    public static void main(String[] args)
    {
        cetNecet instance=new cetNecet();
        System.out.println(instance.check(14));
        System.out.println(instance.check(19));
    }

    boolean check(int number) {
        return number%2==0;
}}