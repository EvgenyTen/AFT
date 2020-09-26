package main.homework3.task4;

public class Human {
    String name;
    Human[] friends=new Human[7];
    int count=0;
    public Human(String name, Human ...friends) {
        this.name=name;
        this.friends=friends;
        for(Human human:friends){
            friends[count++]=human;
        }
    }
}
