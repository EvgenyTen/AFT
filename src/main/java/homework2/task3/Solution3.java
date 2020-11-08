package homework2.task3;

public class Solution3 {
    public static void main(String[] args) {
        String number = "+7(956)632-10-64";
        Solution3 inst = new Solution3();

        boolean trueFalse = inst.byCycles(number);
        System.out.println(trueFalse);
        boolean match = inst.matcher(number);
        System.out.println(match);
    }

    boolean matcher(String number) {
        return number.matches("^\\+7\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}$");
    }

    boolean byCycles(String number) {
        if (number == null || number.length() != 16)
            return false;

        int[] numIndexes = {3, 4, 5, 7, 8, 9, 11, 12, 14, 15};
        String numericPattern = "0123456789";

        if (!number.startsWith("+7("))
            return false;
        if (number.charAt(6) != ')')
            return false;
        if (number.charAt(10) != '-' || number.charAt(13) != '-')
            return false;
        for (int index : numIndexes) {
            String symbol = String.valueOf(number.charAt(index));
            if (!numericPattern.contains(symbol))
                return false;
        }
        return true;
    }
}