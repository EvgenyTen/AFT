package homework13.task3;

import java.util.Collections;
import java.util.List;

public class Functions {
    public static final Func<Object,String> toStringFunc=Object::toString;
    public static final Func <List<Integer>,Integer> sumFunc= list->{
        int sum=0;
        for(Integer integer:list) sum+=integer;
        return sum;
    };
    public static final Func<List<Object>,Boolean> onlyEquals=list->{
        if(list.isEmpty()) return true;
        Object object=list.get(0);
        for(Object obj:list)
            if(!obj.equals(object)) return  false;
            return true;
    };
    public static final Func<List<Comparable>,Comparable> maxObj=list->{
        Collections.sort(list);
        Collections.reverse(list);
        return list.get(0);
    };
}
