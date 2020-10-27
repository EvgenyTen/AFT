package main.homework8.task3;

public abstract class Terminal implements TopUpBalance {
    protected String adress;
    protected double commision;
    protected double withoutCommision;
    protected Owner owner;

    @Override
    public void pay(String phoneNumber, double sumOfMoney) {
        double payment;
        if(sumOfMoney>=withoutCommision) payment=sumOfMoney;
        else payment=sumOfMoney*((100-commision)/100);
        System.out.printf("Внесена сумма %.2f для пополнения тедефона   +%s. Баланс пополнен на сумму %.2f. " +
                "C Уважением , ваш   %s,%s%n",sumOfMoney,phoneNumber,payment,owner.getName(),adress);
    }
    public Terminal(String adress){
        this.adress=adress;
    }
}
