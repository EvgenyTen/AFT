package main.homework7.task4;

import java.util.ArrayList;
import java.util.List;

public class BaseCredit {
    public double amount;
    public double rate;
    int duration;

    public BaseCredit(double amount, double rate, int duration) {
        this.amount = amount;
        this.rate = rate;
        this.duration = duration;

    }


    public List<Double> getMonthPayments() {
        List<Double> paymentsList = new ArrayList<>();
        for (int i = 0; i < this.duration; i++) {
            double monthPayment = this.amount / this.duration;
            paymentsList.add(monthPayment);
        }
        return paymentsList;
    }

    public Double calculateOverpayment() {
        double overPayment = (rate / 100) * (amount / duration);
        return overPayment;
    }

}
