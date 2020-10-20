package main.homework7.task4;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        double amount=300000;
        double rate=16.9;
        int duration=12;
        BaseCredit base=new BaseCredit();
        BaseCredit different=new DifferentiateCredit();
        BaseCredit annuity=new AnnuityCredit();
        List<Double> baseList=base.getMonthPayments(amount,rate,duration);
        List<Double> differentList=different.getMonthPayments(amount, rate, duration);
        List<Double> annuityList=annuity.getMonthPayments(amount, rate, duration);
        for(int i=0;i<baseList.size();i++)
        {
            System.out.println(baseList+""+differentList+"" +annuityList );
        }
        System.out.println ("Переплата по типам кредита");
        System.out.println(base.calculateOverpayment()+different.calculateOverpayment()+ annuity.calculateOverpayment());
    }
}
