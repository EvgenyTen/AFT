package main.homework3.task3;

public class Application3 {

    public static void main(String[] args) {
        Human valeriy = new Human("Valeriy", 60, null, null);
        Human aleksandra = new Human("Aleksandra", 58, null, null);
        Human ivan = new Human("Ivan", 58, null, null);
        Human sergey = new Human("Sergey", 31, valeriy, aleksandra);
        Human marina = new Human("Marina", 30, ivan, null);
        Human vitaliy = new Human("Vitaliy", 5, sergey, marina);
        Human elena = new Human("Elena", 11, sergey, marina);
        if (elena.father != null) {
            printInfo(elena.father.father);
            printInfo(elena.father.mother);
        }
        if (elena.mother != null) {
            printInfo(elena.mother.father);
            printInfo(elena.mother.mother);
        }
    }
        static void printInfo(Human human){
        if(human!=null)
            System.out.println("Имя :"+human.name+" Возраст :  "+human.age);
        }
        }






