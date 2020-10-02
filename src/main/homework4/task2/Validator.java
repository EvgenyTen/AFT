package main.homework4.task2;

public class Validator {
    private static final String STRING_FORMAT = "^(\\S+) (\\S+) (\\S+)$";


    public static boolean checkFormat(String inputString) {
        boolean isCorrectFormat = inputString.matches(STRING_FORMAT);
        if (isCorrectFormat = true) {
            System.out.println("Cоответствует формату");
        } else {
            System.out.println("Не соответствует формату");
        }
        return isCorrectFormat;
    }

    public static String[] separation(String string) {
        System.out.println("Строка разделена ");
        return string.split(" ");
    }

    public static boolean isAllFieldsInitialized(Human human) {
        boolean isArrayValid = human.getSurname() != null && human.getName() != null && human.getBirthDate() != null;
        if (isArrayValid = true) {
            System.out.println("Объект валиден");
        } else {
            System.out.println("Объект невалиден");
        }
        return isArrayValid;
    }

    public static boolean isArrayFull(Human[] array) {
        boolean isArrayFull = true;
        for (int i = 0; i < array.length; i++) {
            if (i < (array.length-1)) {
                isArrayFull = false;
                System.out.println("Массив доступен для заполнения");
              break;
            } else {
                System.out.println("Массив полностью заполнен");
            }
        }
        return isArrayFull;
    }
}
