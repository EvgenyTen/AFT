package homework7.task4;

import java.util.ArrayList;
import java.util.List;

public class DifferentiateCredit extends BaseCredit {
    public DifferentiateCredit(double amount, double rate, int duration) {
        super(amount, rate, duration);
    }

    @Override
    public List<Double> getMonthPayments() {
        List<Double> paymentsList = new ArrayList<>();
        double currentCredit = this.amount;
        for (int k = 0; k < this.duration; k++) {
            Double percents = currentCredit * this.rate / 100 / 12;
            Double monthlyPayment = this.amount / this.duration + percents;
            currentCredit -= (monthlyPayment - percents);
            paymentsList.add(monthlyPayment);
        }
        return paymentsList;
    }
}
