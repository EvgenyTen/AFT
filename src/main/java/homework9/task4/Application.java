package homework9.task4;

import java.util.List;
import java.util.Random;

public class Application {
    public static int cookers_amount = new Random().nextInt(6) + 5;
    public static int food_amount = 100;

    public static void main(String[] args) {
        List<Cooker> cookers = Generator.generateCookers(cookers_amount);
        List<Food> foods = Generator.generateFood(food_amount);
        Distributor roundRobin = new RoundRobinDistributor();
        Distributor busyTime = new BusyTimeDistributor();
        for (Food food : foods) {
            roundRobin.addFood(food, cookers);
        }
        int maxTime = 0;
        for (Cooker cooker : cookers) {
            if (maxTime < cooker.getTotalTime()) maxTime = cooker.getTotalTime();
        }
        System.out.println("Суммарное время  " + maxTime);
        for (Cooker cooker : cookers) {
            cooker.clear();
        }
        for (Food food : foods) {
            busyTime.addFood(food, cookers);
        }
        maxTime = 0;
        for (Cooker cooker : cookers) {
            if (maxTime < cooker.getTotalTime()) maxTime = cooker.getTotalTime();
        }
        System.out.println("Суммарное время :" + maxTime);
    }
}