package main.homework9.task4;

import java.util.ArrayList;
import java.util.List;

public class Cooker {
    public List<Food> foodToCook=new ArrayList<>();
    public int getTotalTime(){
        int totalTime=0;
        for(Food food:foodToCook){
            totalTime+=food.getCookingTime();
        }
        return totalTime;
    }

    public int  getTotalSize() {
        return foodToCook.size();
    }
    public void addFood(Food food){foodToCook.add(food);}
    public void clear() {foodToCook.clear();}
}
