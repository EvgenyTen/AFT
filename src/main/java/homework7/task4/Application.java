package homework7.task4;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        double amount = 300000;
        double rate = 16.9;
        int duration = 12;
        BaseCredit base = new BaseCredit(300000, 16.9, 12);
        BaseCredit different = new DifferentiateCredit(amount, rate, duration);
        BaseCredit annuity = new AnnuityCredit(amount, rate, duration);
        List<Double> baseList = base.getMonthPayments();
        List<Double> differentList = different.getMonthPayments();
        List<Double> annuityList = annuity.getMonthPayments();
        for (int i = 0; i < baseList.size(); i++) {
            System.out.printf("%d:  %.2f   %.2f  %.2f%n  ", (i + 1), baseList.get(i), differentList.get(i), annuityList.get(i));
        }
        System.out.println("Переплата по типам кредита");
        System.out.println(base.calculateOverpayment() + different.calculateOverpayment() + annuity.calculateOverpayment());
    }
}
