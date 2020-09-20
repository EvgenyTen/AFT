package main.homework1.task1;

public class Solution {

    public static void main(String[] args)
    {
        Solution instance=new Solution();
        System.out.println(instance.squareCalculation(0));
        System.out.println(instance.squareCalculation(2));
        System.out.println(instance.squareCalculation(100));
    }

        double squareCalculation(int radius) {
        double pi=3.14;
        return pi*radius*radius;
        }

    }

