package main.homework3.task5;

public class Application5{

    public static void main(String[] args) {
        Human[] humans = new Human[20];
        for (int i = 0; i < humans.length; i++) {
            humans[i] = new Human();
        }

        for (Human human : humans) {
            for (Human otherHuman : humans) {
                if (human != otherHuman && human.cats.length == otherHuman.cats.length && human.dogs.length == otherHuman.dogs.length)
                    System.out.println("У  "+human.name+"  "+ human.cats.length+ "  кошек  "+human.dogs.length+ " собак    ");
            }
        }
    }

}
