package main.homework3.task2;

public class Application2 {
    public static void main(String[] args) {
        Cat[] array = {new Cat(2, 5, "Барсик"),
                new Cat(3, 11, "Мурзик"),
                new Cat(7, 2, "Матильда"),
                new Cat(1, 3, "Леопольд"),
                new Cat(11, 4, "Базилио")};

        for (int i = 0; i < 5; i++) {
            int catAge = array[i].age;
            int catWeight = array[i].weight;
            String catName = array[i].name;
            System.out.println("Имя: " + catName + "," + " Возраст: " + catAge + "," + " Вес: " + catWeight);
        }
    }
}
