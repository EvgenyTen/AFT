package main.homework7.task4;

import java.util.ArrayList;
import java.util.List;

public class AnnuityCredit extends BaseCredit {

    @Override
    public static List<Double> getMonthPayments(){
        double ratePerMonth=rate/100/12;
        List<Double> paymentsList=new ArrayList<>();
        double monthlyPayment=amount*ratePerMonth*Math.pow(1+ratePerMonth,duration)/(Math.pow(1+ratePerMonth,duration)-1);
        for(int j=0;j<duration;j++){
            paymentsList.add(monthlyPayment);
        }
        return paymentsList;
    }

}
