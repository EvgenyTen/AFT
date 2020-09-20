package main.homework1.task5;

public class Solution3 {
    public static void main(String[] args)
    {
        boolean a,b;
        a=false;
        b=false;
        Solution3 instance=new Solution3();
        System.out.println(instance.logili(a,b));
        System.out.println(instance.logi(a,b));
    }

    boolean  logili(boolean a,boolean b) {
        return !(a||b);
    }
    boolean  logi(boolean a,boolean b) {
        return ((!a)&&(!b));
    }
}