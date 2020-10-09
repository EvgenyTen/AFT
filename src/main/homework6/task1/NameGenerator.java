package main.homework6.task1;

import java.util.Random;

public class NameGenerator {
    public static int generate() {
        char []smallLetters={'а','б', 'в', 'г', 'д','е','ё','ж','з', 'и','й','к','л','м', 'н', 'о','п', 'р','с','т','у','ф','х','ц','ч','ш','щ','ъ','ы','ь','э','ю', 'я'};
        char[] bigLetters={'А', 'Б','В', 'Г', 'Д','Е', 'Ё', 'Ж','З','И','Й','К','Л','М','Н','О','П','Р','С','Т','У','Ф','Х', 'Ц', 'Ч','Ш', 'Щ','Ъ', 'Ы', 'Ь', 'Э','Ю','Я'};
        int nameSize=new Random().nextInt(12)+5;
        char[] name=new char[nameSize];
        return namSize;
    }
}
