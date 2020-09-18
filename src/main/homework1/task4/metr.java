package main.homework1.task4;

public class metr {
    public static void main(String[] args)
    {
     metr instance=new metr();
     System.out.println(instance.okruglenie(220));
    }

    int okruglenie(int number) {
        return number/100;
    }}