package main.homework2.task4;
import java.util.Arrays;

    public class Check {

        public static void main(String[] args) {
            String first = "hello";
            String second = "world";
            char[] firstAsChars = first.toCharArray();
            Arrays.sort(firstAsChars);
            char[] secondAsChars = second.toCharArray();
            Arrays.sort(secondAsChars);
            String result = "";
            for (char ch : firstAsChars) {
                String symbol = String.valueOf(ch);
                if (result.contains(symbol)) continue;  // Переходим к следующему символу, если он уже есть в итоговой строке
                if (second.contains(symbol)) result += symbol;
            }
            System.out.println(result);
        }
    }

