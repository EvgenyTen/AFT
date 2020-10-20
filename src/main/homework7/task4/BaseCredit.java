package main.homework7.task4;

import java.util.ArrayList;
import java.util.List;

public class BaseCredit {
    public double amount,rate;
    int duration;


    public static List<Double> getMonthPayments(){
        List<Double> paymentsList=new ArrayList<>();
        for (int i=0;i<duration;i++){
            double monthPayment=amount/duration;
            paymentsList.add(monthPayment);
        }
        return paymentsList;
    }
    public static Double calculateOverpayment(){
        double overPayment=(rate/100)*(amount/duration);
        return overPayment;
    }

}
