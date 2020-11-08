package homework9.task1;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        int premiumCounter = 0;
        int regularCounter = 0;
        int renaultCounter = 0;
        int nissanCounter = 0;
        int mitsubishiCounter = 0;
        int mercedesCounter = 0;
        List<Car> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) list.add(Factory.make());
        for (Car amount : list) {
            if (amount instanceof PremiumType) premiumCounter++;
            if (amount instanceof RegularType) regularCounter++;
            if (amount instanceof Renault) renaultCounter++;
            if (amount instanceof Nissan) nissanCounter++;
            if (amount instanceof Mitsubishi) mitsubishiCounter++;
            if (amount instanceof Mersedes) mercedesCounter++;

        }
        System.out.println("Premium type " + premiumCounter);
        System.out.println("Regular type " + regularCounter);
        System.out.println("Renault   " + renaultCounter);
        System.out.println("Nissan  " + nissanCounter);
        System.out.println("Mitsubishi  " + mitsubishiCounter);
        System.out.println("Mercedes  " + mercedesCounter);


    }
}