package main.homework3.task3;

import main.homework3.task2.Cat;

import static java.lang.String.valueOf;

public class Application {

    public static void main(String[] args) {
        Human[] array = {new Human("Vitaliy", 5, "Sergey", "Marina"),
                new Human("Elena", 11, "Sergey", "Marina"),
                new Human("Sergey", 31, "Valeriy", "Aleksandra"),
                new Human("Marina", 30, "Ivan", "null")};
        String[] arrayOfMothers = new String[4];
        String[] arrayOfFathers = new String[4];
        String[] arrayOfParents = new String[arrayOfMothers.length + arrayOfFathers.length];
        int count = 0;
        for (int i = 0; i < array.length; i++) {    //massiv materej
            arrayOfMothers[i] = array[i].mother;
        }
        for (int j = 0; j < array.length; j++) {////massiv otcov
            arrayOfFathers[j] = array[j].father;
        }
        //objedenenie v 1 massiv
        for (int i = 0; i < arrayOfMothers.length; i++) {
            arrayOfParents[i] = arrayOfMothers[i];
            count++;
        }

        for (int j = 0; j < arrayOfFathers.length; j++) {
            arrayOfParents[count++] = arrayOfFathers[j];
        }
        System.out.println("Матери и отцы объеденённые в один массис родителей :");
        for (int z = 0; z < arrayOfParents.length; z++)
            System.out.println(arrayOfParents[z]);


        System.out.println("Бабушки и дедушки: ");
        for (int w=0;w<arrayOfParents.length;w++)
        {for (int y=0;y<array.length;y++){

        if(arrayOfParents[w]=array[y].name)
        {System.out.println(array[y].mother+array[y].father);}
        else return;
        }

    }
}}





