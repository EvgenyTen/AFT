package main.homework8.task3;

public class TinkoffTerminal extends Terminal {

    private double minimalPayment;

    public TinkoffTerminal(String adress) {
        super(adress);
        owner = Owner.TINKOFF;
        commision = 9;
        withoutCommision = 600;
        minimalPayment = 100;
    }

    @Override
    public void pay(String phoneNumber, double sumOfMoney) {
        if(sumOfMoney>=minimalPayment)super.pay(phoneNumber, sumOfMoney);
        else System.out.printf("Минимальная сумма для пополнения 100 рублей.Ваш Тинькофф");
    }
}
