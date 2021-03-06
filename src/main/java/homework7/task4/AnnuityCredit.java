package homework7.task4;

import java.util.ArrayList;
import java.util.List;

public class AnnuityCredit extends BaseCredit {
    public AnnuityCredit(double amount, double rate, int duration) {
        super(amount, rate, duration);
    }

    @Override
    public List<Double> getMonthPayments() {
        double ratePerMonth = this.rate / 100 / 12;
        List<Double> paymentsList = new ArrayList<>();
        double monthlyPayment = this.amount * ratePerMonth * Math.pow(1 + ratePerMonth, this.duration) / (Math.pow(1 + ratePerMonth, this.duration) - 1);
        for (int j = 0; j < this.duration; j++) {
            paymentsList.add(monthlyPayment);
        }
        return paymentsList;
    }

}
