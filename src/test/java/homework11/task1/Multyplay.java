package homework11.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Multyplay {
    @Test
    public void multyplay1(){
        int firstValue=3;
        int secondValue=2;
        int result=Calculator.multyplay(firstValue,secondValue);
        Assertions.assertEquals(6,result);

    }

    @Test
    public void multyplay2(){
        int firstValue=1;
        int secondValue=2;
        int thirdValue=3;
        int fourValue=4;
        int fithValue=5;
        int sixValue=6;
        int result=Calculator.multyplay(firstValue,secondValue,thirdValue,fourValue,fithValue,sixValue);
        Assertions.assertEquals(720,result);

    }
}