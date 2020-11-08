package homework5.task2;

public class Application {
    public static void main(String[] args) {
        Cat cat0 = new Cat("Cat0", 10);
        Cat cat1 = new Cat("Cat1", 5);
        Cat cat3 = new Cat("Cat3", 3);
        Cat cat4 = new Cat("Cat4", 4);
        Cat[] cats = {cat0, cat1, null, cat3, cat4};

        for (int i = 0; i < 5; i++) {
            try {
                System.out.printf("Имя: %s, Возраст: %d%n", cats[i].name, cats[i].age);
            } catch (NullPointerException exception) {
                System.out.println("Один из эементов массива cats равен нулю");
                break;
            }
        }
    }
}
