package homework13.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class FilterTest {
    @Test
    @DisplayName("Test №1")
    public void testOne(){
        List<Integer> inputList= Arrays.asList(-20,0,4,5,7,9);
        Filter output=variance->variance<5;
        List<Integer> resultList=FilterHelper.filtredIntegers(inputList,output);
        Assertions.assertEquals(resultList,Arrays.asList(-20,0,4));
    }
    @Test
    @DisplayName("Test №2")
    public void testTwo(){
        List<Integer> inputList= Arrays.asList(-20,0,4,5,7,9,10,15,25);
        Filter output=variance->variance>10;
        List<Integer> resultList=FilterHelper.filtredIntegers(inputList,output);
        Assertions.assertEquals(resultList,Arrays.asList(15,25));
    }
    @Test
    @DisplayName("Test №3")
    public void testThree(){
        List<Integer> inputList= Arrays.asList(-20,0,4,5,7,9,10,15,25);
        Filter output=variance->Arrays.asList(-20,4,9,12,15).contains(variance);
        List<Integer> resultList=FilterHelper.filtredIntegers(inputList,output);
        Assertions.assertEquals(resultList,Arrays.asList(-20,4,9,15));
    }
    @Test
    @DisplayName("Test №4")
    public void testFour(){
        List<Integer> inputList= Arrays.asList(-10,-7,5,15,5,-2,4,15);
        Filter output=variance->inputList.indexOf(variance)==inputList.lastIndexOf(variance);
        List<Integer> resultList=FilterHelper.filtredIntegers(inputList,output);
        Assertions.assertEquals(resultList,Arrays.asList(-10,-7,-2,4));
    }

}
