package main.homework8.task3;

public class EleksnetTerminal extends Terminal {
    public EleksnetTerminal(String address) {
        super(address);
        owner = Owner.ELEKSNET;
        commision = 11;
        withoutCommision = 300;
    }
}
