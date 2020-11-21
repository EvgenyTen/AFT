package homework13.task1;

import java.util.ArrayList;
import java.util.List;

public class FilterHelper {
    public static List<Integer> filtredIntegers(List<Integer> input,Filter output){
        List<Integer> resultList=new ArrayList<>();
        if(input==null) return null;
        for(Integer current:input){
            if(output.filter(current)) resultList.add(current);
        }
        return resultList;
    }
}
