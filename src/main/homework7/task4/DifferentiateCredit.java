package main.homework7.task4;

import java.util.ArrayList;
import java.util.List;

public class DifferentiateCredit extends BaseCredit {
    @Override
    public static List<Double> getMonthPayments(){
        List<Double> paymentsList=new ArrayList<>();
        double currentCredit=amount;
        for(int k=0;k<duration;k++){
            Double percents=currentCredit*rate/100/12;
            Double monthlyPayment=amount/duration+percents;
            currentCredit-=(monthlyPayment-percents);
            paymentsList.add(monthlyPayment);
        }
        return paymentsList;
    }
}
