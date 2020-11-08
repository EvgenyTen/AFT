package homework11.task3;

import java.util.Random;

public class Generator {
    public static int randomInteger(int start, int end) {
        int part = new Random().nextInt(end - start + 1);
        int fullnumber = start + part;
        return fullnumber;
    }

    public static String randomString(int startLength, int endLentgh) {
        String pattern = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        int length = new Random().nextInt(endLentgh - startLength + 1) + startLength;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) sb.append(pattern.charAt(new Random().nextInt(pattern.length())));
        return sb.toString();
    }
}
