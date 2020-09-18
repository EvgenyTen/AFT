package main.homework1.task1;

public class Solution {
    int radius;
    public static void main(String[] args)
    {
        Solution instance=new Solution();
        System.out.println(instance.squareCalculation(0));
    }

        double squareCalculation(int radius) {
        double pi=3.14;
        return pi*radius*radius;
        }

    }

