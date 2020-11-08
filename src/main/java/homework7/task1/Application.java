package homework7.task1;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Integer> test = new MyArrayList<>();
        test.add(1);
        test.add(2);
        test.add(2);
        test.add(1, 7);
        test.contains(4);
        test.contains(50);
        test.size();
        test.get(-50);
    }
}
