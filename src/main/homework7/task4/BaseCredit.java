package main.homework7.task4;

import java.util.ArrayList;
import java.util.List;

public class BaseCredit {
    public double amount,rate;
    int duration;


    public List<Double> getMonthPayments(){
        List<Double> paymentsList=new ArrayList<>();
        for (int i=0;i<duration;i++){
            double monthPayment=amount/duration;
            paymentsList.add(monthPayment);
        }
        return paymentsList;
    }
    public Double calculateOverpayment(){
        double overPayment=rate*(amount/duration);
        return overPayment;
    }

}
