package homework6.task4;

import java.util.Random;

public class NameGenerator {
    public static String generate() {
        char[] smallLetters = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};
        char[] bigLetters = {'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я'};
        //* генерация размера имени*//
        int nameSize = new Random().nextInt(12) + 5;
        char[] name = new char[nameSize];
        //*генерация первого большого символа*//
        name[0] = bigLetters[new Random().nextInt(32)];
        //* маленькие *//
        for (int i = 1; i < nameSize; i++) {
            name[i] = smallLetters[new Random().nextInt(32)];
        }
        String stringName = new String(name);
        return stringName;
    }
}