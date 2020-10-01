package main.homework3.task4;

public class Human {
    String name;
    Human[] friends = new Human[7];

    public Human(String name) {
        this.name = name;
    }

    void addFriend(Human friend) {
        int index = 0;
        while (friends[index] != null) {
            if (friends[index] == friend) return;
            index++;
        }
        friends[index] = friend;
        friend.addFriend(this);
    }
}
