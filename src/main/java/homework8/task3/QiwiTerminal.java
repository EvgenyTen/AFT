package homework8.task3;

public class QiwiTerminal extends Terminal {
    public QiwiTerminal(String adress) {
        super(adress);
        owner = Owner.QIWI;
        commision = 7;
        withoutCommision = 1000;
    }
}
